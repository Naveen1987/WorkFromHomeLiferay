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
 * The base model interface for the wiki_pagedata_table service. Represents a row in the &quot;wiki_pagedata_table&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.daffo.wiki_node_tableservice.model.impl.wiki_pagedata_tableModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.daffo.wiki_node_tableservice.model.impl.wiki_pagedata_tableImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see wiki_pagedata_table
 * @see com.daffo.wiki_node_tableservice.model.impl.wiki_pagedata_tableImpl
 * @see com.daffo.wiki_node_tableservice.model.impl.wiki_pagedata_tableModelImpl
 * @generated
 */
@ProviderType
public interface wiki_pagedata_tableModel extends BaseModel<wiki_pagedata_table> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a wiki_pagedata_table model instance should use the {@link wiki_pagedata_table} interface instead.
	 */

	/**
	 * Returns the primary key of this wiki_pagedata_table.
	 *
	 * @return the primary key of this wiki_pagedata_table
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this wiki_pagedata_table.
	 *
	 * @param primaryKey the primary key of this wiki_pagedata_table
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the page_ mod ID of this wiki_pagedata_table.
	 *
	 * @return the page_ mod ID of this wiki_pagedata_table
	 */
	public long getPage_ModID();

	/**
	 * Sets the page_ mod ID of this wiki_pagedata_table.
	 *
	 * @param Page_ModID the page_ mod ID of this wiki_pagedata_table
	 */
	public void setPage_ModID(long Page_ModID);

	/**
	 * Returns the page data of this wiki_pagedata_table.
	 *
	 * @return the page data of this wiki_pagedata_table
	 */
	@AutoEscape
	public String getPageData();

	/**
	 * Sets the page data of this wiki_pagedata_table.
	 *
	 * @param PageData the page data of this wiki_pagedata_table
	 */
	public void setPageData(String PageData);

	/**
	 * Returns the page edit_ user of this wiki_pagedata_table.
	 *
	 * @return the page edit_ user of this wiki_pagedata_table
	 */
	@AutoEscape
	public String getPageEdit_User();

	/**
	 * Sets the page edit_ user of this wiki_pagedata_table.
	 *
	 * @param PageEdit_User the page edit_ user of this wiki_pagedata_table
	 */
	public void setPageEdit_User(String PageEdit_User);

	/**
	 * Returns the page_edit date of this wiki_pagedata_table.
	 *
	 * @return the page_edit date of this wiki_pagedata_table
	 */
	@AutoEscape
	public String getPage_editDate();

	/**
	 * Sets the page_edit date of this wiki_pagedata_table.
	 *
	 * @param Page_editDate the page_edit date of this wiki_pagedata_table
	 */
	public void setPage_editDate(String Page_editDate);

	/**
	 * Returns the page_ version of this wiki_pagedata_table.
	 *
	 * @return the page_ version of this wiki_pagedata_table
	 */
	@AutoEscape
	public String getPage_Version();

	/**
	 * Sets the page_ version of this wiki_pagedata_table.
	 *
	 * @param Page_Version the page_ version of this wiki_pagedata_table
	 */
	public void setPage_Version(String Page_Version);

	/**
	 * Returns the page ID of this wiki_pagedata_table.
	 *
	 * @return the page ID of this wiki_pagedata_table
	 */
	public long getPageID();

	/**
	 * Sets the page ID of this wiki_pagedata_table.
	 *
	 * @param PageID the page ID of this wiki_pagedata_table
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
		com.daffo.wiki_node_tableservice.model.wiki_pagedata_table wiki_pagedata_table);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.daffo.wiki_node_tableservice.model.wiki_pagedata_table> toCacheModel();

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_pagedata_table toEscapedModel();

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_pagedata_table toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}