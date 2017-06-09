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

package com.daffo.wiki_node_tableservice.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for wiki_comment_table. This utility wraps
 * {@link com.daffo.wiki_node_tableservice.service.impl.wiki_comment_tableLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see wiki_comment_tableLocalService
 * @see com.daffo.wiki_node_tableservice.service.base.wiki_comment_tableLocalServiceBaseImpl
 * @see com.daffo.wiki_node_tableservice.service.impl.wiki_comment_tableLocalServiceImpl
 * @generated
 */
@ProviderType
public class wiki_comment_tableLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.daffo.wiki_node_tableservice.service.impl.wiki_comment_tableLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the wiki_comment_table to the database. Also notifies the appropriate model listeners.
	*
	* @param wiki_comment_table the wiki_comment_table
	* @return the wiki_comment_table that was added
	*/
	public static com.daffo.wiki_node_tableservice.model.wiki_comment_table addwiki_comment_table(
		com.daffo.wiki_node_tableservice.model.wiki_comment_table wiki_comment_table) {
		return getService().addwiki_comment_table(wiki_comment_table);
	}

	/**
	* Creates a new wiki_comment_table with the primary key. Does not add the wiki_comment_table to the database.
	*
	* @param comment_ID the primary key for the new wiki_comment_table
	* @return the new wiki_comment_table
	*/
	public static com.daffo.wiki_node_tableservice.model.wiki_comment_table createwiki_comment_table(
		long comment_ID) {
		return getService().createwiki_comment_table(comment_ID);
	}

	/**
	* Deletes the wiki_comment_table from the database. Also notifies the appropriate model listeners.
	*
	* @param wiki_comment_table the wiki_comment_table
	* @return the wiki_comment_table that was removed
	*/
	public static com.daffo.wiki_node_tableservice.model.wiki_comment_table deletewiki_comment_table(
		com.daffo.wiki_node_tableservice.model.wiki_comment_table wiki_comment_table) {
		return getService().deletewiki_comment_table(wiki_comment_table);
	}

	/**
	* Deletes the wiki_comment_table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param comment_ID the primary key of the wiki_comment_table
	* @return the wiki_comment_table that was removed
	* @throws PortalException if a wiki_comment_table with the primary key could not be found
	*/
	public static com.daffo.wiki_node_tableservice.model.wiki_comment_table deletewiki_comment_table(
		long comment_ID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletewiki_comment_table(comment_ID);
	}

	public static com.daffo.wiki_node_tableservice.model.wiki_comment_table fetchwiki_comment_table(
		long comment_ID) {
		return getService().fetchwiki_comment_table(comment_ID);
	}

	/**
	* Returns the wiki_comment_table with the primary key.
	*
	* @param comment_ID the primary key of the wiki_comment_table
	* @return the wiki_comment_table
	* @throws PortalException if a wiki_comment_table with the primary key could not be found
	*/
	public static com.daffo.wiki_node_tableservice.model.wiki_comment_table getwiki_comment_table(
		long comment_ID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getwiki_comment_table(comment_ID);
	}

	/**
	* Updates the wiki_comment_table in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wiki_comment_table the wiki_comment_table
	* @return the wiki_comment_table that was updated
	*/
	public static com.daffo.wiki_node_tableservice.model.wiki_comment_table updatewiki_comment_table(
		com.daffo.wiki_node_tableservice.model.wiki_comment_table wiki_comment_table) {
		return getService().updatewiki_comment_table(wiki_comment_table);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of wiki_comment_tables.
	*
	* @return the number of wiki_comment_tables
	*/
	public static int getwiki_comment_tablesCount() {
		return getService().getwiki_comment_tablesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.wiki_node_tableservice.model.impl.wiki_comment_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.wiki_node_tableservice.model.impl.wiki_comment_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the wiki_comment_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.wiki_node_tableservice.model.impl.wiki_comment_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_comment_tables
	* @param end the upper bound of the range of wiki_comment_tables (not inclusive)
	* @return the range of wiki_comment_tables
	*/
	public static java.util.List<com.daffo.wiki_node_tableservice.model.wiki_comment_table> getwiki_comment_tables(
		int start, int end) {
		return getService().getwiki_comment_tables(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static wiki_comment_tableLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<wiki_comment_tableLocalService, wiki_comment_tableLocalService> _serviceTracker =
		ServiceTrackerFactory.open(wiki_comment_tableLocalService.class);
}