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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the wiki_node_table service. Represents a row in the &quot;wiki_node_table&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see wiki_node_tableModel
 * @see com.daffo.wiki_node_tableservice.model.impl.wiki_node_tableImpl
 * @see com.daffo.wiki_node_tableservice.model.impl.wiki_node_tableModelImpl
 * @generated
 */
@ImplementationClassName("com.daffo.wiki_node_tableservice.model.impl.wiki_node_tableImpl")
@ProviderType
public interface wiki_node_table extends wiki_node_tableModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.daffo.wiki_node_tableservice.model.impl.wiki_node_tableImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<wiki_node_table, Long> NODE_ID_ACCESSOR = new Accessor<wiki_node_table, Long>() {
			@Override
			public Long get(wiki_node_table wiki_node_table) {
				return wiki_node_table.getNodeID();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<wiki_node_table> getTypeClass() {
				return wiki_node_table.class;
			}
		};
}