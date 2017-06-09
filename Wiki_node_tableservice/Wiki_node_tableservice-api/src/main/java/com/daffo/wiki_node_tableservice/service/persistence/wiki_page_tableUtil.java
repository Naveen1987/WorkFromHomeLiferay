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

import com.daffo.wiki_node_tableservice.model.wiki_page_table;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the wiki_page_table service. This utility wraps {@link com.daffo.wiki_node_tableservice.service.persistence.impl.wiki_page_tablePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see wiki_page_tablePersistence
 * @see com.daffo.wiki_node_tableservice.service.persistence.impl.wiki_page_tablePersistenceImpl
 * @generated
 */
@ProviderType
public class wiki_page_tableUtil {
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
	public static void clearCache(wiki_page_table wiki_page_table) {
		getPersistence().clearCache(wiki_page_table);
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
	public static List<wiki_page_table> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<wiki_page_table> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<wiki_page_table> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<wiki_page_table> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static wiki_page_table update(wiki_page_table wiki_page_table) {
		return getPersistence().update(wiki_page_table);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static wiki_page_table update(wiki_page_table wiki_page_table,
		ServiceContext serviceContext) {
		return getPersistence().update(wiki_page_table, serviceContext);
	}

	/**
	* Returns all the wiki_page_tables where NodeID = &#63;.
	*
	* @param NodeID the node ID
	* @return the matching wiki_page_tables
	*/
	public static List<wiki_page_table> findByNodeID(long NodeID) {
		return getPersistence().findByNodeID(NodeID);
	}

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
	public static List<wiki_page_table> findByNodeID(long NodeID, int start,
		int end) {
		return getPersistence().findByNodeID(NodeID, start, end);
	}

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
	public static List<wiki_page_table> findByNodeID(long NodeID, int start,
		int end, OrderByComparator<wiki_page_table> orderByComparator) {
		return getPersistence()
				   .findByNodeID(NodeID, start, end, orderByComparator);
	}

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
	public static List<wiki_page_table> findByNodeID(long NodeID, int start,
		int end, OrderByComparator<wiki_page_table> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByNodeID(NodeID, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first wiki_page_table in the ordered set where NodeID = &#63;.
	*
	* @param NodeID the node ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wiki_page_table
	* @throws NoSuchwiki_page_tableException if a matching wiki_page_table could not be found
	*/
	public static wiki_page_table findByNodeID_First(long NodeID,
		OrderByComparator<wiki_page_table> orderByComparator)
		throws com.daffo.wiki_node_tableservice.exception.NoSuchwiki_page_tableException {
		return getPersistence().findByNodeID_First(NodeID, orderByComparator);
	}

	/**
	* Returns the first wiki_page_table in the ordered set where NodeID = &#63;.
	*
	* @param NodeID the node ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wiki_page_table, or <code>null</code> if a matching wiki_page_table could not be found
	*/
	public static wiki_page_table fetchByNodeID_First(long NodeID,
		OrderByComparator<wiki_page_table> orderByComparator) {
		return getPersistence().fetchByNodeID_First(NodeID, orderByComparator);
	}

	/**
	* Returns the last wiki_page_table in the ordered set where NodeID = &#63;.
	*
	* @param NodeID the node ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wiki_page_table
	* @throws NoSuchwiki_page_tableException if a matching wiki_page_table could not be found
	*/
	public static wiki_page_table findByNodeID_Last(long NodeID,
		OrderByComparator<wiki_page_table> orderByComparator)
		throws com.daffo.wiki_node_tableservice.exception.NoSuchwiki_page_tableException {
		return getPersistence().findByNodeID_Last(NodeID, orderByComparator);
	}

	/**
	* Returns the last wiki_page_table in the ordered set where NodeID = &#63;.
	*
	* @param NodeID the node ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wiki_page_table, or <code>null</code> if a matching wiki_page_table could not be found
	*/
	public static wiki_page_table fetchByNodeID_Last(long NodeID,
		OrderByComparator<wiki_page_table> orderByComparator) {
		return getPersistence().fetchByNodeID_Last(NodeID, orderByComparator);
	}

	/**
	* Returns the wiki_page_tables before and after the current wiki_page_table in the ordered set where NodeID = &#63;.
	*
	* @param PageID the primary key of the current wiki_page_table
	* @param NodeID the node ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next wiki_page_table
	* @throws NoSuchwiki_page_tableException if a wiki_page_table with the primary key could not be found
	*/
	public static wiki_page_table[] findByNodeID_PrevAndNext(long PageID,
		long NodeID, OrderByComparator<wiki_page_table> orderByComparator)
		throws com.daffo.wiki_node_tableservice.exception.NoSuchwiki_page_tableException {
		return getPersistence()
				   .findByNodeID_PrevAndNext(PageID, NodeID, orderByComparator);
	}

	/**
	* Removes all the wiki_page_tables where NodeID = &#63; from the database.
	*
	* @param NodeID the node ID
	*/
	public static void removeByNodeID(long NodeID) {
		getPersistence().removeByNodeID(NodeID);
	}

	/**
	* Returns the number of wiki_page_tables where NodeID = &#63;.
	*
	* @param NodeID the node ID
	* @return the number of matching wiki_page_tables
	*/
	public static int countByNodeID(long NodeID) {
		return getPersistence().countByNodeID(NodeID);
	}

	/**
	* Caches the wiki_page_table in the entity cache if it is enabled.
	*
	* @param wiki_page_table the wiki_page_table
	*/
	public static void cacheResult(wiki_page_table wiki_page_table) {
		getPersistence().cacheResult(wiki_page_table);
	}

	/**
	* Caches the wiki_page_tables in the entity cache if it is enabled.
	*
	* @param wiki_page_tables the wiki_page_tables
	*/
	public static void cacheResult(List<wiki_page_table> wiki_page_tables) {
		getPersistence().cacheResult(wiki_page_tables);
	}

	/**
	* Creates a new wiki_page_table with the primary key. Does not add the wiki_page_table to the database.
	*
	* @param PageID the primary key for the new wiki_page_table
	* @return the new wiki_page_table
	*/
	public static wiki_page_table create(long PageID) {
		return getPersistence().create(PageID);
	}

	/**
	* Removes the wiki_page_table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PageID the primary key of the wiki_page_table
	* @return the wiki_page_table that was removed
	* @throws NoSuchwiki_page_tableException if a wiki_page_table with the primary key could not be found
	*/
	public static wiki_page_table remove(long PageID)
		throws com.daffo.wiki_node_tableservice.exception.NoSuchwiki_page_tableException {
		return getPersistence().remove(PageID);
	}

	public static wiki_page_table updateImpl(wiki_page_table wiki_page_table) {
		return getPersistence().updateImpl(wiki_page_table);
	}

	/**
	* Returns the wiki_page_table with the primary key or throws a {@link NoSuchwiki_page_tableException} if it could not be found.
	*
	* @param PageID the primary key of the wiki_page_table
	* @return the wiki_page_table
	* @throws NoSuchwiki_page_tableException if a wiki_page_table with the primary key could not be found
	*/
	public static wiki_page_table findByPrimaryKey(long PageID)
		throws com.daffo.wiki_node_tableservice.exception.NoSuchwiki_page_tableException {
		return getPersistence().findByPrimaryKey(PageID);
	}

	/**
	* Returns the wiki_page_table with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PageID the primary key of the wiki_page_table
	* @return the wiki_page_table, or <code>null</code> if a wiki_page_table with the primary key could not be found
	*/
	public static wiki_page_table fetchByPrimaryKey(long PageID) {
		return getPersistence().fetchByPrimaryKey(PageID);
	}

	public static java.util.Map<java.io.Serializable, wiki_page_table> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the wiki_page_tables.
	*
	* @return the wiki_page_tables
	*/
	public static List<wiki_page_table> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<wiki_page_table> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<wiki_page_table> findAll(int start, int end,
		OrderByComparator<wiki_page_table> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<wiki_page_table> findAll(int start, int end,
		OrderByComparator<wiki_page_table> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the wiki_page_tables from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of wiki_page_tables.
	*
	* @return the number of wiki_page_tables
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static wiki_page_tablePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<wiki_page_tablePersistence, wiki_page_tablePersistence> _serviceTracker =
		ServiceTrackerFactory.open(wiki_page_tablePersistence.class);
}