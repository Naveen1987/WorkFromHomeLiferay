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

import com.daffo.wiki_node_tableservice.model.wiki_comment_table;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing wiki_comment_table in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see wiki_comment_table
 * @generated
 */
@ProviderType
public class wiki_comment_tableCacheModel implements CacheModel<wiki_comment_table>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof wiki_comment_tableCacheModel)) {
			return false;
		}

		wiki_comment_tableCacheModel wiki_comment_tableCacheModel = (wiki_comment_tableCacheModel)obj;

		if (comment_ID == wiki_comment_tableCacheModel.comment_ID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, comment_ID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{comment_ID=");
		sb.append(comment_ID);
		sb.append(", Comment_data=");
		sb.append(Comment_data);
		sb.append(", Comment_User=");
		sb.append(Comment_User);
		sb.append(", Comment_Date=");
		sb.append(Comment_Date);
		sb.append(", PageID=");
		sb.append(PageID);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public wiki_comment_table toEntityModel() {
		wiki_comment_tableImpl wiki_comment_tableImpl = new wiki_comment_tableImpl();

		wiki_comment_tableImpl.setComment_ID(comment_ID);

		if (Comment_data == null) {
			wiki_comment_tableImpl.setComment_data(StringPool.BLANK);
		}
		else {
			wiki_comment_tableImpl.setComment_data(Comment_data);
		}

		if (Comment_User == null) {
			wiki_comment_tableImpl.setComment_User(StringPool.BLANK);
		}
		else {
			wiki_comment_tableImpl.setComment_User(Comment_User);
		}

		if (Comment_Date == null) {
			wiki_comment_tableImpl.setComment_Date(StringPool.BLANK);
		}
		else {
			wiki_comment_tableImpl.setComment_Date(Comment_Date);
		}

		wiki_comment_tableImpl.setPageID(PageID);

		wiki_comment_tableImpl.resetOriginalValues();

		return wiki_comment_tableImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		comment_ID = objectInput.readLong();
		Comment_data = objectInput.readUTF();
		Comment_User = objectInput.readUTF();
		Comment_Date = objectInput.readUTF();

		PageID = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(comment_ID);

		if (Comment_data == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Comment_data);
		}

		if (Comment_User == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Comment_User);
		}

		if (Comment_Date == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Comment_Date);
		}

		objectOutput.writeLong(PageID);
	}

	public long comment_ID;
	public String Comment_data;
	public String Comment_User;
	public String Comment_Date;
	public long PageID;
}