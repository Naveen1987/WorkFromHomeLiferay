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
public class wiki_pagedata_tableSoap implements Serializable {
	public static wiki_pagedata_tableSoap toSoapModel(wiki_pagedata_table model) {
		wiki_pagedata_tableSoap soapModel = new wiki_pagedata_tableSoap();

		soapModel.setPage_ModID(model.getPage_ModID());
		soapModel.setPageData(model.getPageData());
		soapModel.setPageEdit_User(model.getPageEdit_User());
		soapModel.setPage_editDate(model.getPage_editDate());
		soapModel.setPage_Version(model.getPage_Version());
		soapModel.setPageID(model.getPageID());

		return soapModel;
	}

	public static wiki_pagedata_tableSoap[] toSoapModels(
		wiki_pagedata_table[] models) {
		wiki_pagedata_tableSoap[] soapModels = new wiki_pagedata_tableSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static wiki_pagedata_tableSoap[][] toSoapModels(
		wiki_pagedata_table[][] models) {
		wiki_pagedata_tableSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new wiki_pagedata_tableSoap[models.length][models[0].length];
		}
		else {
			soapModels = new wiki_pagedata_tableSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static wiki_pagedata_tableSoap[] toSoapModels(
		List<wiki_pagedata_table> models) {
		List<wiki_pagedata_tableSoap> soapModels = new ArrayList<wiki_pagedata_tableSoap>(models.size());

		for (wiki_pagedata_table model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new wiki_pagedata_tableSoap[soapModels.size()]);
	}

	public wiki_pagedata_tableSoap() {
	}

	public long getPrimaryKey() {
		return _Page_ModID;
	}

	public void setPrimaryKey(long pk) {
		setPage_ModID(pk);
	}

	public long getPage_ModID() {
		return _Page_ModID;
	}

	public void setPage_ModID(long Page_ModID) {
		_Page_ModID = Page_ModID;
	}

	public String getPageData() {
		return _PageData;
	}

	public void setPageData(String PageData) {
		_PageData = PageData;
	}

	public String getPageEdit_User() {
		return _PageEdit_User;
	}

	public void setPageEdit_User(String PageEdit_User) {
		_PageEdit_User = PageEdit_User;
	}

	public String getPage_editDate() {
		return _Page_editDate;
	}

	public void setPage_editDate(String Page_editDate) {
		_Page_editDate = Page_editDate;
	}

	public String getPage_Version() {
		return _Page_Version;
	}

	public void setPage_Version(String Page_Version) {
		_Page_Version = Page_Version;
	}

	public long getPageID() {
		return _PageID;
	}

	public void setPageID(long PageID) {
		_PageID = PageID;
	}

	private long _Page_ModID;
	private String _PageData;
	private String _PageEdit_User;
	private String _Page_editDate;
	private String _Page_Version;
	private long _PageID;
}