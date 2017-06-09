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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the wiki_comment_table service. Represents a row in the &quot;wiki_comment_table&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.daffo.wiki_node_tableservice.model.impl.wiki_comment_tableModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.daffo.wiki_node_tableservice.model.impl.wiki_comment_tableImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see wiki_comment_table
 * @see com.daffo.wiki_node_tableservice.model.impl.wiki_comment_tableImpl
 * @see com.daffo.wiki_node_tableservice.model.impl.wiki_comment_tableModelImpl
 * @generated
 */
@ProviderType
public interface wiki_comment_tableModel extends BaseModel<wiki_comment_table> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a wiki_comment_table model instance should use the {@link wiki_comment_table} interface instead.
	 */

	/**
	 * Returns the primary key of this wiki_comment_table.
	 *
	 * @return the primary key of this wiki_comment_table
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this wiki_comment_table.
	 *
	 * @param primaryKey the primary key of this wiki_comment_table
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the comment_id of this wiki_comment_table.
	 *
	 * @return the comment_id of this wiki_comment_table
	 */
	public long getComment_ID();

	/**
	 * Sets the comment_id of this wiki_comment_table.
	 *
	 * @param comment_ID the comment_id of this wiki_comment_table
	 */
	public void setComment_ID(long comment_ID);

	/**
	 * Returns the comment_data of this wiki_comment_table.
	 *
	 * @return the comment_data of this wiki_comment_table
	 */
	@AutoEscape
	public String getComment_data();

	/**
	 * Sets the comment_data of this wiki_comment_table.
	 *
	 * @param Comment_data the comment_data of this wiki_comment_table
	 */
	public void setComment_data(String Comment_data);

	/**
	 * Returns the comment_ user of this wiki_comment_table.
	 *
	 * @return the comment_ user of this wiki_comment_table
	 */
	@AutoEscape
	public String getComment_User();

	/**
	 * Sets the comment_ user of this wiki_comment_table.
	 *
	 * @param Comment_User the comment_ user of this wiki_comment_table
	 */
	public void setComment_User(String Comment_User);

	/**
	 * Returns the comment_ date of this wiki_comment_table.
	 *
	 * @return the comment_ date of this wiki_comment_table
	 */
	@AutoEscape
	public String getComment_Date();

	/**
	 * Sets the comment_ date of this wiki_comment_table.
	 *
	 * @param Comment_Date the comment_ date of this wiki_comment_table
	 */
	public void setComment_Date(String Comment_Date);

	/**
	 * Returns the page ID of this wiki_comment_table.
	 *
	 * @return the page ID of this wiki_comment_table
	 */
	public long getPageID();

	/**
	 * Sets the page ID of this wiki_comment_table.
	 *
	 * @param PageID the page ID of this wiki_comment_table
	 */
	public void setPageID(long PageID);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.daffo.wiki_node_tableservice.model.wiki_comment_table wiki_comment_table);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.daffo.wiki_node_tableservice.model.wiki_comment_table> toCacheModel();

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_comment_table toEscapedModel();

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_comment_table toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}