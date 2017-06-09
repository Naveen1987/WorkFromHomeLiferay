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

import com.daffo.wiki_node_tableservice.exception.NoSuchwiki_page_tableException;
import com.daffo.wiki_node_tableservice.model.wiki_page_table;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the wiki_page_table service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.daffo.wiki_node_tableservice.service.persistence.impl.wiki_page_tablePersistenceImpl
 * @see wiki_page_tableUtil
 * @generated
 */
@ProviderType
public interface wiki_page_tablePersistence extends BasePersistence<wiki_page_table> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link wiki_page_tableUtil} to access the wiki_page_table persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the wiki_page_tables where NodeID = &#63;.
	*
	* @param NodeID the node ID
	* @return the matching wiki_page_tables
	*/
	public java.util.List<wiki_page_table> findByNodeID(long NodeID);

	/**
	* Returns a range of all the wiki_page_tables where NodeID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_page_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param NodeID the node ID
	* @param start the lower bound of the range of wiki_page_tables
	* @param end the upper bound of the range of wiki_page_tables (not inclusive)
	* @return the range of matching wiki_page_tables
	*/
	public java.util.List<wiki_page_table> findByNodeID(long NodeID, int start,
		int end);

	/**
	* Returns an ordered range of all the wiki_page_tables where NodeID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_page_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param NodeID the node ID
	* @param start the lower bound of the range of wiki_page_tables
	* @param end the upper bound of the range of wiki_page_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching wiki_page_tables
	*/
	public java.util.List<wiki_page_table> findByNodeID(long NodeID, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_page_table> orderByComparator);

	/**
	* Returns an ordered range of all the wiki_page_tables where NodeID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_page_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param NodeID the node ID
	* @param start the lower bound of the range of wiki_page_tables
	* @param end the upper bound of the range of wiki_page_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching wiki_page_tables
	*/
	public java.util.List<wiki_page_table> findByNodeID(long NodeID, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_page_table> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first wiki_page_table in the ordered set where NodeID = &#63;.
	*
	* @param NodeID the node ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wiki_page_table
	* @throws NoSuchwiki_page_tableException if a matching wiki_page_table could not be found
	*/
	public wiki_page_table findByNodeID_First(long NodeID,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_page_table> orderByComparator)
		throws NoSuchwiki_page_tableException;

	/**
	* Returns the first wiki_page_table in the ordered set where NodeID = &#63;.
	*
	* @param NodeID the node ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wiki_page_table, or <code>null</code> if a matching wiki_page_table could not be found
	*/
	public wiki_page_table fetchByNodeID_First(long NodeID,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_page_table> orderByComparator);

	/**
	* Returns the last wiki_page_table in the ordered set where NodeID = &#63;.
	*
	* @param NodeID the node ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wiki_page_table
	* @throws NoSuchwiki_page_tableException if a matching wiki_page_table could not be found
	*/
	public wiki_page_table findByNodeID_Last(long NodeID,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_page_table> orderByComparator)
		throws NoSuchwiki_page_tableException;

	/**
	* Returns the last wiki_page_table in the ordered set where NodeID = &#63;.
	*
	* @param NodeID the node ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wiki_page_table, or <code>null</code> if a matching wiki_page_table could not be found
	*/
	public wiki_page_table fetchByNodeID_Last(long NodeID,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_page_table> orderByComparator);

	/**
	* Returns the wiki_page_tables before and after the current wiki_page_table in the ordered set where NodeID = &#63;.
	*
	* @param PageID the primary key of the current wiki_page_table
	* @param NodeID the node ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next wiki_page_table
	* @throws NoSuchwiki_page_tableException if a wiki_page_table with the primary key could not be found
	*/
	public wiki_page_table[] findByNodeID_PrevAndNext(long PageID, long NodeID,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_page_table> orderByComparator)
		throws NoSuchwiki_page_tableException;

	/**
	* Removes all the wiki_page_tables where NodeID = &#63; from the database.
	*
	* @param NodeID the node ID
	*/
	public void removeByNodeID(long NodeID);

	/**
	* Returns the number of wiki_page_tables where NodeID = &#63;.
	*
	* @param NodeID the node ID
	* @return the number of matching wiki_page_tables
	*/
	public int countByNodeID(long NodeID);

	/**
	* Caches the wiki_page_table in the entity cache if it is enabled.
	*
	* @param wiki_page_table the wiki_page_table
	*/
	public void cacheResult(wiki_page_table wiki_page_table);

	/**
	* Caches the wiki_page_tables in the entity cache if it is enabled.
	*
	* @param wiki_page_tables the wiki_page_tables
	*/
	public void cacheResult(java.util.List<wiki_page_table> wiki_page_tables);

	/**
	* Creates a new wiki_page_table with the primary key. Does not add the wiki_page_table to the database.
	*
	* @param PageID the primary key for the new wiki_page_table
	* @return the new wiki_page_table
	*/
	public wiki_page_table create(long PageID);

	/**
	* Removes the wiki_page_table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PageID the primary key of the wiki_page_table
	* @return the wiki_page_table that was removed
	* @throws NoSuchwiki_page_tableException if a wiki_page_table with the primary key could not be found
	*/
	public wiki_page_table remove(long PageID)
		throws NoSuchwiki_page_tableException;

	public wiki_page_table updateImpl(wiki_page_table wiki_page_table);

	/**
	* Returns the wiki_page_table with the primary key or throws a {@link NoSuchwiki_page_tableException} if it could not be found.
	*
	* @param PageID the primary key of the wiki_page_table
	* @return the wiki_page_table
	* @throws NoSuchwiki_page_tableException if a wiki_page_table with the primary key could not be found
	*/
	public wiki_page_table findByPrimaryKey(long PageID)
		throws NoSuchwiki_page_tableException;

	/**
	* Returns the wiki_page_table with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PageID the primary key of the wiki_page_table
	* @return the wiki_page_table, or <code>null</code> if a wiki_page_table with the primary key could not be found
	*/
	public wiki_page_table fetchByPrimaryKey(long PageID);

	@Override
	public java.util.Map<java.io.Serializable, wiki_page_table> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the wiki_page_tables.
	*
	* @return the wiki_page_tables
	*/
	public java.util.List<wiki_page_table> findAll();

	/**
	* Returns a range of all the wiki_page_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_page_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_page_tables
	* @param end the upper bound of the range of wiki_page_tables (not inclusive)
	* @return the range of wiki_page_tables
	*/
	public java.util.List<wiki_page_table> findAll(int start, int end);

	/**
	* Returns an ordered range of all the wiki_page_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_page_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_page_tables
	* @param end the upper bound of the range of wiki_page_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of wiki_page_tables
	*/
	public java.util.List<wiki_page_table> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_page_table> orderByComparator);

	/**
	* Returns an ordered range of all the wiki_page_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_page_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_page_tables
	* @param end the upper bound of the range of wiki_page_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of wiki_page_tables
	*/
	public java.util.List<wiki_page_table> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_page_table> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the wiki_page_tables from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of wiki_page_tables.
	*
	* @return the number of wiki_page_tables
	*/
	public int countAll();
}