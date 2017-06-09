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

import com.daffo.wiki_node_tableservice.model.wiki_pagedata_table;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing wiki_pagedata_table in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see wiki_pagedata_table
 * @generated
 */
@ProviderType
public class wiki_pagedata_tableCacheModel implements CacheModel<wiki_pagedata_table>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof wiki_pagedata_tableCacheModel)) {
			return false;
		}

		wiki_pagedata_tableCacheModel wiki_pagedata_tableCacheModel = (wiki_pagedata_tableCacheModel)obj;

		if (Page_ModID == wiki_pagedata_tableCacheModel.Page_ModID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Page_ModID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{Page_ModID=");
		sb.append(Page_ModID);
		sb.append(", PageData=");
		sb.append(PageData);
		sb.append(", PageEdit_User=");
		sb.append(PageEdit_User);
		sb.append(", Page_editDate=");
		sb.append(Page_editDate);
		sb.append(", Page_Version=");
		sb.append(Page_Version);
		sb.append(", PageID=");
		sb.append(PageID);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public wiki_pagedata_table toEntityModel() {
		wiki_pagedata_tableImpl wiki_pagedata_tableImpl = new wiki_pagedata_tableImpl();

		wiki_pagedata_tableImpl.setPage_ModID(Page_ModID);

		if (PageData == null) {
			wiki_pagedata_tableImpl.setPageData(StringPool.BLANK);
		}
		else {
			wiki_pagedata_tableImpl.setPageData(PageData);
		}

		if (PageEdit_User == null) {
			wiki_pagedata_tableImpl.setPageEdit_User(StringPool.BLANK);
		}
		else {
			wiki_pagedata_tableImpl.setPageEdit_User(PageEdit_User);
		}

		if (Page_editDate == null) {
			wiki_pagedata_tableImpl.setPage_editDate(StringPool.BLANK);
		}
		else {
			wiki_pagedata_tableImpl.setPage_editDate(Page_editDate);
		}

		if (Page_Version == null) {
			wiki_pagedata_tableImpl.setPage_Version(StringPool.BLANK);
		}
		else {
			wiki_pagedata_tableImpl.setPage_Version(Page_Version);
		}

		wiki_pagedata_tableImpl.setPageID(PageID);

		wiki_pagedata_tableImpl.resetOriginalValues();

		return wiki_pagedata_tableImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Page_ModID = objectInput.readLong();
		PageData = objectInput.readUTF();
		PageEdit_User = objectInput.readUTF();
		Page_editDate = objectInput.readUTF();
		Page_Version = objectInput.readUTF();

		PageID = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Page_ModID);

		if (PageData == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PageData);
		}

		if (PageEdit_User == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PageEdit_User);
		}

		if (Page_editDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Page_editDate);
		}

		if (Page_Version == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Page_Version);
		}

		objectOutput.writeLong(PageID);
	}

	public long Page_ModID;
	public String PageData;
	public String PageEdit_User;
	public String Page_editDate;
	public String Page_Version;
	public long PageID;
}