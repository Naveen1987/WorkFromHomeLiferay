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
public class wiki_comment_tableSoap implements Serializable {
	public static wiki_comment_tableSoap toSoapModel(wiki_comment_table model) {
		wiki_comment_tableSoap soapModel = new wiki_comment_tableSoap();

		soapModel.setComment_ID(model.getComment_ID());
		soapModel.setComment_data(model.getComment_data());
		soapModel.setComment_User(model.getComment_User());
		soapModel.setComment_Date(model.getComment_Date());
		soapModel.setPageID(model.getPageID());

		return soapModel;
	}

	public static wiki_comment_tableSoap[] toSoapModels(
		wiki_comment_table[] models) {
		wiki_comment_tableSoap[] soapModels = new wiki_comment_tableSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static wiki_comment_tableSoap[][] toSoapModels(
		wiki_comment_table[][] models) {
		wiki_comment_tableSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new wiki_comment_tableSoap[models.length][models[0].length];
		}
		else {
			soapModels = new wiki_comment_tableSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static wiki_comment_tableSoap[] toSoapModels(
		List<wiki_comment_table> models) {
		List<wiki_comment_tableSoap> soapModels = new ArrayList<wiki_comment_tableSoap>(models.size());

		for (wiki_comment_table model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new wiki_comment_tableSoap[soapModels.size()]);
	}

	public wiki_comment_tableSoap() {
	}

	public long getPrimaryKey() {
		return _comment_ID;
	}

	public void setPrimaryKey(long pk) {
		setComment_ID(pk);
	}

	public long getComment_ID() {
		return _comment_ID;
	}

	public void setComment_ID(long comment_ID) {
		_comment_ID = comment_ID;
	}

	public String getComment_data() {
		return _Comment_data;
	}

	public void setComment_data(String Comment_data) {
		_Comment_data = Comment_data;
	}

	public String getComment_User() {
		return _Comment_User;
	}

	public void setComment_User(String Comment_User) {
		_Comment_User = Comment_User;
	}

	public String getComment_Date() {
		return _Comment_Date;
	}

	public void setComment_Date(String Comment_Date) {
		_Comment_Date = Comment_Date;
	}

	public long getPageID() {
		return _PageID;
	}

	public void setPageID(long PageID) {
		_PageID = PageID;
	}

	private long _comment_ID;
	private String _Comment_data;
	private String _Comment_User;
	private String _Comment_Date;
	private long _PageID;
}