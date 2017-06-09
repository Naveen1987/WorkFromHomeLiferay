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
import com.daffo.wiki_node_tableservice.service.wiki_pagedata_tableLocalServiceUtil;

/**
 * The extended model base implementation for the wiki_pagedata_table service. Represents a row in the &quot;wiki_pagedata_table&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link wiki_pagedata_tableImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see wiki_pagedata_tableImpl
 * @see wiki_pagedata_table
 * @generated
 */
@ProviderType
public abstract class wiki_pagedata_tableBaseImpl
	extends wiki_pagedata_tableModelImpl implements wiki_pagedata_table {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a wiki_pagedata_table model instance should use the {@link wiki_pagedata_table} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			wiki_pagedata_tableLocalServiceUtil.addwiki_pagedata_table(this);
		}
		else {
			wiki_pagedata_tableLocalServiceUtil.updatewiki_pagedata_table(this);
		}
	}
}