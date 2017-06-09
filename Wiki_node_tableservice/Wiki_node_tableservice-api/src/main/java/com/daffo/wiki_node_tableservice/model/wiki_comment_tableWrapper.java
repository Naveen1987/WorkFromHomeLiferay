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
 * This class is a wrapper for {@link wiki_comment_table}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see wiki_comment_table
 * @generated
 */
@ProviderType
public class wiki_comment_tableWrapper implements wiki_comment_table,
	ModelWrapper<wiki_comment_table> {
	public wiki_comment_tableWrapper(wiki_comment_table wiki_comment_table) {
		_wiki_comment_table = wiki_comment_table;
	}

	@Override
	public Class<?> getModelClass() {
		return wiki_comment_table.class;
	}

	@Override
	public String getModelClassName() {
		return wiki_comment_table.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("comment_ID", getComment_ID());
		attributes.put("Comment_data", getComment_data());
		attributes.put("Comment_User", getComment_User());
		attributes.put("Comment_Date", getComment_Date());
		attributes.put("PageID", getPageID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long comment_ID = (Long)attributes.get("comment_ID");

		if (comment_ID != null) {
			setComment_ID(comment_ID);
		}

		String Comment_data = (String)attributes.get("Comment_data");

		if (Comment_data != null) {
			setComment_data(Comment_data);
		}

		String Comment_User = (String)attributes.get("Comment_User");

		if (Comment_User != null) {
			setComment_User(Comment_User);
		}

		String Comment_Date = (String)attributes.get("Comment_Date");

		if (Comment_Date != null) {
			setComment_Date(Comment_Date);
		}

		Long PageID = (Long)attributes.get("PageID");

		if (PageID != null) {
			setPageID(PageID);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _wiki_comment_table.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _wiki_comment_table.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _wiki_comment_table.isNew();
	}

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_comment_table toEscapedModel() {
		return new wiki_comment_tableWrapper(_wiki_comment_table.toEscapedModel());
	}

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_comment_table toUnescapedModel() {
		return new wiki_comment_tableWrapper(_wiki_comment_table.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _wiki_comment_table.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.daffo.wiki_node_tableservice.model.wiki_comment_table> toCacheModel() {
		return _wiki_comment_table.toCacheModel();
	}

	@Override
	public int compareTo(
		com.daffo.wiki_node_tableservice.model.wiki_comment_table wiki_comment_table) {
		return _wiki_comment_table.compareTo(wiki_comment_table);
	}

	@Override
	public int hashCode() {
		return _wiki_comment_table.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _wiki_comment_table.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new wiki_comment_tableWrapper((wiki_comment_table)_wiki_comment_table.clone());
	}

	/**
	* Returns the comment_ date of this wiki_comment_table.
	*
	* @return the comment_ date of this wiki_comment_table
	*/
	@Override
	public java.lang.String getComment_Date() {
		return _wiki_comment_table.getComment_Date();
	}

	/**
	* Returns the comment_ user of this wiki_comment_table.
	*
	* @return the comment_ user of this wiki_comment_table
	*/
	@Override
	public java.lang.String getComment_User() {
		return _wiki_comment_table.getComment_User();
	}

	/**
	* Returns the comment_data of this wiki_comment_table.
	*
	* @return the comment_data of this wiki_comment_table
	*/
	@Override
	public java.lang.String getComment_data() {
		return _wiki_comment_table.getComment_data();
	}

	@Override
	public java.lang.String toString() {
		return _wiki_comment_table.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _wiki_comment_table.toXmlString();
	}

	/**
	* Returns the comment_id of this wiki_comment_table.
	*
	* @return the comment_id of this wiki_comment_table
	*/
	@Override
	public long getComment_ID() {
		return _wiki_comment_table.getComment_ID();
	}

	/**
	* Returns the page ID of this wiki_comment_table.
	*
	* @return the page ID of this wiki_comment_table
	*/
	@Override
	public long getPageID() {
		return _wiki_comment_table.getPageID();
	}

	/**
	* Returns the primary key of this wiki_comment_table.
	*
	* @return the primary key of this wiki_comment_table
	*/
	@Override
	public long getPrimaryKey() {
		return _wiki_comment_table.getPrimaryKey();
	}

	@Override
	public void persist() {
		_wiki_comment_table.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_wiki_comment_table.setCachedModel(cachedModel);
	}

	/**
	* Sets the comment_ date of this wiki_comment_table.
	*
	* @param Comment_Date the comment_ date of this wiki_comment_table
	*/
	@Override
	public void setComment_Date(java.lang.String Comment_Date) {
		_wiki_comment_table.setComment_Date(Comment_Date);
	}

	/**
	* Sets the comment_id of this wiki_comment_table.
	*
	* @param comment_ID the comment_id of this wiki_comment_table
	*/
	@Override
	public void setComment_ID(long comment_ID) {
		_wiki_comment_table.setComment_ID(comment_ID);
	}

	/**
	* Sets the comment_ user of this wiki_comment_table.
	*
	* @param Comment_User the comment_ user of this wiki_comment_table
	*/
	@Override
	public void setComment_User(java.lang.String Comment_User) {
		_wiki_comment_table.setComment_User(Comment_User);
	}

	/**
	* Sets the comment_data of this wiki_comment_table.
	*
	* @param Comment_data the comment_data of this wiki_comment_table
	*/
	@Override
	public void setComment_data(java.lang.String Comment_data) {
		_wiki_comment_table.setComment_data(Comment_data);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_wiki_comment_table.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_wiki_comment_table.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_wiki_comment_table.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_wiki_comment_table.setNew(n);
	}

	/**
	* Sets the page ID of this wiki_comment_table.
	*
	* @param PageID the page ID of this wiki_comment_table
	*/
	@Override
	public void setPageID(long PageID) {
		_wiki_comment_table.setPageID(PageID);
	}

	/**
	* Sets the primary key of this wiki_comment_table.
	*
	* @param primaryKey the primary key of this wiki_comment_table
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_wiki_comment_table.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_wiki_comment_table.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof wiki_comment_tableWrapper)) {
			return false;
		}

		wiki_comment_tableWrapper wiki_comment_tableWrapper = (wiki_comment_tableWrapper)obj;

		if (Objects.equals(_wiki_comment_table,
					wiki_comment_tableWrapper._wiki_comment_table)) {
			return true;
		}

		return false;
	}

	@Override
	public wiki_comment_table getWrappedModel() {
		return _wiki_comment_table;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _wiki_comment_table.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _wiki_comment_table.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_wiki_comment_table.resetOriginalValues();
	}

	private final wiki_comment_table _wiki_comment_table;
}