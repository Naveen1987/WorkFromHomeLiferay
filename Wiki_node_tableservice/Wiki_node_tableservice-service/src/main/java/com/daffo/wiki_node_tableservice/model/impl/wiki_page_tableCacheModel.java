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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing wiki_page_table in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see wiki_page_table
 * @generated
 */
@ProviderType
public class wiki_page_tableCacheModel implements CacheModel<wiki_page_table>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof wiki_page_tableCacheModel)) {
			return false;
		}

		wiki_page_tableCacheModel wiki_page_tableCacheModel = (wiki_page_tableCacheModel)obj;

		if (PageID == wiki_page_tableCacheModel.PageID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, PageID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{PageID=");
		sb.append(PageID);
		sb.append(", PageName=");
		sb.append(PageName);
		sb.append(", PageDescription=");
		sb.append(PageDescription);
		sb.append(", PageRating=");
		sb.append(PageRating);
		sb.append(", PageVersion=");
		sb.append(PageVersion);
		sb.append(", NodeID=");
		sb.append(NodeID);
		sb.append(", Page_Creation_Date=");
		sb.append(Page_Creation_Date);
		sb.append(", Page_creator=");
		sb.append(Page_creator);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public wiki_page_table toEntityModel() {
		wiki_page_tableImpl wiki_page_tableImpl = new wiki_page_tableImpl();

		wiki_page_tableImpl.setPageID(PageID);

		if (PageName == null) {
			wiki_page_tableImpl.setPageName(StringPool.BLANK);
		}
		else {
			wiki_page_tableImpl.setPageName(PageName);
		}

		if (PageDescription == null) {
			wiki_page_tableImpl.setPageDescription(StringPool.BLANK);
		}
		else {
			wiki_page_tableImpl.setPageDescription(PageDescription);
		}

		if (PageRating == null) {
			wiki_page_tableImpl.setPageRating(StringPool.BLANK);
		}
		else {
			wiki_page_tableImpl.setPageRating(PageRating);
		}

		if (PageVersion == null) {
			wiki_page_tableImpl.setPageVersion(StringPool.BLANK);
		}
		else {
			wiki_page_tableImpl.setPageVersion(PageVersion);
		}

		wiki_page_tableImpl.setNodeID(NodeID);

		if (Page_Creation_Date == null) {
			wiki_page_tableImpl.setPage_Creation_Date(StringPool.BLANK);
		}
		else {
			wiki_page_tableImpl.setPage_Creation_Date(Page_Creation_Date);
		}

		if (Page_creator == null) {
			wiki_page_tableImpl.setPage_creator(StringPool.BLANK);
		}
		else {
			wiki_page_tableImpl.setPage_creator(Page_creator);
		}

		wiki_page_tableImpl.resetOriginalValues();

		return wiki_page_tableImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		PageID = objectInput.readLong();
		PageName = objectInput.readUTF();
		PageDescription = objectInput.readUTF();
		PageRating = objectInput.readUTF();
		PageVersion = objectInput.readUTF();

		NodeID = objectInput.readLong();
		Page_Creation_Date = objectInput.readUTF();
		Page_creator = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(PageID);

		if (PageName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PageName);
		}

		if (PageDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PageDescription);
		}

		if (PageRating == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PageRating);
		}

		if (PageVersion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PageVersion);
		}

		objectOutput.writeLong(NodeID);

		if (Page_Creation_Date == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Page_Creation_Date);
		}

		if (Page_creator == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Page_creator);
		}
	}

	public long PageID;
	public String PageName;
	public String PageDescription;
	public String PageRating;
	public String PageVersion;
	public long NodeID;
	public String Page_Creation_Date;
	public String Page_creator;
}