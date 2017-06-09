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

package com.daffo.wiki_node_tableservice.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.daffo.wiki_node_tableservice.exception.NoSuchwiki_node_tableException;
import com.daffo.wiki_node_tableservice.model.wiki_node_table;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the wiki_node_table service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.daffo.wiki_node_tableservice.service.persistence.impl.wiki_node_tablePersistenceImpl
 * @see wiki_node_tableUtil
 * @generated
 */
@ProviderType
public interface wiki_node_tablePersistence extends BasePersistence<wiki_node_table> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link wiki_node_tableUtil} to access the wiki_node_table persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the wiki_node_table in the entity cache if it is enabled.
	*
	* @param wiki_node_table the wiki_node_table
	*/
	public void cacheResult(wiki_node_table wiki_node_table);

	/**
	* Caches the wiki_node_tables in the entity cache if it is enabled.
	*
	* @param wiki_node_tables the wiki_node_tables
	*/
	public void cacheResult(java.util.List<wiki_node_table> wiki_node_tables);

	/**
	* Creates a new wiki_node_table with the primary key. Does not add the wiki_node_table to the database.
	*
	* @param NodeID the primary key for the new wiki_node_table
	* @return the new wiki_node_table
	*/
	public wiki_node_table create(long NodeID);

	/**
	* Removes the wiki_node_table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param NodeID the primary key of the wiki_node_table
	* @return the wiki_node_table that was removed
	* @throws NoSuchwiki_node_tableException if a wiki_node_table with the primary key could not be found
	*/
	public wiki_node_table remove(long NodeID)
		throws NoSuchwiki_node_tableException;

	public wiki_node_table updateImpl(wiki_node_table wiki_node_table);

	/**
	* Returns the wiki_node_table with the primary key or throws a {@link NoSuchwiki_node_tableException} if it could not be found.
	*
	* @param NodeID the primary key of the wiki_node_table
	* @return the wiki_node_table
	* @throws NoSuchwiki_node_tableException if a wiki_node_table with the primary key could not be found
	*/
	public wiki_node_table findByPrimaryKey(long NodeID)
		throws NoSuchwiki_node_tableException;

	/**
	* Returns the wiki_node_table with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param NodeID the primary key of the wiki_node_table
	* @return the wiki_node_table, or <code>null</code> if a wiki_node_table with the primary key could not be found
	*/
	public wiki_node_table fetchByPrimaryKey(long NodeID);

	@Override
	public java.util.Map<java.io.Serializable, wiki_node_table> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the wiki_node_tables.
	*
	* @return the wiki_node_tables
	*/
	public java.util.List<wiki_node_table> findAll();

	/**
	* Returns a range of all the wiki_node_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_node_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_node_tables
	* @param end the upper bound of the range of wiki_node_tables (not inclusive)
	* @return the range of wiki_node_tables
	*/
	public java.util.List<wiki_node_table> findAll(int start, int end);

	/**
	* Returns an ordered range of all the wiki_node_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_node_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_node_tables
	* @param end the upper bound of the range of wiki_node_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of wiki_node_tables
	*/
	public java.util.List<wiki_node_table> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_node_table> orderByComparator);

	/**
	* Returns an ordered range of all the wiki_node_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_node_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_node_tables
	* @param end the upper bound of the range of wiki_node_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of wiki_node_tables
	*/
	public java.util.List<wiki_node_table> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_node_table> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the wiki_node_tables from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of wiki_node_tables.
	*
	* @return the number of wiki_node_tables
	*/
	public int countAll();
}