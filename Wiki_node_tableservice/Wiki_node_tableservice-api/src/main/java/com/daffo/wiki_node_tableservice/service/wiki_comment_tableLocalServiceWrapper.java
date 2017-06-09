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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link wiki_comment_tableLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see wiki_comment_tableLocalService
 * @generated
 */
@ProviderType
public class wiki_comment_tableLocalServiceWrapper
	implements wiki_comment_tableLocalService,
		ServiceWrapper<wiki_comment_tableLocalService> {
	public wiki_comment_tableLocalServiceWrapper(
		wiki_comment_tableLocalService wiki_comment_tableLocalService) {
		_wiki_comment_tableLocalService = wiki_comment_tableLocalService;
	}

	/**
	* Adds the wiki_comment_table to the database. Also notifies the appropriate model listeners.
	*
	* @param wiki_comment_table the wiki_comment_table
	* @return the wiki_comment_table that was added
	*/
	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_comment_table addwiki_comment_table(
		com.daffo.wiki_node_tableservice.model.wiki_comment_table wiki_comment_table) {
		return _wiki_comment_tableLocalService.addwiki_comment_table(wiki_comment_table);
	}

	/**
	* Creates a new wiki_comment_table with the primary key. Does not add the wiki_comment_table to the database.
	*
	* @param comment_ID the primary key for the new wiki_comment_table
	* @return the new wiki_comment_table
	*/
	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_comment_table createwiki_comment_table(
		long comment_ID) {
		return _wiki_comment_tableLocalService.createwiki_comment_table(comment_ID);
	}

	/**
	* Deletes the wiki_comment_table from the database. Also notifies the appropriate model listeners.
	*
	* @param wiki_comment_table the wiki_comment_table
	* @return the wiki_comment_table that was removed
	*/
	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_comment_table deletewiki_comment_table(
		com.daffo.wiki_node_tableservice.model.wiki_comment_table wiki_comment_table) {
		return _wiki_comment_tableLocalService.deletewiki_comment_table(wiki_comment_table);
	}

	/**
	* Deletes the wiki_comment_table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param comment_ID the primary key of the wiki_comment_table
	* @return the wiki_comment_table that was removed
	* @throws PortalException if a wiki_comment_table with the primary key could not be found
	*/
	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_comment_table deletewiki_comment_table(
		long comment_ID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _wiki_comment_tableLocalService.deletewiki_comment_table(comment_ID);
	}

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_comment_table fetchwiki_comment_table(
		long comment_ID) {
		return _wiki_comment_tableLocalService.fetchwiki_comment_table(comment_ID);
	}

	/**
	* Returns the wiki_comment_table with the primary key.
	*
	* @param comment_ID the primary key of the wiki_comment_table
	* @return the wiki_comment_table
	* @throws PortalException if a wiki_comment_table with the primary key could not be found
	*/
	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_comment_table getwiki_comment_table(
		long comment_ID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _wiki_comment_tableLocalService.getwiki_comment_table(comment_ID);
	}

	/**
	* Updates the wiki_comment_table in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wiki_comment_table the wiki_comment_table
	* @return the wiki_comment_table that was updated
	*/
	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_comment_table updatewiki_comment_table(
		com.daffo.wiki_node_tableservice.model.wiki_comment_table wiki_comment_table) {
		return _wiki_comment_tableLocalService.updatewiki_comment_table(wiki_comment_table);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _wiki_comment_tableLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wiki_comment_tableLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _wiki_comment_tableLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _wiki_comment_tableLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _wiki_comment_tableLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of wiki_comment_tables.
	*
	* @return the number of wiki_comment_tables
	*/
	@Override
	public int getwiki_comment_tablesCount() {
		return _wiki_comment_tableLocalService.getwiki_comment_tablesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _wiki_comment_tableLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _wiki_comment_tableLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _wiki_comment_tableLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _wiki_comment_tableLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
	@Override
	public java.util.List<com.daffo.wiki_node_tableservice.model.wiki_comment_table> getwiki_comment_tables(
		int start, int end) {
		return _wiki_comment_tableLocalService.getwiki_comment_tables(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _wiki_comment_tableLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _wiki_comment_tableLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public wiki_comment_tableLocalService getWrappedService() {
		return _wiki_comment_tableLocalService;
	}

	@Override
	public void setWrappedService(
		wiki_comment_tableLocalService wiki_comment_tableLocalService) {
		_wiki_comment_tableLocalService = wiki_comment_tableLocalService;
	}

	private wiki_comment_tableLocalService _wiki_comment_tableLocalService;
}