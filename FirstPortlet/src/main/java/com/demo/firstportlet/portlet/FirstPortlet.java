package com.demo.firstportlet.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import com.daffo.wiki_node_tableservice.model.wiki_node_table;
import com.daffo.wiki_node_tableservice.model.wiki_page_table;
import com.daffo.wiki_node_tableservice.model.wiki_pagedata_table;
import com.daffo.wiki_node_tableservice.service.wiki_node_tableLocalServiceUtil;
import com.daffo.wiki_node_tableservice.service.wiki_page_tableLocalServiceUtil;
import com.daffo.wiki_node_tableservice.service.wiki_pagedata_tableLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Administrator
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Naveen Apps",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=FirstPortlet Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FirstPortlet extends MVCPortlet {
	//Start
		@Override
		public void serveResource(ResourceRequest resourceRequest,
				ResourceResponse resourceResponse)
			throws  IOException, PortletException {
			
		switch (resourceRequest.getResourceID()) {
		case "select_wikipage":
		//Start
			if(ParamUtil.getString(resourceRequest, "nodeID").equalsIgnoreCase("-select-")){
				System.out.println("-No Data");
				return;	
			}
		JSONArray pageListJson = JSONFactoryUtil.createJSONArray();
			try {
				String nodeID=ParamUtil.getString(resourceRequest, "data-value");
				long id=new Long(nodeID).longValue();
				List<wiki_page_table> wpt=wiki_page_tableLocalServiceUtil.getwiki_page_tables(0, wiki_page_tableLocalServiceUtil.getwiki_page_tablesCount());
				for(wiki_page_table wp:wpt){
					if(wp.getNodeID()==id){
						JSONObject pageJSON = JSONFactoryUtil.createJSONObject();
						pageJSON.put("pageID",wp.getPageID());
						pageJSON.put("PageName", wp.getPageName());
						 pageListJson.put(pageJSON); 
					}
				}
				System.out.println(pageListJson.toString());
				resourceResponse.getWriter().print(pageListJson.toString());
			} catch (NumberFormatException   e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 
		//End
		break;
		case "load_data":
			//Start
			if(ParamUtil.getString(resourceRequest, "nodeID").equalsIgnoreCase("-select-")||ParamUtil.getString(resourceRequest, "nodeID").equalsIgnoreCase("")||ParamUtil.getString(resourceRequest, "pageID").equalsIgnoreCase("-select-")||ParamUtil.getString(resourceRequest, "nodeID").equalsIgnoreCase("")||ParamUtil.getString(resourceRequest, "pageID").equalsIgnoreCase("")){
				System.out.println("-No Data");
				return;	
			}
			try {
				long nodeID=new Long(ParamUtil.getString(resourceRequest, "nodeID")).longValue();
				long pageID=new Long(ParamUtil.getString(resourceRequest, "pageID")).longValue();
				
				String data="";
				String version="";
				List<wiki_pagedata_table> wpt=wiki_pagedata_tableLocalServiceUtil.getwiki_pagedata_tables(0, wiki_pagedata_tableLocalServiceUtil.getwiki_pagedata_tablesCount());
				long id=0;
				for(wiki_pagedata_table wp:wpt){
					if(wp.getPageID()==pageID){
						if(id<wp.getPage_ModID()){
							data=wp.getPageData();
							version=wp.getPage_Version();
							id=wp.getPage_ModID();
							//System.out.println(data+" "+version);	
						}
				}
				}
				JSONArray pageDataJson = JSONFactoryUtil.createJSONArray();
				JSONObject pageJSON = JSONFactoryUtil.createJSONObject();
				pageJSON.put("version",version);
				pageJSON.put("Pagedata",data);
				pageDataJson.put(pageJSON); 
				System.out.println("Hello-"+data+" "+version);
				resourceResponse.getWriter().print(pageDataJson.toString());
			} catch (NumberFormatException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//End
			break;
		default:
			break;
		}
		}
}