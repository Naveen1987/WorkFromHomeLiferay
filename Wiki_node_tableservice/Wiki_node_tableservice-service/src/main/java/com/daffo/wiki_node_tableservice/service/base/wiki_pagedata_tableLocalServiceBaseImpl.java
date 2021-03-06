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

package com.daffo.wiki_node_tableservice.service.base;

import aQute.bnd.annotation.ProviderType;

import com.daffo.wiki_node_tableservice.model.wiki_pagedata_table;
import com.daffo.wiki_node_tableservice.service.persistence.wiki_comment_tablePersistence;
import com.daffo.wiki_node_tableservice.service.persistence.wiki_node_tablePersistence;
import com.daffo.wiki_node_tableservice.service.persistence.wiki_page_tablePersistence;
import com.daffo.wiki_node_tableservice.service.persistence.wiki_pagedata_tablePersistence;
import com.daffo.wiki_node_tableservice.service.wiki_pagedata_tableLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the wiki_pagedata_table local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.daffo.wiki_node_tableservice.service.impl.wiki_pagedata_tableLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.daffo.wiki_node_tableservice.service.impl.wiki_pagedata_tableLocalServiceImpl
 * @see com.daffo.wiki_node_tableservice.service.wiki_pagedata_tableLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class wiki_pagedata_tableLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements wiki_pagedata_tableLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.daffo.wiki_node_tableservice.service.wiki_pagedata_tableLocalServiceUtil} to access the wiki_pagedata_table local service.
	 */

	/**
	 * Adds the wiki_pagedata_table to the database. Also notifies the appropriate model listeners.
	 *
	 * @param wiki_pagedata_table the wiki_pagedata_table
	 * @return the wiki_pagedata_table that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public wiki_pagedata_table addwiki_pagedata_table(
		wiki_pagedata_table wiki_pagedata_table) {
		wiki_pagedata_table.setNew(true);

		return wiki_pagedata_tablePersistence.update(wiki_pagedata_table);
	}

	/**
	 * Creates a new wiki_pagedata_table with the primary key. Does not add the wiki_pagedata_table to the database.
	 *
	 * @param Page_ModID the primary key for the new wiki_pagedata_table
	 * @return the new wiki_pagedata_table
	 */
	@Override
	public wiki_pagedata_table createwiki_pagedata_table(long Page_ModID) {
		return wiki_pagedata_tablePersistence.create(Page_ModID);
	}

	/**
	 * Deletes the wiki_pagedata_table with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Page_ModID the primary key of the wiki_pagedata_table
	 * @return the wiki_pagedata_table that was removed
	 * @throws PortalException if a wiki_pagedata_table with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public wiki_pagedata_table deletewiki_pagedata_table(long Page_ModID)
		throws PortalException {
		return wiki_pagedata_tablePersistence.remove(Page_ModID);
	}

	/**
	 * Deletes the wiki_pagedata_table from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wiki_pagedata_table the wiki_pagedata_table
	 * @return the wiki_pagedata_table that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public wiki_pagedata_table deletewiki_pagedata_table(
		wiki_pagedata_table wiki_pagedata_table) {
		return wiki_pagedata_tablePersistence.remove(wiki_pagedata_table);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(wiki_pagedata_table.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return wiki_pagedata_tablePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.wiki_node_tableservice.model.impl.wiki_pagedata_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return wiki_pagedata_tablePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.wiki_node_tableservice.model.impl.wiki_pagedata_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return wiki_pagedata_tablePersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return wiki_pagedata_tablePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return wiki_pagedata_tablePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public wiki_pagedata_table fetchwiki_pagedata_table(long Page_ModID) {
		return wiki_pagedata_tablePersistence.fetchByPrimaryKey(Page_ModID);
	}

	/**
	 * Returns the wiki_pagedata_table with the primary key.
	 *
	 * @param Page_ModID the primary key of the wiki_pagedata_table
	 * @return the wiki_pagedata_table
	 * @throws PortalException if a wiki_pagedata_table with the primary key could not be found
	 */
	@Override
	public wiki_pagedata_table getwiki_pagedata_table(long Page_ModID)
		throws PortalException {
		return wiki_pagedata_tablePersistence.findByPrimaryKey(Page_ModID);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(wiki_pagedata_tableLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(wiki_pagedata_table.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("Page_ModID");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(wiki_pagedata_tableLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(wiki_pagedata_table.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("Page_ModID");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(wiki_pagedata_tableLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(wiki_pagedata_table.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("Page_ModID");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return wiki_pagedata_tableLocalService.deletewiki_pagedata_table((wiki_pagedata_table)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return wiki_pagedata_tablePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the wiki_pagedata_tables.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.wiki_node_tableservice.model.impl.wiki_pagedata_tableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of wiki_pagedata_tables
	 * @param end the upper bound of the range of wiki_pagedata_tables (not inclusive)
	 * @return the range of wiki_pagedata_tables
	 */
	@Override
	public List<wiki_pagedata_table> getwiki_pagedata_tables(int start, int end) {
		return wiki_pagedata_tablePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of wiki_pagedata_tables.
	 *
	 * @return the number of wiki_pagedata_tables
	 */
	@Override
	public int getwiki_pagedata_tablesCount() {
		return wiki_pagedata_tablePersistence.countAll();
	}

	/**
	 * Updates the wiki_pagedata_table in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param wiki_pagedata_table the wiki_pagedata_table
	 * @return the wiki_pagedata_table that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public wiki_pagedata_table updatewiki_pagedata_table(
		wiki_pagedata_table wiki_pagedata_table) {
		return wiki_pagedata_tablePersistence.update(wiki_pagedata_table);
	}

	/**
	 * Returns the wiki_comment_table local service.
	 *
	 * @return the wiki_comment_table local service
	 */
	public com.daffo.wiki_node_tableservice.service.wiki_comment_tableLocalService getwiki_comment_tableLocalService() {
		return wiki_comment_tableLocalService;
	}

	/**
	 * Sets the wiki_comment_table local service.
	 *
	 * @param wiki_comment_tableLocalService the wiki_comment_table local service
	 */
	public void setwiki_comment_tableLocalService(
		com.daffo.wiki_node_tableservice.service.wiki_comment_tableLocalService wiki_comment_tableLocalService) {
		this.wiki_comment_tableLocalService = wiki_comment_tableLocalService;
	}

	/**
	 * Returns the wiki_comment_table persistence.
	 *
	 * @return the wiki_comment_table persistence
	 */
	public wiki_comment_tablePersistence getwiki_comment_tablePersistence() {
		return wiki_comment_tablePersistence;
	}

	/**
	 * Sets the wiki_comment_table persistence.
	 *
	 * @param wiki_comment_tablePersistence the wiki_comment_table persistence
	 */
	public void setwiki_comment_tablePersistence(
		wiki_comment_tablePersistence wiki_comment_tablePersistence) {
		this.wiki_comment_tablePersistence = wiki_comment_tablePersistence;
	}

	/**
	 * Returns the wiki_node_table local service.
	 *
	 * @return the wiki_node_table local service
	 */
	public com.daffo.wiki_node_tableservice.service.wiki_node_tableLocalService getwiki_node_tableLocalService() {
		return wiki_node_tableLocalService;
	}

	/**
	 * Sets the wiki_node_table local service.
	 *
	 * @param wiki_node_tableLocalService the wiki_node_table local service
	 */
	public void setwiki_node_tableLocalService(
		com.daffo.wiki_node_tableservice.service.wiki_node_tableLocalService wiki_node_tableLocalService) {
		this.wiki_node_tableLocalService = wiki_node_tableLocalService;
	}

	/**
	 * Returns the wiki_node_table persistence.
	 *
	 * @return the wiki_node_table persistence
	 */
	public wiki_node_tablePersistence getwiki_node_tablePersistence() {
		return wiki_node_tablePersistence;
	}

	/**
	 * Sets the wiki_node_table persistence.
	 *
	 * @param wiki_node_tablePersistence the wiki_node_table persistence
	 */
	public void setwiki_node_tablePersistence(
		wiki_node_tablePersistence wiki_node_tablePersistence) {
		this.wiki_node_tablePersistence = wiki_node_tablePersistence;
	}

	/**
	 * Returns the wiki_page_table local service.
	 *
	 * @return the wiki_page_table local service
	 */
	public com.daffo.wiki_node_tableservice.service.wiki_page_tableLocalService getwiki_page_tableLocalService() {
		return wiki_page_tableLocalService;
	}

	/**
	 * Sets the wiki_page_table local service.
	 *
	 * @param wiki_page_tableLocalService the wiki_page_table local service
	 */
	public void setwiki_page_tableLocalService(
		com.daffo.wiki_node_tableservice.service.wiki_page_tableLocalService wiki_page_tableLocalService) {
		this.wiki_page_tableLocalService = wiki_page_tableLocalService;
	}

	/**
	 * Returns the wiki_page_table persistence.
	 *
	 * @return the wiki_page_table persistence
	 */
	public wiki_page_tablePersistence getwiki_page_tablePersistence() {
		return wiki_page_tablePersistence;
	}

	/**
	 * Sets the wiki_page_table persistence.
	 *
	 * @param wiki_page_tablePersistence the wiki_page_table persistence
	 */
	public void setwiki_page_tablePersistence(
		wiki_page_tablePersistence wiki_page_tablePersistence) {
		this.wiki_page_tablePersistence = wiki_page_tablePersistence;
	}

	/**
	 * Returns the wiki_pagedata_table local service.
	 *
	 * @return the wiki_pagedata_table local service
	 */
	public wiki_pagedata_tableLocalService getwiki_pagedata_tableLocalService() {
		return wiki_pagedata_tableLocalService;
	}

	/**
	 * Sets the wiki_pagedata_table local service.
	 *
	 * @param wiki_pagedata_tableLocalService the wiki_pagedata_table local service
	 */
	public void setwiki_pagedata_tableLocalService(
		wiki_pagedata_tableLocalService wiki_pagedata_tableLocalService) {
		this.wiki_pagedata_tableLocalService = wiki_pagedata_tableLocalService;
	}

	/**
	 * Returns the wiki_pagedata_table persistence.
	 *
	 * @return the wiki_pagedata_table persistence
	 */
	public wiki_pagedata_tablePersistence getwiki_pagedata_tablePersistence() {
		return wiki_pagedata_tablePersistence;
	}

	/**
	 * Sets the wiki_pagedata_table persistence.
	 *
	 * @param wiki_pagedata_tablePersistence the wiki_pagedata_table persistence
	 */
	public void setwiki_pagedata_tablePersistence(
		wiki_pagedata_tablePersistence wiki_pagedata_tablePersistence) {
		this.wiki_pagedata_tablePersistence = wiki_pagedata_tablePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("com.daffo.wiki_node_tableservice.model.wiki_pagedata_table",
			wiki_pagedata_tableLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.daffo.wiki_node_tableservice.model.wiki_pagedata_table");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return wiki_pagedata_tableLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return wiki_pagedata_table.class;
	}

	protected String getModelClassName() {
		return wiki_pagedata_table.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = wiki_pagedata_tablePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.daffo.wiki_node_tableservice.service.wiki_comment_tableLocalService.class)
	protected com.daffo.wiki_node_tableservice.service.wiki_comment_tableLocalService wiki_comment_tableLocalService;
	@BeanReference(type = wiki_comment_tablePersistence.class)
	protected wiki_comment_tablePersistence wiki_comment_tablePersistence;
	@BeanReference(type = com.daffo.wiki_node_tableservice.service.wiki_node_tableLocalService.class)
	protected com.daffo.wiki_node_tableservice.service.wiki_node_tableLocalService wiki_node_tableLocalService;
	@BeanReference(type = wiki_node_tablePersistence.class)
	protected wiki_node_tablePersistence wiki_node_tablePersistence;
	@BeanReference(type = com.daffo.wiki_node_tableservice.service.wiki_page_tableLocalService.class)
	protected com.daffo.wiki_node_tableservice.service.wiki_page_tableLocalService wiki_page_tableLocalService;
	@BeanReference(type = wiki_page_tablePersistence.class)
	protected wiki_page_tablePersistence wiki_page_tablePersistence;
	@BeanReference(type = wiki_pagedata_tableLocalService.class)
	protected wiki_pagedata_tableLocalService wiki_pagedata_tableLocalService;
	@BeanReference(type = wiki_pagedata_tablePersistence.class)
	protected wiki_pagedata_tablePersistence wiki_pagedata_tablePersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}