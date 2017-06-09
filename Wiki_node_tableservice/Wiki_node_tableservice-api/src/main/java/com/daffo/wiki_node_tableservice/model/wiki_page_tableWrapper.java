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
 * This class is a wrapper for {@link wiki_page_table}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see wiki_page_table
 * @generated
 */
@ProviderType
public class wiki_page_tableWrapper implements wiki_page_table,
	ModelWrapper<wiki_page_table> {
	public wiki_page_tableWrapper(wiki_page_table wiki_page_table) {
		_wiki_page_table = wiki_page_table;
	}

	@Override
	public Class<?> getModelClass() {
		return wiki_page_table.class;
	}

	@Override
	public String getModelClassName() {
		return wiki_page_table.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PageID", getPageID());
		attributes.put("PageName", getPageName());
		attributes.put("PageDescription", getPageDescription());
		attributes.put("PageRating", getPageRating());
		attributes.put("PageVersion", getPageVersion());
		attributes.put("NodeID", getNodeID());
		attributes.put("Page_Creation_Date", getPage_Creation_Date());
		attributes.put("Page_creator", getPage_creator());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long PageID = (Long)attributes.get("PageID");

		if (PageID != null) {
			setPageID(PageID);
		}

		String PageName = (String)attributes.get("PageName");

		if (PageName != null) {
			setPageName(PageName);
		}

		String PageDescription = (String)attributes.get("PageDescription");

		if (PageDescription != null) {
			setPageDescription(PageDescription);
		}

		String PageRating = (String)attributes.get("PageRating");

		if (PageRating != null) {
			setPageRating(PageRating);
		}

		String PageVersion = (String)attributes.get("PageVersion");

		if (PageVersion != null) {
			setPageVersion(PageVersion);
		}

		Long NodeID = (Long)attributes.get("NodeID");

		if (NodeID != null) {
			setNodeID(NodeID);
		}

		String Page_Creation_Date = (String)attributes.get("Page_Creation_Date");

		if (Page_Creation_Date != null) {
			setPage_Creation_Date(Page_Creation_Date);
		}

		String Page_creator = (String)attributes.get("Page_creator");

		if (Page_creator != null) {
			setPage_creator(Page_creator);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _wiki_page_table.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _wiki_page_table.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _wiki_page_table.isNew();
	}

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_page_table toEscapedModel() {
		return new wiki_page_tableWrapper(_wiki_page_table.toEscapedModel());
	}

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_page_table toUnescapedModel() {
		return new wiki_page_tableWrapper(_wiki_page_table.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _wiki_page_table.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.daffo.wiki_node_tableservice.model.wiki_page_table> toCacheModel() {
		return _wiki_page_table.toCacheModel();
	}

	@Override
	public int compareTo(
		com.daffo.wiki_node_tableservice.model.wiki_page_table wiki_page_table) {
		return _wiki_page_table.compareTo(wiki_page_table);
	}

	@Override
	public int hashCode() {
		return _wiki_page_table.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _wiki_page_table.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new wiki_page_tableWrapper((wiki_page_table)_wiki_page_table.clone());
	}

	/**
	* Returns the page description of this wiki_page_table.
	*
	* @return the page description of this wiki_page_table
	*/
	@Override
	public java.lang.String getPageDescription() {
		return _wiki_page_table.getPageDescription();
	}

	/**
	* Returns the page name of this wiki_page_table.
	*
	* @return the page name of this wiki_page_table
	*/
	@Override
	public java.lang.String getPageName() {
		return _wiki_page_table.getPageName();
	}

	/**
	* Returns the page rating of this wiki_page_table.
	*
	* @return the page rating of this wiki_page_table
	*/
	@Override
	public java.lang.String getPageRating() {
		return _wiki_page_table.getPageRating();
	}

	/**
	* Returns the page version of this wiki_page_table.
	*
	* @return the page version of this wiki_page_table
	*/
	@Override
	public java.lang.String getPageVersion() {
		return _wiki_page_table.getPageVersion();
	}

	/**
	* Returns the page_ creation_ date of this wiki_page_table.
	*
	* @return the page_ creation_ date of this wiki_page_table
	*/
	@Override
	public java.lang.String getPage_Creation_Date() {
		return _wiki_page_table.getPage_Creation_Date();
	}

	/**
	* Returns the page_creator of this wiki_page_table.
	*
	* @return the page_creator of this wiki_page_table
	*/
	@Override
	public java.lang.String getPage_creator() {
		return _wiki_page_table.getPage_creator();
	}

	@Override
	public java.lang.String toString() {
		return _wiki_page_table.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _wiki_page_table.toXmlString();
	}

	/**
	* Returns the node ID of this wiki_page_table.
	*
	* @return the node ID of this wiki_page_table
	*/
	@Override
	public long getNodeID() {
		return _wiki_page_table.getNodeID();
	}

	/**
	* Returns the page ID of this wiki_page_table.
	*
	* @return the page ID of this wiki_page_table
	*/
	@Override
	public long getPageID() {
		return _wiki_page_table.getPageID();
	}

	/**
	* Returns the primary key of this wiki_page_table.
	*
	* @return the primary key of this wiki_page_table
	*/
	@Override
	public long getPrimaryKey() {
		return _wiki_page_table.getPrimaryKey();
	}

	@Override
	public void persist() {
		_wiki_page_table.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_wiki_page_table.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_wiki_page_table.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_wiki_page_table.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_wiki_page_table.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_wiki_page_table.setNew(n);
	}

	/**
	* Sets the node ID of this wiki_page_table.
	*
	* @param NodeID the node ID of this wiki_page_table
	*/
	@Override
	public void setNodeID(long NodeID) {
		_wiki_page_table.setNodeID(NodeID);
	}

	/**
	* Sets the page description of this wiki_page_table.
	*
	* @param PageDescription the page description of this wiki_page_table
	*/
	@Override
	public void setPageDescription(java.lang.String PageDescription) {
		_wiki_page_table.setPageDescription(PageDescription);
	}

	/**
	* Sets the page ID of this wiki_page_table.
	*
	* @param PageID the page ID of this wiki_page_table
	*/
	@Override
	public void setPageID(long PageID) {
		_wiki_page_table.setPageID(PageID);
	}

	/**
	* Sets the page name of this wiki_page_table.
	*
	* @param PageName the page name of this wiki_page_table
	*/
	@Override
	public void setPageName(java.lang.String PageName) {
		_wiki_page_table.setPageName(PageName);
	}

	/**
	* Sets the page rating of this wiki_page_table.
	*
	* @param PageRating the page rating of this wiki_page_table
	*/
	@Override
	public void setPageRating(java.lang.String PageRating) {
		_wiki_page_table.setPageRating(PageRating);
	}

	/**
	* Sets the page version of this wiki_page_table.
	*
	* @param PageVersion the page version of this wiki_page_table
	*/
	@Override
	public void setPageVersion(java.lang.String PageVersion) {
		_wiki_page_table.setPageVersion(PageVersion);
	}

	/**
	* Sets the page_ creation_ date of this wiki_page_table.
	*
	* @param Page_Creation_Date the page_ creation_ date of this wiki_page_table
	*/
	@Override
	public void setPage_Creation_Date(java.lang.String Page_Creation_Date) {
		_wiki_page_table.setPage_Creation_Date(Page_Creation_Date);
	}

	/**
	* Sets the page_creator of this wiki_page_table.
	*
	* @param Page_creator the page_creator of this wiki_page_table
	*/
	@Override
	public void setPage_creator(java.lang.String Page_creator) {
		_wiki_page_table.setPage_creator(Page_creator);
	}

	/**
	* Sets the primary key of this wiki_page_table.
	*
	* @param primaryKey the primary key of this wiki_page_table
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_wiki_page_table.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_wiki_page_table.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof wiki_page_tableWrapper)) {
			return false;
		}

		wiki_page_tableWrapper wiki_page_tableWrapper = (wiki_page_tableWrapper)obj;

		if (Objects.equals(_wiki_page_table,
					wiki_page_tableWrapper._wiki_page_table)) {
			return true;
		}

		return false;
	}

	@Override
	public wiki_page_table getWrappedModel() {
		return _wiki_page_table;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _wiki_page_table.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _wiki_page_table.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_wiki_page_table.resetOriginalValues();
	}

	private final wiki_page_table _wiki_page_table;
}