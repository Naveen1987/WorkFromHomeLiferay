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

import com.daffo.wiki_node_tableservice.model.wiki_node_table;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing wiki_node_table in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see wiki_node_table
 * @generated
 */
@ProviderType
public class wiki_node_tableCacheModel implements CacheModel<wiki_node_table>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof wiki_node_tableCacheModel)) {
			return false;
		}

		wiki_node_tableCacheModel wiki_node_tableCacheModel = (wiki_node_tableCacheModel)obj;

		if (NodeID == wiki_node_tableCacheModel.NodeID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, NodeID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{NodeID=");
		sb.append(NodeID);
		sb.append(", NodeName=");
		sb.append(NodeName);
		sb.append(", NodeDescription=");
		sb.append(NodeDescription);
		sb.append(", NodeCreationDate=");
		sb.append(NodeCreationDate);
		sb.append(", NodeCreator=");
		sb.append(NodeCreator);
		sb.append(", NodeModificationDate=");
		sb.append(NodeModificationDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public wiki_node_table toEntityModel() {
		wiki_node_tableImpl wiki_node_tableImpl = new wiki_node_tableImpl();

		wiki_node_tableImpl.setNodeID(NodeID);

		if (NodeName == null) {
			wiki_node_tableImpl.setNodeName(StringPool.BLANK);
		}
		else {
			wiki_node_tableImpl.setNodeName(NodeName);
		}

		if (NodeDescription == null) {
			wiki_node_tableImpl.setNodeDescription(StringPool.BLANK);
		}
		else {
			wiki_node_tableImpl.setNodeDescription(NodeDescription);
		}

		if (NodeCreationDate == null) {
			wiki_node_tableImpl.setNodeCreationDate(StringPool.BLANK);
		}
		else {
			wiki_node_tableImpl.setNodeCreationDate(NodeCreationDate);
		}

		if (NodeCreator == null) {
			wiki_node_tableImpl.setNodeCreator(StringPool.BLANK);
		}
		else {
			wiki_node_tableImpl.setNodeCreator(NodeCreator);
		}

		if (NodeModificationDate == null) {
			wiki_node_tableImpl.setNodeModificationDate(StringPool.BLANK);
		}
		else {
			wiki_node_tableImpl.setNodeModificationDate(NodeModificationDate);
		}

		wiki_node_tableImpl.resetOriginalValues();

		return wiki_node_tableImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		NodeID = objectInput.readLong();
		NodeName = objectInput.readUTF();
		NodeDescription = objectInput.readUTF();
		NodeCreationDate = objectInput.readUTF();
		NodeCreator = objectInput.readUTF();
		NodeModificationDate = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(NodeID);

		if (NodeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NodeName);
		}

		if (NodeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NodeDescription);
		}

		if (NodeCreationDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NodeCreationDate);
		}

		if (NodeCreator == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NodeCreator);
		}

		if (NodeModificationDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NodeModificationDate);
		}
	}

	public long NodeID;
	public String NodeName;
	public String NodeDescription;
	public String NodeCreationDate;
	public String NodeCreator;
	public String NodeModificationDate;
}