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

import com.daffo.wiki_node_tableservice.exception.NoSuchwiki_pagedata_tableException;
import com.daffo.wiki_node_tableservice.model.wiki_pagedata_table;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the wiki_pagedata_table service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.daffo.wiki_node_tableservice.service.persistence.impl.wiki_pagedata_tablePersistenceImpl
 * @see wiki_pagedata_tableUtil
 * @generated
 */
@ProviderType
public interface wiki_pagedata_tablePersistence extends BasePersistence<wiki_pagedata_table> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link wiki_pagedata_tableUtil} to access the wiki_pagedata_table persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the wiki_pagedata_tables where PageID = &#63;.
	*
	* @param PageID the page ID
	* @return the matching wiki_pagedata_tables
	*/
	public java.util.List<wiki_pagedata_table> findByPageID(long PageID);

	/**
	* Returns a range of all the wiki_pagedata_tables where PageID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_pagedata_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param PageID the page ID
	* @param start the lower bound of the range of wiki_pagedata_tables
	* @param end the upper bound of the range of wiki_pagedata_tables (not inclusive)
	* @return the range of matching wiki_pagedata_tables
	*/
	public java.util.List<wiki_pagedata_table> findByPageID(long PageID,
		int start, int end);

	/**
	* Returns an ordered range of all the wiki_pagedata_tables where PageID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_pagedata_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param PageID the page ID
	* @param start the lower bound of the range of wiki_pagedata_tables
	* @param end the upper bound of the range of wiki_pagedata_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching wiki_pagedata_tables
	*/
	public java.util.List<wiki_pagedata_table> findByPageID(long PageID,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_pagedata_table> orderByComparator);

	/**
	* Returns an ordered range of all the wiki_pagedata_tables where PageID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_pagedata_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param PageID the page ID
	* @param start the lower bound of the range of wiki_pagedata_tables
	* @param end the upper bound of the range of wiki_pagedata_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching wiki_pagedata_tables
	*/
	public java.util.List<wiki_pagedata_table> findByPageID(long PageID,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_pagedata_table> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first wiki_pagedata_table in the ordered set where PageID = &#63;.
	*
	* @param PageID the page ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wiki_pagedata_table
	* @throws NoSuchwiki_pagedata_tableException if a matching wiki_pagedata_table could not be found
	*/
	public wiki_pagedata_table findByPageID_First(long PageID,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_pagedata_table> orderByComparator)
		throws NoSuchwiki_pagedata_tableException;

	/**
	* Returns the first wiki_pagedata_table in the ordered set where PageID = &#63;.
	*
	* @param PageID the page ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wiki_pagedata_table, or <code>null</code> if a matching wiki_pagedata_table could not be found
	*/
	public wiki_pagedata_table fetchByPageID_First(long PageID,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_pagedata_table> orderByComparator);

	/**
	* Returns the last wiki_pagedata_table in the ordered set where PageID = &#63;.
	*
	* @param PageID the page ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wiki_pagedata_table
	* @throws NoSuchwiki_pagedata_tableException if a matching wiki_pagedata_table could not be found
	*/
	public wiki_pagedata_table findByPageID_Last(long PageID,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_pagedata_table> orderByComparator)
		throws NoSuchwiki_pagedata_tableException;

	/**
	* Returns the last wiki_pagedata_table in the ordered set where PageID = &#63;.
	*
	* @param PageID the page ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wiki_pagedata_table, or <code>null</code> if a matching wiki_pagedata_table could not be found
	*/
	public wiki_pagedata_table fetchByPageID_Last(long PageID,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_pagedata_table> orderByComparator);

	/**
	* Returns the wiki_pagedata_tables before and after the current wiki_pagedata_table in the ordered set where PageID = &#63;.
	*
	* @param Page_ModID the primary key of the current wiki_pagedata_table
	* @param PageID the page ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next wiki_pagedata_table
	* @throws NoSuchwiki_pagedata_tableException if a wiki_pagedata_table with the primary key could not be found
	*/
	public wiki_pagedata_table[] findByPageID_PrevAndNext(long Page_ModID,
		long PageID,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_pagedata_table> orderByComparator)
		throws NoSuchwiki_pagedata_tableException;

	/**
	* Removes all the wiki_pagedata_tables where PageID = &#63; from the database.
	*
	* @param PageID the page ID
	*/
	public void removeByPageID(long PageID);

	/**
	* Returns the number of wiki_pagedata_tables where PageID = &#63;.
	*
	* @param PageID the page ID
	* @return the number of matching wiki_pagedata_tables
	*/
	public int countByPageID(long PageID);

	/**
	* Caches the wiki_pagedata_table in the entity cache if it is enabled.
	*
	* @param wiki_pagedata_table the wiki_pagedata_table
	*/
	public void cacheResult(wiki_pagedata_table wiki_pagedata_table);

	/**
	* Caches the wiki_pagedata_tables in the entity cache if it is enabled.
	*
	* @param wiki_pagedata_tables the wiki_pagedata_tables
	*/
	public void cacheResult(
		java.util.List<wiki_pagedata_table> wiki_pagedata_tables);

	/**
	* Creates a new wiki_pagedata_table with the primary key. Does not add the wiki_pagedata_table to the database.
	*
	* @param Page_ModID the primary key for the new wiki_pagedata_table
	* @return the new wiki_pagedata_table
	*/
	public wiki_pagedata_table create(long Page_ModID);

	/**
	* Removes the wiki_pagedata_table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Page_ModID the primary key of the wiki_pagedata_table
	* @return the wiki_pagedata_table that was removed
	* @throws NoSuchwiki_pagedata_tableException if a wiki_pagedata_table with the primary key could not be found
	*/
	public wiki_pagedata_table remove(long Page_ModID)
		throws NoSuchwiki_pagedata_tableException;

	public wiki_pagedata_table updateImpl(
		wiki_pagedata_table wiki_pagedata_table);

	/**
	* Returns the wiki_pagedata_table with the primary key or throws a {@link NoSuchwiki_pagedata_tableException} if it could not be found.
	*
	* @param Page_ModID the primary key of the wiki_pagedata_table
	* @return the wiki_pagedata_table
	* @throws NoSuchwiki_pagedata_tableException if a wiki_pagedata_table with the primary key could not be found
	*/
	public wiki_pagedata_table findByPrimaryKey(long Page_ModID)
		throws NoSuchwiki_pagedata_tableException;

	/**
	* Returns the wiki_pagedata_table with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Page_ModID the primary key of the wiki_pagedata_table
	* @return the wiki_pagedata_table, or <code>null</code> if a wiki_pagedata_table with the primary key could not be found
	*/
	public wiki_pagedata_table fetchByPrimaryKey(long Page_ModID);

	@Override
	public java.util.Map<java.io.Serializable, wiki_pagedata_table> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the wiki_pagedata_tables.
	*
	* @return the wiki_pagedata_tables
	*/
	public java.util.List<wiki_pagedata_table> findAll();

	/**
	* Returns a range of all the wiki_pagedata_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_pagedata_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_pagedata_tables
	* @param end the upper bound of the range of wiki_pagedata_tables (not inclusive)
	* @return the range of wiki_pagedata_tables
	*/
	public java.util.List<wiki_pagedata_table> findAll(int start, int end);

	/**
	* Returns an ordered range of all the wiki_pagedata_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_pagedata_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_pagedata_tables
	* @param end the upper bound of the range of wiki_pagedata_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of wiki_pagedata_tables
	*/
	public java.util.List<wiki_pagedata_table> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_pagedata_table> orderByComparator);

	/**
	* Returns an ordered range of all the wiki_pagedata_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_pagedata_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_pagedata_tables
	* @param end the upper bound of the range of wiki_pagedata_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of wiki_pagedata_tables
	*/
	public java.util.List<wiki_pagedata_table> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<wiki_pagedata_table> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the wiki_pagedata_tables from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of wiki_pagedata_tables.
	*
	* @return the number of wiki_pagedata_tables
	*/
	public int countAll();
}