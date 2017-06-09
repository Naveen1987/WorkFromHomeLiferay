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
 * Provides a wrapper for {@link wiki_page_tableLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see wiki_page_tableLocalService
 * @generated
 */
@ProviderType
public class wiki_page_tableLocalServiceWrapper
	implements wiki_page_tableLocalService,
		ServiceWrapper<wiki_page_tableLocalService> {
	public wiki_page_tableLocalServiceWrapper(
		wiki_page_tableLocalService wiki_page_tableLocalService) {
		_wiki_page_tableLocalService = wiki_page_tableLocalService;
	}

	/**
	* Adds the wiki_page_table to the database. Also notifies the appropriate model listeners.
	*
	* @param wiki_page_table the wiki_page_table
	* @return the wiki_page_table that was added
	*/
	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_page_table addwiki_page_table(
		com.daffo.wiki_node_tableservice.model.wiki_page_table wiki_page_table) {
		return _wiki_page_tableLocalService.addwiki_page_table(wiki_page_table);
	}

	/**
	* Creates a new wiki_page_table with the primary key. Does not add the wiki_page_table to the database.
	*
	* @param PageID the primary key for the new wiki_page_table
	* @return the new wiki_page_table
	*/
	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_page_table createwiki_page_table(
		long PageID) {
		return _wiki_page_tableLocalService.createwiki_page_table(PageID);
	}

	/**
	* Deletes the wiki_page_table from the database. Also notifies the appropriate model listeners.
	*
	* @param wiki_page_table the wiki_page_table
	* @return the wiki_page_table that was removed
	*/
	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_page_table deletewiki_page_table(
		com.daffo.wiki_node_tableservice.model.wiki_page_table wiki_page_table) {
		return _wiki_page_tableLocalService.deletewiki_page_table(wiki_page_table);
	}

	/**
	* Deletes the wiki_page_table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PageID the primary key of the wiki_page_table
	* @return the wiki_page_table that was removed
	* @throws PortalException if a wiki_page_table with the primary key could not be found
	*/
	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_page_table deletewiki_page_table(
		long PageID) throws com.liferay.portal.kernel.exception.PortalException {
		return _wiki_page_tableLocalService.deletewiki_page_table(PageID);
	}

	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_page_table fetchwiki_page_table(
		long PageID) {
		return _wiki_page_tableLocalService.fetchwiki_page_table(PageID);
	}

	/**
	* Returns the wiki_page_table with the primary key.
	*
	* @param PageID the primary key of the wiki_page_table
	* @return the wiki_page_table
	* @throws PortalException if a wiki_page_table with the primary key could not be found
	*/
	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_page_table getwiki_page_table(
		long PageID) throws com.liferay.portal.kernel.exception.PortalException {
		return _wiki_page_tableLocalService.getwiki_page_table(PageID);
	}

	/**
	* Updates the wiki_page_table in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wiki_page_table the wiki_page_table
	* @return the wiki_page_table that was updated
	*/
	@Override
	public com.daffo.wiki_node_tableservice.model.wiki_page_table updatewiki_page_table(
		com.daffo.wiki_node_tableservice.model.wiki_page_table wiki_page_table) {
		return _wiki_page_tableLocalService.updatewiki_page_table(wiki_page_table);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _wiki_page_tableLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wiki_page_tableLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _wiki_page_tableLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _wiki_page_tableLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _wiki_page_tableLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of wiki_page_tables.
	*
	* @return the number of wiki_page_tables
	*/
	@Override
	public int getwiki_page_tablesCount() {
		return _wiki_page_tableLocalService.getwiki_page_tablesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _wiki_page_tableLocalService.getOSGiServiceIdentifier();
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
		return _wiki_page_tableLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.wiki_node_tableservice.model.impl.wiki_page_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _wiki_page_tableLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.wiki_node_tableservice.model.impl.wiki_page_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _wiki_page_tableLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the wiki_page_tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.wiki_node_tableservice.model.impl.wiki_page_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wiki_page_tables
	* @param end the upper bound of the range of wiki_page_tables (not inclusive)
	* @return the range of wiki_page_tables
	*/
	@Override
	public java.util.List<com.daffo.wiki_node_tableservice.model.wiki_page_table> getwiki_page_tables(
		int start, int end) {
		return _wiki_page_tableLocalService.getwiki_page_tables(start, end);
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
		return _wiki_page_tableLocalService.dynamicQueryCount(dynamicQuery);
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
		return _wiki_page_tableLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public wiki_page_tableLocalService getWrappedService() {
		return _wiki_page_tableLocalService;
	}

	@Override
	public void setWrappedService(
		wiki_page_tableLocalService wiki_page_tableLocalService) {
		_wiki_page_tableLocalService = wiki_page_tableLocalService;
	}

	private wiki_page_tableLocalService _wiki_page_tableLocalService;
}