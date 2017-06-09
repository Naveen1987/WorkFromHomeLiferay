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
public class wiki_node_tableSoap implements Serializable {
	public static wiki_node_tableSoap toSoapModel(wiki_node_table model) {
		wiki_node_tableSoap soapModel = new wiki_node_tableSoap();

		soapModel.setNodeID(model.getNodeID());
		soapModel.setNodeName(model.getNodeName());
		soapModel.setNodeDescription(model.getNodeDescription());
		soapModel.setNodeCreationDate(model.getNodeCreationDate());
		soapModel.setNodeCreator(model.getNodeCreator());
		soapModel.setNodeModificationDate(model.getNodeModificationDate());

		return soapModel;
	}

	public static wiki_node_tableSoap[] toSoapModels(wiki_node_table[] models) {
		wiki_node_tableSoap[] soapModels = new wiki_node_tableSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static wiki_node_tableSoap[][] toSoapModels(
		wiki_node_table[][] models) {
		wiki_node_tableSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new wiki_node_tableSoap[models.length][models[0].length];
		}
		else {
			soapModels = new wiki_node_tableSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static wiki_node_tableSoap[] toSoapModels(
		List<wiki_node_table> models) {
		List<wiki_node_tableSoap> soapModels = new ArrayList<wiki_node_tableSoap>(models.size());

		for (wiki_node_table model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new wiki_node_tableSoap[soapModels.size()]);
	}

	public wiki_node_tableSoap() {
	}

	public long getPrimaryKey() {
		return _NodeID;
	}

	public void setPrimaryKey(long pk) {
		setNodeID(pk);
	}

	public long getNodeID() {
		return _NodeID;
	}

	public void setNodeID(long NodeID) {
		_NodeID = NodeID;
	}

	public String getNodeName() {
		return _NodeName;
	}

	public void setNodeName(String NodeName) {
		_NodeName = NodeName;
	}

	public String getNodeDescription() {
		return _NodeDescription;
	}

	public void setNodeDescription(String NodeDescription) {
		_NodeDescription = NodeDescription;
	}

	public String getNodeCreationDate() {
		return _NodeCreationDate;
	}

	public void setNodeCreationDate(String NodeCreationDate) {
		_NodeCreationDate = NodeCreationDate;
	}

	public String getNodeCreator() {
		return _NodeCreator;
	}

	public void setNodeCreator(String NodeCreator) {
		_NodeCreator = NodeCreator;
	}

	public String getNodeModificationDate() {
		return _NodeModificationDate;
	}

	public void setNodeModificationDate(String NodeModificationDate) {
		_NodeModificationDate = NodeModificationDate;
	}

	private long _NodeID;
	private String _NodeName;
	private String _NodeDescription;
	private String _NodeCreationDate;
	private String _NodeCreator;
	private String _NodeModificationDate;
}