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
 * This class is a wrapper for {@link wiki_pagedata_table}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see wiki_pagedata_table
 * @generated
 */
@ProviderType
public class wiki_pagedata_tableWrapper implements wiki_pagedata_table,
	ModelWrapper<wiki_pagedata_table> {
	public wiki_pagedata_tableWrapper(wiki_pagedata_table wiki_pagedata_table) {
		_wiki_pagedata_table = wiki_pagedata_table;
	}

	@Override
	public Class<?> getModelClass() {
		return wiki_pagedata_table.class;
	}

	@Override
	public String getModelClassName() {
		return wiki_pagedata_table.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Page_ModID", getPage_ModID());
		attributes.put("PageData", getPageData());
		attributes.put("PageEdit_User", getPageEdit_User());
		attributes.put("Page_editDate", getPage_editDate());
		attributes.put("Page_Version", getPage_Version());
		attributes.put("PageID", getPageID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Page_ModID = (Long)attributes.get("Page_ModID");

		if (Page_ModID != null) {
			setPage_ModID(Page_ModID);
		}

		String PageData = (String)attributes.get("PageData");

		if (PageData != null) {
			setPageData(PageData);
		}

		String PageEdit_User = (String)attributes.get("PageEdit_User");

		if (PageEdit_User != null) {
			setPageEdit_User(PageEdit_User);
		}

		String Page_editDate = (String)attributes.get("Page_editDate");

		if (Page_editDate != null) {
			setPage_editDate(Page_editDate);
		}

		String Page_Version = (String)attributes.get("Page_Version");

		if (Page_Version != null) {
			setPage_Version(Page_Version);
		}

		Long PageID = (Long)attributes.get("PageID");

		if (PageID != null) {
			setPageID(PageID);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _wiki_pagedata_table.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _wiki_pagedata_table.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _wiki_pagedata_table.isNew();
	}

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_pagedata_table toEscapedModel() {
		return new wiki_pagedata_tableWrapper(_wiki_pagedata_table.toEscapedModel());
	}

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_pagedata_table toUnescapedModel() {
		return new wiki_pagedata_tableWrapper(_wiki_pagedata_table.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _wiki_pagedata_table.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.daffo.wiki_node_tableservice.model.wiki_pagedata_table> toCacheModel() {
		return _wiki_pagedata_table.toCacheModel();
	}

	@Override
	public int compareTo(
		com.daffo.wiki_node_tableservice.model.wiki_pagedata_table wiki_pagedata_table) {
		return _wiki_pagedata_table.compareTo(wiki_pagedata_table);
	}

	@Override
	public int hashCode() {
		return _wiki_pagedata_table.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _wiki_pagedata_table.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new wiki_pagedata_tableWrapper((wiki_pagedata_table)_wiki_pagedata_table.clone());
	}

	/**
	* Returns the page data of this wiki_pagedata_table.
	*
	* @return the page data of this wiki_pagedata_table
	*/
	@Override
	public java.lang.String getPageData() {
		return _wiki_pagedata_table.getPageData();
	}

	/**
	* Returns the page edit_ user of this wiki_pagedata_table.
	*
	* @return the page edit_ user of this wiki_pagedata_table
	*/
	@Override
	public java.lang.String getPageEdit_User() {
		return _wiki_pagedata_table.getPageEdit_User();
	}

	/**
	* Returns the page_ version of this wiki_pagedata_table.
	*
	* @return the page_ version of this wiki_pagedata_table
	*/
	@Override
	public java.lang.String getPage_Version() {
		return _wiki_pagedata_table.getPage_Version();
	}

	/**
	* Returns the page_edit date of this wiki_pagedata_table.
	*
	* @return the page_edit date of this wiki_pagedata_table
	*/
	@Override
	public java.lang.String getPage_editDate() {
		return _wiki_pagedata_table.getPage_editDate();
	}

	@Override
	public java.lang.String toString() {
		return _wiki_pagedata_table.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _wiki_pagedata_table.toXmlString();
	}

	/**
	* Returns the page ID of this wiki_pagedata_table.
	*
	* @return the page ID of this wiki_pagedata_table
	*/
	@Override
	public long getPageID() {
		return _wiki_pagedata_table.getPageID();
	}

	/**
	* Returns the page_ mod ID of this wiki_pagedata_table.
	*
	* @return the page_ mod ID of this wiki_pagedata_table
	*/
	@Override
	public long getPage_ModID() {
		return _wiki_pagedata_table.getPage_ModID();
	}

	/**
	* Returns the primary key of this wiki_pagedata_table.
	*
	* @return the primary key of this wiki_pagedata_table
	*/
	@Override
	public long getPrimaryKey() {
		return _wiki_pagedata_table.getPrimaryKey();
	}

	@Override
	public void persist() {
		_wiki_pagedata_table.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_wiki_pagedata_table.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_wiki_pagedata_table.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_wiki_pagedata_table.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_wiki_pagedata_table.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_wiki_pagedata_table.setNew(n);
	}

	/**
	* Sets the page data of this wiki_pagedata_table.
	*
	* @param PageData the page data of this wiki_pagedata_table
	*/
	@Override
	public void setPageData(java.lang.String PageData) {
		_wiki_pagedata_table.setPageData(PageData);
	}

	/**
	* Sets the page edit_ user of this wiki_pagedata_table.
	*
	* @param PageEdit_User the page edit_ user of this wiki_pagedata_table
	*/
	@Override
	public void setPageEdit_User(java.lang.String PageEdit_User) {
		_wiki_pagedata_table.setPageEdit_User(PageEdit_User);
	}

	/**
	* Sets the page ID of this wiki_pagedata_table.
	*
	* @param PageID the page ID of this wiki_pagedata_table
	*/
	@Override
	public void setPageID(long PageID) {
		_wiki_pagedata_table.setPageID(PageID);
	}

	/**
	* Sets the page_ mod ID of this wiki_pagedata_table.
	*
	* @param Page_ModID the page_ mod ID of this wiki_pagedata_table
	*/
	@Override
	public void setPage_ModID(long Page_ModID) {
		_wiki_pagedata_table.setPage_ModID(Page_ModID);
	}

	/**
	* Sets the page_ version of this wiki_pagedata_table.
	*
	* @param Page_Version the page_ version of this wiki_pagedata_table
	*/
	@Override
	public void setPage_Version(java.lang.String Page_Version) {
		_wiki_pagedata_table.setPage_Version(Page_Version);
	}

	/**
	* Sets the page_edit date of this wiki_pagedata_table.
	*
	* @param Page_editDate the page_edit date of this wiki_pagedata_table
	*/
	@Override
	public void setPage_editDate(java.lang.String Page_editDate) {
		_wiki_pagedata_table.setPage_editDate(Page_editDate);
	}

	/**
	* Sets the primary key of this wiki_pagedata_table.
	*
	* @param primaryKey the primary key of this wiki_pagedata_table
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_wiki_pagedata_table.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_wiki_pagedata_table.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof wiki_pagedata_tableWrapper)) {
			return false;
		}

		wiki_pagedata_tableWrapper wiki_pagedata_tableWrapper = (wiki_pagedata_tableWrapper)obj;

		if (Objects.equals(_wiki_pagedata_table,
					wiki_pagedata_tableWrapper._wiki_pagedata_table)) {
			return true;
		}

		return false;
	}

	@Override
	public wiki_pagedata_table getWrappedModel() {
		return _wiki_pagedata_table;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _wiki_pagedata_table.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _wiki_pagedata_table.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_wiki_pagedata_table.resetOriginalValues();
	}

	private final wiki_pagedata_table _wiki_pagedata_table;
}