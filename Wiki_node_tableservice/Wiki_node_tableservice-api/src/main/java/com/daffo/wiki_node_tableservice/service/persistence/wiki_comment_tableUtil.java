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

import com.daffo.wiki_node_tableservice.model.wiki_comment_table;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the wiki_comment_table service. This utility wraps {@link com.daffo.wiki_node_tableservice.service.persistence.impl.wiki_comment_tablePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see wiki_comment_tablePersistence
 * @see com.daffo.wiki_node_tableservice.service.persistence.impl.wiki_comment_tablePersistenceImpl
 * @generated
 */
@ProviderType
public class wiki_comment_tableUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(wiki_comment_table wiki_comment_table) {
		getPersistence().clearCache(wiki_comment_table);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<wiki_comment_table> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<wiki_comment_table> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<wiki_comment_table> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<wiki_comment_table> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static wiki_comment_table update(
		wiki_comment_table wiki_comment_table) {
		return getPersistence().update(wiki_comment_table);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static wiki_comment_table update(
		wiki_comment_table wiki_comment_table, ServiceContext serviceContext) {
		return getPersistence().update(wiki_comment_table, serviceContext);
	}

	/**
	* Returns all the wiki_comment_tables where PageID = &#63;.
	*
	* @param PageID the page ID
	* @return the matching wiki_comment_tables
	*/
	public static List<wiki_comment_table> findByPageID(long PageID) {
		return getPersistence().findByPageID(PageID);
	}

	/**
	* Returns a range of all the wiki_comment_tables where PageID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_comment_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param PageID the page ID
	* @param start the lower bound of the range of wiki_comment_tables
	* @param end the upper bound of the range of wiki_comment_tables (not inclusive)
	* @return the range of matching wiki_comment_tables
	*/
	public static List<wiki_comment_table> findByPageID(long PageID, int start,
		int end) {
		return getPersistence().findByPageID(PageID, start, end);
	}

	/**
	* Returns an ordered range of all the wiki_comment_tables where PageID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_comment_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param PageID the page ID
	* @param start the lower bound of the range of wiki_comment_tables
	* @param end the upper bound of the range of wiki_comment_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching wiki_comment_tables
	*/
	public static List<wiki_comment_table> findByPageID(long PageID, int start,
		int end, OrderByComparator<wiki_comment_table> orderByComparator) {
		return getPersistence()
				   .findByPageID(PageID, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the wiki_comment_tables where PageID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_comment_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param PageID the page ID
	* @param start the lower bound of the range of wiki_comment_tables
	* @param end the upper bound of the range of wiki_comment_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching wiki_comment_tables
	*/
	public static List<wiki_comment_table> findByPageID(long PageID, int start,
		int end, OrderByComparator<wiki_comment_table> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPageID(PageID, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first wiki_comment_table in the ordered set where PageID = &#63;.
	*
	* @param PageID the page ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wiki_comment_table
	* @throws NoSuchwiki_comment_tableException if a matching wiki_comment_table could not be found
	*/
	public static wiki_comment_table findByPageID_First(long PageID,
		OrderByComparator<wiki_comment_table> orderByComparator)
		throws com.daffo.wiki_node_tableservice.exception.NoSuchwiki_comment_tableException {
		return getPersistence().findByPageID_First(PageID, orderByComparator);
	}

	/**
	* Returns the first wiki_comment_table in the ordered set where PageID = &#63;.
	*
	* @param PageID the page ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wiki_comment_table, or <code>null</code> if a matching wiki_comment_table could not be found
	*/
	public static wiki_comment_table fetchByPageID_First(long PageID,
		OrderByComparator<wiki_comment_table> orderByComparator) {
		return getPersistence().fetchByPageID_First(PageID, orderByComparator);
	}

	/**
	* Returns the last wiki_comment_table in the ordered set where PageID = &#63;.
	*
	* @param PageID the page ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wiki_comment_table
	* @throws NoSuchwiki_comment_tableException if a matching wiki_comment_table could not be found
	*/
	public static wiki_comment_table findByPageID_Last(long PageID,
		OrderByComparator<wiki_comment_table> orderByComparator)
		throws com.daffo.wiki_node_tableservice.exception.NoSuchwiki_comment_tableException {
		return getPersistence().findByPageID_Last(PageID, orderByComparator);
	}

	/**
	* Returns the last wiki_comment_table in the ordered set where PageID = &#63;.
	*
	* @param PageID the page ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wiki_comment_table, or <code>null</code> if a matching wiki_comment_table could not be found
	*/
	public static wiki_comment_table fetchByPageID_Last(long PageID,
		OrderByComparator<wiki_comment_table> orderByComparator) {
		return getPersistence().fetchByPageID_Last(PageID, orderByComparator);
	}

	/**
	* Returns the wiki_comment_tables before and after the current wiki_comment_table in the ordered set where PageID = &#63;.
	*
	* @param comment_ID the primary key of the current wiki_comment_table
	* @param PageID the page ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next wiki_comment_table
	* @throws NoSuchwiki_comment_tableException if a wiki_comment_table with the primary key could not be found
	*/
	public static wiki_comment_table[] findByPageID_PrevAndNext(
		long comment_ID, long PageID,
		OrderByComparator<wiki_comment_table> orderByComparator)
		throws com.daffo.wiki_node_tableservice.exception.NoSuchwiki_comment_tableException {
		return getPersistence()
				   .findByPageID_PrevAndNext(comment_ID, PageID,
			orderByComparator);
	}

	/**
	* Removes all the wiki_comment_tables where PageID = &#63; from the database.
	*
	* @param PageID the page ID
	*/
	public static void removeByPageID(long PageID) {
		getPersistence().removeByPageID(PageID);
	}

	/**
	* Returns the number of wiki_comment_tables where PageID = &#63;.
	*
	* @param PageID the page ID
	* @return the number of matching wiki_comment_tables
	*/
	public static int countByPageID(long PageID) {
		return getPersistence().countByPageID(PageID);
	}

	/**
	* Caches the wiki_comment_table in the entity cache if it is enabled.
	*
	* @param wiki_comment_table the wiki_comment_table
	*/
	public static void cacheResult(wiki_comment_table wiki_comment_table) {
		getPersistence().cacheResult(wiki_comment_table);
	}

	/**
	* Caches the wiki_comment_tables in the entity cache if it is enabled.
	*
	* @param wiki_comment_tables the wiki_comment_tables
	*/
	public static void cacheResult(List<wiki_comment_table> wiki_comment_tables) {
		getPersistence().cacheResult(wiki_comment_tables);
	}

	/**
	* Creates a new wiki_comment_table with the primary key. Does not add the wiki_comment_table to the database.
	*
	* @param comment_ID the primary key for the new wiki_comment_table
	* @return the new wiki_comment_table
	*/
	public static wiki_comment_table create(long comment_ID) {
		return getPersistence().create(comment_ID);
	}

	/**
	* Removes the wiki_comment_table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param comment_ID the primary key of the wiki_comment_table
	* @return the wiki_comment_table that was removed
	* @throws NoSuchwiki_comment_tableException if a wiki_comment_table with the primary key could not be found
	*/
	public static wiki_comment_table remove(long comment_ID)
		throws com.daffo.wiki_node_tableservice.exception.NoSuchwiki_comment_tableException {
		return getPersistence().remove(comment_ID);
	}

	public static wiki_comment_table updateImpl(
		wiki_comment_table wiki_comment_table) {
		return getPersistence().updateImpl(wiki_comment_table);
	}

	/**
	* Returns the wiki_comment_table with the primary key or throws a {@link NoSuchwiki_comment_tableException} if it could not be found.
	*
	* @param comment_ID the primary key of the wiki_comment_table
	* @return the wiki_comment_table
	* @throws NoSuchwiki_comment_tableException if a wiki_comment_table with the primary key could not be found
	*/
	public static wiki_comment_table findByPrimaryKey(long comment_ID)
		throws com.daffo.wiki_node_tableservice.exception.NoSuchwiki_comment_tableException {
		return getPersistence().findByPrimaryKey(comment_ID);
	}

	/**
	* Returns the wiki_comment_table with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param comment_ID the primary key of the wiki_comment_table
	* @return the wiki_comment_table, or <code>null</code> if a wiki_comment_table with the primary key could not be found
	*/
	public static wiki_comment_table fetchByPrimaryKey(long comment_ID) {
		return getPersistence().fetchByPrimaryKey(comment_ID);
	}

	public static java.util.Map<java.io.Serializable, wiki_comment_table> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the wiki_comment_tables.
	*
	* @return the wiki_comment_tables
	*/
	public static List<wiki_comment_table> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the wiki_comment_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_comment_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_comment_tables
	* @param end the upper bound of the range of wiki_comment_tables (not inclusive)
	* @return the range of wiki_comment_tables
	*/
	public static List<wiki_comment_table> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the wiki_comment_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_comment_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_comment_tables
	* @param end the upper bound of the range of wiki_comment_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of wiki_comment_tables
	*/
	public static List<wiki_comment_table> findAll(int start, int end,
		OrderByComparator<wiki_comment_table> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the wiki_comment_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link wiki_comment_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_comment_tables
	* @param end the upper bound of the range of wiki_comment_tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of wiki_comment_tables
	*/
	public static List<wiki_comment_table> findAll(int start, int end,
		OrderByComparator<wiki_comment_table> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the wiki_comment_tables from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of wiki_comment_tables.
	*
	* @return the number of wiki_comment_tables
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static wiki_comment_tablePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<wiki_comment_tablePersistence, wiki_comment_tablePersistence> _serviceTracker =
		ServiceTrackerFactory.open(wiki_comment_tablePersistence.class);
}