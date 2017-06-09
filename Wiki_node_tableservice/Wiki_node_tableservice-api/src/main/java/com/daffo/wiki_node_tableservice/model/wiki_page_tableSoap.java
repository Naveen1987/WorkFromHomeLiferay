/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.daffo.wiki_node_tableservice.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class wiki_page_tableSoap implements Serializable {
	public static wiki_page_tableSoap toSoapModel(wiki_page_table model) {
		wiki_page_tableSoap soapModel = new wiki_page_tableSoap();

		soapModel.setPageID(model.getPageID());
		soapModel.setPageName(model.getPageName());
		soapModel.setPageDescription(model.getPageDescription());
		soapModel.setPageRating(model.getPageRating());
		soapModel.setPageVersion(model.getPageVersion());
		soapModel.setNodeID(model.getNodeID());
		soapModel.setPage_Creation_Date(model.getPage_Creation_Date());
		soapModel.setPage_creator(model.getPage_creator());

		return soapModel;
	}

	public static wiki_page_tableSoap[] toSoapModels(wiki_page_table[] models) {
		wiki_page_tableSoap[] soapModels = new wiki_page_tableSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static wiki_page_tableSoap[][] toSoapModels(
		wiki_page_table[][] models) {
		wiki_page_tableSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new wiki_page_tableSoap[models.length][models[0].length];
		}
		else {
			soapModels = new wiki_page_tableSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static wiki_page_tableSoap[] toSoapModels(
		List<wiki_page_table> models) {
		List<wiki_page_tableSoap> soapModels = new ArrayList<wiki_page_tableSoap>(models.size());

		for (wiki_page_table model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new wiki_page_tableSoap[soapModels.size()]);
	}

	public wiki_page_tableSoap() {
	}

	public long getPrimaryKey() {
		return _PageID;
	}

	public void setPrimaryKey(long pk) {
		setPageID(pk);
	}

	public long getPageID() {
		return _PageID;
	}

	public void setPageID(long PageID) {
		_PageID = PageID;
	}

	public String getPageName() {
		return _PageName;
	}

	public void setPageName(String PageName) {
		_PageName = PageName;
	}

	public String getPageDescription() {
		return _PageDescription;
	}

	public void setPageDescription(String PageDescription) {
		_PageDescription = PageDescription;
	}

	public String getPageRating() {
		return _PageRating;
	}

	public void setPageRating(String PageRating) {
		_PageRating = PageRating;
	}

	public String getPageVersion() {
		return _PageVersion;
	}

	public void setPageVersion(String PageVersion) {
		_PageVersion = PageVersion;
	}

	public long getNodeID() {
		return _NodeID;
	}

	public void setNodeID(long NodeID) {
		_NodeID = NodeID;
	}

	public String getPage_Creation_Date() {
		return _Page_Creation_Date;
	}

	public void setPage_Creation_Date(String Page_Creation_Date) {
		_Page_Creation_Date = Page_Creation_Date;
	}

	public String getPage_creator() {
		return _Page_creator;
	}

	public void setPage_creator(String Page_creator) {
		_Page_creator = Page_creator;
	}

	private long _PageID;
	private String _PageName;
	private String _PageDescription;
	private String _PageRating;
	private String _PageVersion;
	private long _NodeID;
	private String _Page_Creation_Date;
	private String _Page_creator;
}