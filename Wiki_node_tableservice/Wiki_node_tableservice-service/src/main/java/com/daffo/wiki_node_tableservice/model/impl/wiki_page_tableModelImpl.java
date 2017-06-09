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

package com.daffo.wiki_node_tableservice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.daffo.wiki_node_tableservice.model.wiki_page_table;
import com.daffo.wiki_node_tableservice.model.wiki_page_tableModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the wiki_page_table service. Represents a row in the &quot;wiki_page_table&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link wiki_page_tableModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link wiki_page_tableImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see wiki_page_tableImpl
 * @see wiki_page_table
 * @see wiki_page_tableModel
 * @generated
 */
@ProviderType
public class wiki_page_tableModelImpl extends BaseModelImpl<wiki_page_table>
	implements wiki_page_tableModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a wiki_page_table model instance should use the {@link wiki_page_table} interface instead.
	 */
	public static final String TABLE_NAME = "wiki_page_table";
	public static final Object[][] TABLE_COLUMNS = {
			{ "PageID", Types.BIGINT },
			{ "PageName", Types.VARCHAR },
			{ "PageDescription", Types.VARCHAR },
			{ "PageRating", Types.VARCHAR },
			{ "PageVersion", Types.VARCHAR },
			{ "NodeID", Types.BIGINT },
			{ "Page_Creation_Date", Types.VARCHAR },
			{ "Page_creator", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("PageID", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("PageName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("PageDescription", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("PageRating", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("PageVersion", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("NodeID", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("Page_Creation_Date", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("Page_creator", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table wiki_page_table (PageID LONG not null primary key,PageName VARCHAR(75) null,PageDescription VARCHAR(75) null,PageRating VARCHAR(75) null,PageVersion VARCHAR(75) null,NodeID LONG,Page_Creation_Date VARCHAR(75) null,Page_creator VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table wiki_page_table";
	public static final String ORDER_BY_JPQL = " ORDER BY wiki_page_table.PageID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY wiki_page_table.PageID ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.daffo.wiki_node_tableservice.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.daffo.wiki_node_tableservice.model.wiki_page_table"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.daffo.wiki_node_tableservice.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.daffo.wiki_node_tableservice.model.wiki_page_table"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.daffo.wiki_node_tableservice.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.daffo.wiki_node_tableservice.model.wiki_page_table"),
			true);
	public static final long NODEID_COLUMN_BITMASK = 1L;
	public static final long PAGEID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.daffo.wiki_node_tableservice.service.util.ServiceProps.get(
				"lock.expiration.time.com.daffo.wiki_node_tableservice.model.wiki_page_table"));

	public wiki_page_tableModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _PageID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPageID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PageID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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
	public long getPageID() {
		return _PageID;
	}

	@Override
	public void setPageID(long PageID) {
		_PageID = PageID;
	}

	@Override
	public String getPageName() {
		if (_PageName == null) {
			return StringPool.BLANK;
		}
		else {
			return _PageName;
		}
	}

	@Override
	public void setPageName(String PageName) {
		_PageName = PageName;
	}

	@Override
	public String getPageDescription() {
		if (_PageDescription == null) {
			return StringPool.BLANK;
		}
		else {
			return _PageDescription;
		}
	}

	@Override
	public void setPageDescription(String PageDescription) {
		_PageDescription = PageDescription;
	}

	@Override
	public String getPageRating() {
		if (_PageRating == null) {
			return StringPool.BLANK;
		}
		else {
			return _PageRating;
		}
	}

	@Override
	public void setPageRating(String PageRating) {
		_PageRating = PageRating;
	}

	@Override
	public String getPageVersion() {
		if (_PageVersion == null) {
			return StringPool.BLANK;
		}
		else {
			return _PageVersion;
		}
	}

	@Override
	public void setPageVersion(String PageVersion) {
		_PageVersion = PageVersion;
	}

	@Override
	public long getNodeID() {
		return _NodeID;
	}

	@Override
	public void setNodeID(long NodeID) {
		_columnBitmask |= NODEID_COLUMN_BITMASK;

		if (!_setOriginalNodeID) {
			_setOriginalNodeID = true;

			_originalNodeID = _NodeID;
		}

		_NodeID = NodeID;
	}

	public long getOriginalNodeID() {
		return _originalNodeID;
	}

	@Override
	public String getPage_Creation_Date() {
		if (_Page_Creation_Date == null) {
			return StringPool.BLANK;
		}
		else {
			return _Page_Creation_Date;
		}
	}

	@Override
	public void setPage_Creation_Date(String Page_Creation_Date) {
		_Page_Creation_Date = Page_Creation_Date;
	}

	@Override
	public String getPage_creator() {
		if (_Page_creator == null) {
			return StringPool.BLANK;
		}
		else {
			return _Page_creator;
		}
	}

	@Override
	public void setPage_creator(String Page_creator) {
		_Page_creator = Page_creator;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			wiki_page_table.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public wiki_page_table toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (wiki_page_table)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		wiki_page_tableImpl wiki_page_tableImpl = new wiki_page_tableImpl();

		wiki_page_tableImpl.setPageID(getPageID());
		wiki_page_tableImpl.setPageName(getPageName());
		wiki_page_tableImpl.setPageDescription(getPageDescription());
		wiki_page_tableImpl.setPageRating(getPageRating());
		wiki_page_tableImpl.setPageVersion(getPageVersion());
		wiki_page_tableImpl.setNodeID(getNodeID());
		wiki_page_tableImpl.setPage_Creation_Date(getPage_Creation_Date());
		wiki_page_tableImpl.setPage_creator(getPage_creator());

		wiki_page_tableImpl.resetOriginalValues();

		return wiki_page_tableImpl;
	}

	@Override
	public int compareTo(wiki_page_table wiki_page_table) {
		long primaryKey = wiki_page_table.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof wiki_page_table)) {
			return false;
		}

		wiki_page_table wiki_page_table = (wiki_page_table)obj;

		long primaryKey = wiki_page_table.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		wiki_page_tableModelImpl wiki_page_tableModelImpl = this;

		wiki_page_tableModelImpl._originalNodeID = wiki_page_tableModelImpl._NodeID;

		wiki_page_tableModelImpl._setOriginalNodeID = false;

		wiki_page_tableModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<wiki_page_table> toCacheModel() {
		wiki_page_tableCacheModel wiki_page_tableCacheModel = new wiki_page_tableCacheModel();

		wiki_page_tableCacheModel.PageID = getPageID();

		wiki_page_tableCacheModel.PageName = getPageName();

		String PageName = wiki_page_tableCacheModel.PageName;

		if ((PageName != null) && (PageName.length() == 0)) {
			wiki_page_tableCacheModel.PageName = null;
		}

		wiki_page_tableCacheModel.PageDescription = getPageDescription();

		String PageDescription = wiki_page_tableCacheModel.PageDescription;

		if ((PageDescription != null) && (PageDescription.length() == 0)) {
			wiki_page_tableCacheModel.PageDescription = null;
		}

		wiki_page_tableCacheModel.PageRating = getPageRating();

		String PageRating = wiki_page_tableCacheModel.PageRating;

		if ((PageRating != null) && (PageRating.length() == 0)) {
			wiki_page_tableCacheModel.PageRating = null;
		}

		wiki_page_tableCacheModel.PageVersion = getPageVersion();

		String PageVersion = wiki_page_tableCacheModel.PageVersion;

		if ((PageVersion != null) && (PageVersion.length() == 0)) {
			wiki_page_tableCacheModel.PageVersion = null;
		}

		wiki_page_tableCacheModel.NodeID = getNodeID();

		wiki_page_tableCacheModel.Page_Creation_Date = getPage_Creation_Date();

		String Page_Creation_Date = wiki_page_tableCacheModel.Page_Creation_Date;

		if ((Page_Creation_Date != null) && (Page_Creation_Date.length() == 0)) {
			wiki_page_tableCacheModel.Page_Creation_Date = null;
		}

		wiki_page_tableCacheModel.Page_creator = getPage_creator();

		String Page_creator = wiki_page_tableCacheModel.Page_creator;

		if ((Page_creator != null) && (Page_creator.length() == 0)) {
			wiki_page_tableCacheModel.Page_creator = null;
		}

		return wiki_page_tableCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{PageID=");
		sb.append(getPageID());
		sb.append(", PageName=");
		sb.append(getPageName());
		sb.append(", PageDescription=");
		sb.append(getPageDescription());
		sb.append(", PageRating=");
		sb.append(getPageRating());
		sb.append(", PageVersion=");
		sb.append(getPageVersion());
		sb.append(", NodeID=");
		sb.append(getNodeID());
		sb.append(", Page_Creation_Date=");
		sb.append(getPage_Creation_Date());
		sb.append(", Page_creator=");
		sb.append(getPage_creator());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.daffo.wiki_node_tableservice.model.wiki_page_table");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PageID</column-name><column-value><![CDATA[");
		sb.append(getPageID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PageName</column-name><column-value><![CDATA[");
		sb.append(getPageName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PageDescription</column-name><column-value><![CDATA[");
		sb.append(getPageDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PageRating</column-name><column-value><![CDATA[");
		sb.append(getPageRating());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PageVersion</column-name><column-value><![CDATA[");
		sb.append(getPageVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NodeID</column-name><column-value><![CDATA[");
		sb.append(getNodeID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Page_Creation_Date</column-name><column-value><![CDATA[");
		sb.append(getPage_Creation_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Page_creator</column-name><column-value><![CDATA[");
		sb.append(getPage_creator());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = wiki_page_table.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			wiki_page_table.class
		};
	private long _PageID;
	private String _PageName;
	private String _PageDescription;
	private String _PageRating;
	private String _PageVersion;
	private long _NodeID;
	private long _originalNodeID;
	private boolean _setOriginalNodeID;
	private String _Page_Creation_Date;
	private String _Page_creator;
	private long _columnBitmask;
	private wiki_page_table _escapedModel;
}