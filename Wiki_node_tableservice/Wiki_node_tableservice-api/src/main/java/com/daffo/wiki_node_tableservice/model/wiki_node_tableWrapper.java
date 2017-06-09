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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link wiki_node_table}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see wiki_node_table
 * @generated
 */
@ProviderType
public class wiki_node_tableWrapper implements wiki_node_table,
	ModelWrapper<wiki_node_table> {
	public wiki_node_tableWrapper(wiki_node_table wiki_node_table) {
		_wiki_node_table = wiki_node_table;
	}

	@Override
	public Class<?> getModelClass() {
		return wiki_node_table.class;
	}

	@Override
	public String getModelClassName() {
		return wiki_node_table.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("NodeID", getNodeID());
		attributes.put("NodeName", getNodeName());
		attributes.put("NodeDescription", getNodeDescription());
		attributes.put("NodeCreationDate", getNodeCreationDate());
		attributes.put("NodeCreator", getNodeCreator());
		attributes.put("NodeModificationDate", getNodeModificationDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long NodeID = (Long)attributes.get("NodeID");

		if (NodeID != null) {
			setNodeID(NodeID);
		}

		String NodeName = (String)attributes.get("NodeName");

		if (NodeName != null) {
			setNodeName(NodeName);
		}

		String NodeDescription = (String)attributes.get("NodeDescription");

		if (NodeDescription != null) {
			setNodeDescription(NodeDescription);
		}

		String NodeCreationDate = (String)attributes.get("NodeCreationDate");

		if (NodeCreationDate != null) {
			setNodeCreationDate(NodeCreationDate);
		}

		String NodeCreator = (String)attributes.get("NodeCreator");

		if (NodeCreator != null) {
			setNodeCreator(NodeCreator);
		}

		String NodeModificationDate = (String)attributes.get(
				"NodeModificationDate");

		if (NodeModificationDate != null) {
			setNodeModificationDate(NodeModificationDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _wiki_node_table.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _wiki_node_table.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _wiki_node_table.isNew();
	}

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_node_table toEscapedModel() {
		return new wiki_node_tableWrapper(_wiki_node_table.toEscapedModel());
	}

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_node_table toUnescapedModel() {
		return new wiki_node_tableWrapper(_wiki_node_table.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _wiki_node_table.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.daffo.wiki_node_tableservice.model.wiki_node_table> toCacheModel() {
		return _wiki_node_table.toCacheModel();
	}

	@Override
	public int compareTo(
		com.daffo.wiki_node_tableservice.model.wiki_node_table wiki_node_table) {
		return _wiki_node_table.compareTo(wiki_node_table);
	}

	@Override
	public int hashCode() {
		return _wiki_node_table.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _wiki_node_table.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new wiki_node_tableWrapper((wiki_node_table)_wiki_node_table.clone());
	}

	/**
	* Returns the node creation date of this wiki_node_table.
	*
	* @return the node creation date of this wiki_node_table
	*/
	@Override
	public java.lang.String getNodeCreationDate() {
		return _wiki_node_table.getNodeCreationDate();
	}

	/**
	* Returns the node creator of this wiki_node_table.
	*
	* @return the node creator of this wiki_node_table
	*/
	@Override
	public java.lang.String getNodeCreator() {
		return _wiki_node_table.getNodeCreator();
	}

	/**
	* Returns the node description of this wiki_node_table.
	*
	* @return the node description of this wiki_node_table
	*/
	@Override
	public java.lang.String getNodeDescription() {
		return _wiki_node_table.getNodeDescription();
	}

	/**
	* Returns the node modification date of this wiki_node_table.
	*
	* @return the node modification date of this wiki_node_table
	*/
	@Override
	public java.lang.String getNodeModificationDate() {
		return _wiki_node_table.getNodeModificationDate();
	}

	/**
	* Returns the node name of this wiki_node_table.
	*
	* @return the node name of this wiki_node_table
	*/
	@Override
	public java.lang.String getNodeName() {
		return _wiki_node_table.getNodeName();
	}

	@Override
	public java.lang.String toString() {
		return _wiki_node_table.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _wiki_node_table.toXmlString();
	}

	/**
	* Returns the node ID of this wiki_node_table.
	*
	* @return the node ID of this wiki_node_table
	*/
	@Override
	public long getNodeID() {
		return _wiki_node_table.getNodeID();
	}

	/**
	* Returns the primary key of this wiki_node_table.
	*
	* @return the primary key of this wiki_node_table
	*/
	@Override
	public long getPrimaryKey() {
		return _wiki_node_table.getPrimaryKey();
	}

	@Override
	public void persist() {
		_wiki_node_table.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_wiki_node_table.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_wiki_node_table.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_wiki_node_table.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_wiki_node_table.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_wiki_node_table.setNew(n);
	}

	/**
	* Sets the node creation date of this wiki_node_table.
	*
	* @param NodeCreationDate the node creation date of this wiki_node_table
	*/
	@Override
	public void setNodeCreationDate(java.lang.String NodeCreationDate) {
		_wiki_node_table.setNodeCreationDate(NodeCreationDate);
	}

	/**
	* Sets the node creator of this wiki_node_table.
	*
	* @param NodeCreator the node creator of this wiki_node_table
	*/
	@Override
	public void setNodeCreator(java.lang.String NodeCreator) {
		_wiki_node_table.setNodeCreator(NodeCreator);
	}

	/**
	* Sets the node description of this wiki_node_table.
	*
	* @param NodeDescription the node description of this wiki_node_table
	*/
	@Override
	public void setNodeDescription(java.lang.String NodeDescription) {
		_wiki_node_table.setNodeDescription(NodeDescription);
	}

	/**
	* Sets the node ID of this wiki_node_table.
	*
	* @param NodeID the node ID of this wiki_node_table
	*/
	@Override
	public void setNodeID(long NodeID) {
		_wiki_node_table.setNodeID(NodeID);
	}

	/**
	* Sets the node modification date of this wiki_node_table.
	*
	* @param NodeModificationDate the node modification date of this wiki_node_table
	*/
	@Override
	public void setNodeModificationDate(java.lang.String NodeModificationDate) {
		_wiki_node_table.setNodeModificationDate(NodeModificationDate);
	}

	/**
	* Sets the node name of this wiki_node_table.
	*
	* @param NodeName the node name of this wiki_node_table
	*/
	@Override
	public void setNodeName(java.lang.String NodeName) {
		_wiki_node_table.setNodeName(NodeName);
	}

	/**
	* Sets the primary key of this wiki_node_table.
	*
	* @param primaryKey the primary key of this wiki_node_table
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_wiki_node_table.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_wiki_node_table.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof wiki_node_tableWrapper)) {
			return false;
		}

		wiki_node_tableWrapper wiki_node_tableWrapper = (wiki_node_tableWrapper)obj;

		if (Objects.equals(_wiki_node_table,
					wiki_node_tableWrapper._wiki_node_table)) {
			return true;
		}

		return false;
	}

	@Override
	public wiki_node_table getWrappedModel() {
		return _wiki_node_table;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _wiki_node_table.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _wiki_node_table.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_wiki_node_table.resetOriginalValues();
	}

	private final wiki_node_table _wiki_node_table;
}