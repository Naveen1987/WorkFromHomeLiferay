package com.demo.firstportlet.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserServiceUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import com.daffo.wiki_node_tableservice.model.wiki_node_table;
import com.daffo.wiki_node_tableservice.model.wiki_page_table;
import com.daffo.wiki_node_tableservice.model.wiki_pagedata_table;
import com.daffo.wiki_node_tableservice.service.wiki_node_tableLocalServiceUtil;
import com.daffo.wiki_node_tableservice.service.wiki_page_tableLocalServiceUtil;
import com.daffo.wiki_node_tableservice.service.wiki_pagedata_tableLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
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
			String remoteUserId = resourceRequest.getRemoteUser();
			
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
			
		case "save_data":
			//Start
			try {
				User user = UserServiceUtil.getUserById(Long.parseLong(remoteUserId));
//				System.out.println(user.getFullName());
				long nodeID=new Long(ParamUtil.getString(resourceRequest, "node")).longValue();
				long pageID=new Long(ParamUtil.getString(resourceRequest, "selectpage")).longValue();
				String version=ParamUtil.getString(resourceRequest, "version");
				String data=ParamUtil.getString(resourceRequest, "data-value");
				 wiki_pagedata_table wpt=wiki_pagedata_tableLocalServiceUtil.createwiki_pagedata_table(CounterLocalServiceUtil.increment());
				wpt.setPage_Version(version);
				wpt.setPageData(data);			
				Calendar calendar = new GregorianCalendar();
				calendar.setTime(new Date());
				int year = calendar.get(Calendar.YEAR);
				//Add one to month {0 - 11}
				int month = calendar.get(Calendar.MONTH)+1;
				int day = calendar.get(Calendar.DAY_OF_MONTH);
				wpt.setPage_editDate(month+"/"+day+"/"+year);
				wpt.setPageID(pageID);
				wpt.setPageEdit_User(user.getFullName());
				wiki_pagedata_tableLocalServiceUtil.addwiki_pagedata_table(wpt);
				JSONArray pageDataJson = JSONFactoryUtil.createJSONArray();
				JSONObject pageJSON = JSONFactoryUtil.createJSONObject();
				pageJSON.put("version",version);
				pageJSON.put("msg","SuccessFully Submited");
				pageDataJson.put(pageJSON); 
				resourceResponse.getWriter().print(pageDataJson.toString());
			} catch (NumberFormatException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			//end
			break;
		case "newWikiNode":
			//start
			try {
				User user = UserServiceUtil.getUserById(Long.parseLong(remoteUserId));
				System.out.println(ParamUtil.getString(resourceRequest, "NodeName"));
				System.out.println(ParamUtil.getString(resourceRequest, "NodeDescription"));
				if(nodeDuplicateTesting(ParamUtil.getString(resourceRequest, "NodeName"))){
					JSONArray pageDataJson = JSONFactoryUtil.createJSONArray();
					JSONObject pageJSON = JSONFactoryUtil.createJSONObject();
					pageJSON.put("msg","Sorry! You Node is exists");
					pageDataJson.put(pageJSON); 
					resourceResponse.getWriter().print(pageDataJson.toString());
					return;
				}
				wiki_node_table wnt=wiki_node_tableLocalServiceUtil.createwiki_node_table(CounterLocalServiceUtil.increment());
				wnt.setNodeName(ParamUtil.getString(resourceRequest, "NodeName"));
				wnt.setNodeDescription(ParamUtil.getString(resourceRequest, "NodeDescription"));
				wnt.setNodeCreator(user.getFullName());
				Calendar calendar = new GregorianCalendar();
				calendar.setTime(new Date());
				int year = calendar.get(Calendar.YEAR);
				//Add one to month {0 - 11}
				int month = calendar.get(Calendar.MONTH)+1;
				int day = calendar.get(Calendar.DAY_OF_MONTH);
				wnt.setNodeCreationDate(month+"/"+day+"/"+year);
				wiki_node_tableLocalServiceUtil.addwiki_node_table(wnt);
				JSONArray pageDataJson = JSONFactoryUtil.createJSONArray();
				JSONObject pageJSON = JSONFactoryUtil.createJSONObject();
				pageJSON.put("msg","SuccessFully Added new Node");
				pageDataJson.put(pageJSON); 
				resourceResponse.getWriter().print(pageDataJson.toString());
			} catch (NumberFormatException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			//end
			break;
		case "newWikipage":
			//start
			try {
				User user = UserServiceUtil.getUserById(Long.parseLong(remoteUserId));
				System.out.println(ParamUtil.getString(resourceRequest, "NodeID"));
				System.out.println(ParamUtil.getString(resourceRequest, "pageName"));
				System.out.println(ParamUtil.getString(resourceRequest, "pageDescription"));
				if(pageduplicateTesting(ParamUtil.getString(resourceRequest, "pageName"), ParamUtil.getString(resourceRequest, "NodeID"))){
					JSONArray pageDataJson = JSONFactoryUtil.createJSONArray();
					JSONObject pageJSON = JSONFactoryUtil.createJSONObject();
					pageJSON.put("msg","Sorry! You page is exists");
					pageDataJson.put(pageJSON); 
					resourceResponse.getWriter().print(pageDataJson.toString());
					return;
				}
				wiki_page_table wpt=wiki_page_tableLocalServiceUtil.createwiki_page_table(CounterLocalServiceUtil.increment());
				wpt.setNodeID(new Long(ParamUtil.getString(resourceRequest, "NodeID")).longValue());
				wpt.setPageName(ParamUtil.getString(resourceRequest, "pageName"));
				wpt.setPageDescription(ParamUtil.getString(resourceRequest, "pageDescription"));
				wpt.setPage_creator(user.getFullName());
				Calendar calendar = new GregorianCalendar();
				calendar.setTime(new Date());
				int year = calendar.get(Calendar.YEAR);
				//Add one to month {0 - 11}
				int month = calendar.get(Calendar.MONTH)+1;
				int day = calendar.get(Calendar.DAY_OF_MONTH);
				wpt.setPage_Creation_Date(month+"/"+day+"/"+year);
				wiki_page_tableLocalServiceUtil.addwiki_page_table(wpt);
				JSONArray pageDataJson = JSONFactoryUtil.createJSONArray();
				JSONObject pageJSON = JSONFactoryUtil.createJSONObject();
				pageJSON.put("msg","SuccessFully Added new Page");
				pageDataJson.put(pageJSON); 
				resourceResponse.getWriter().print(pageDataJson.toString());
			} catch (NumberFormatException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			//end
			break;
			
		default:
			break;
		}
		}
		
		private boolean pageduplicateTesting(String page,String nodeid){
			List<wiki_page_table>wpt=wiki_page_tableLocalServiceUtil.getwiki_page_tables(0, wiki_page_tableLocalServiceUtil.getwiki_page_tablesCount());
			for(wiki_page_table wp:wpt){
				if(wp.getPageName().equalsIgnoreCase(page)&&wp.getNodeID()==new Long(nodeid).longValue())
				{
					return true;
				}
			}
			return false;
		}
		
		private boolean nodeDuplicateTesting(String Node){
			List<wiki_node_table> wnt=wiki_node_tableLocalServiceUtil.getwiki_node_tables(0, wiki_node_tableLocalServiceUtil.getwiki_node_tablesCount());
			for(wiki_node_table wp:wnt){
				if(wp.getNodeName().equalsIgnoreCase(Node))
				{
					return true;
				}
			}
			return false;
		}
		
}