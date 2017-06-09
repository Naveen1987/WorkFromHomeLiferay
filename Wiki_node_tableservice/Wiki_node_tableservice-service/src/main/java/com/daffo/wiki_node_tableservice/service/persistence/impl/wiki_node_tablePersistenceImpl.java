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

package com.daffo.wiki_node_tableservice.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.daffo.wiki_node_tableservice.exception.NoSuchwiki_node_tableException;
import com.daffo.wiki_node_tableservice.model.impl.wiki_node_tableImpl;
import com.daffo.wiki_node_tableservice.model.impl.wiki_node_tableModelImpl;
import com.daffo.wiki_node_tableservice.model.wiki_node_table;
import com.daffo.wiki_node_tableservice.service.persistence.wiki_node_tablePersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the wiki_node_table service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see wiki_node_tablePersistence
 * @see com.daffo.wiki_node_tableservice.service.persistence.wiki_node_tableUtil
 * @generated
 */
@ProviderType
public class wiki_node_tablePersistenceImpl extends BasePersistenceImpl<wiki_node_table>
	implements wiki_node_tablePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link wiki_node_tableUtil} to access the wiki_node_table persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = wiki_node_tableImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(wiki_node_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_node_tableModelImpl.FINDER_CACHE_ENABLED,
			wiki_node_tableImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(wiki_node_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_node_tableModelImpl.FINDER_CACHE_ENABLED,
			wiki_node_tableImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(wiki_node_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_node_tableModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public wiki_node_tablePersistenceImpl() {
		setModelClass(wiki_node_table.class);
	}

	/**
	 * Caches the wiki_node_table in the entity cache if it is enabled.
	 *
	 * @param wiki_node_table the wiki_node_table
	 */
	@Override
	public void cacheResult(wiki_node_table wiki_node_table) {
		entityCache.putResult(wiki_node_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_node_tableImpl.class, wiki_node_table.getPrimaryKey(),
			wiki_node_table);

		wiki_node_table.resetOriginalValues();
	}

	/**
	 * Caches the wiki_node_tables in the entity cache if it is enabled.
	 *
	 * @param wiki_node_tables the wiki_node_tables
	 */
	@Override
	public void cacheResult(List<wiki_node_table> wiki_node_tables) {
		for (wiki_node_table wiki_node_table : wiki_node_tables) {
			if (entityCache.getResult(
						wiki_node_tableModelImpl.ENTITY_CACHE_ENABLED,
						wiki_node_tableImpl.class,
						wiki_node_table.getPrimaryKey()) == null) {
				cacheResult(wiki_node_table);
			}
			else {
				wiki_node_table.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all wiki_node_tables.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(wiki_node_tableImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the wiki_node_table.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(wiki_node_table wiki_node_table) {
		entityCache.removeResult(wiki_node_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_node_tableImpl.class, wiki_node_table.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<wiki_node_table> wiki_node_tables) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (wiki_node_table wiki_node_table : wiki_node_tables) {
			entityCache.removeResult(wiki_node_tableModelImpl.ENTITY_CACHE_ENABLED,
				wiki_node_tableImpl.class, wiki_node_table.getPrimaryKey());
		}
	}

	/**
	 * Creates a new wiki_node_table with the primary key. Does not add the wiki_node_table to the database.
	 *
	 * @param NodeID the primary key for the new wiki_node_table
	 * @return the new wiki_node_table
	 */
	@Override
	public wiki_node_table create(long NodeID) {
		wiki_node_table wiki_node_table = new wiki_node_tableImpl();

		wiki_node_table.setNew(true);
		wiki_node_table.setPrimaryKey(NodeID);

		return wiki_node_table;
	}

	/**
	 * Removes the wiki_node_table with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param NodeID the primary key of the wiki_node_table
	 * @return the wiki_node_table that was removed
	 * @throws NoSuchwiki_node_tableException if a wiki_node_table with the primary key could not be found
	 */
	@Override
	public wiki_node_table remove(long NodeID)
		throws NoSuchwiki_node_tableException {
		return remove((Serializable)NodeID);
	}

	/**
	 * Removes the wiki_node_table with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wiki_node_table
	 * @return the wiki_node_table that was removed
	 * @throws NoSuchwiki_node_tableException if a wiki_node_table with the primary key could not be found
	 */
	@Override
	public wiki_node_table remove(Serializable primaryKey)
		throws NoSuchwiki_node_tableException {
		Session session = null;

		try {
			session = openSession();

			wiki_node_table wiki_node_table = (wiki_node_table)session.get(wiki_node_tableImpl.class,
					primaryKey);

			if (wiki_node_table == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchwiki_node_tableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(wiki_node_table);
		}
		catch (NoSuchwiki_node_tableException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected wiki_node_table removeImpl(wiki_node_table wiki_node_table) {
		wiki_node_table = toUnwrappedModel(wiki_node_table);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wiki_node_table)) {
				wiki_node_table = (wiki_node_table)session.get(wiki_node_tableImpl.class,
						wiki_node_table.getPrimaryKeyObj());
			}

			if (wiki_node_table != null) {
				session.delete(wiki_node_table);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (wiki_node_table != null) {
			clearCache(wiki_node_table);
		}

		return wiki_node_table;
	}

	@Override
	public wiki_node_table updateImpl(wiki_node_table wiki_node_table) {
		wiki_node_table = toUnwrappedModel(wiki_node_table);

		boolean isNew = wiki_node_table.isNew();

		Session session = null;

		try {
			session = openSession();

			if (wiki_node_table.isNew()) {
				session.save(wiki_node_table);

				wiki_node_table.setNew(false);
			}
			else {
				wiki_node_table = (wiki_node_table)session.merge(wiki_node_table);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(wiki_node_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_node_tableImpl.class, wiki_node_table.getPrimaryKey(),
			wiki_node_table, false);

		wiki_node_table.resetOriginalValues();

		return wiki_node_table;
	}

	protected wiki_node_table toUnwrappedModel(wiki_node_table wiki_node_table) {
		if (wiki_node_table instanceof wiki_node_tableImpl) {
			return wiki_node_table;
		}

		wiki_node_tableImpl wiki_node_tableImpl = new wiki_node_tableImpl();

		wiki_node_tableImpl.setNew(wiki_node_table.isNew());
		wiki_node_tableImpl.setPrimaryKey(wiki_node_table.getPrimaryKey());

		wiki_node_tableImpl.setNodeID(wiki_node_table.getNodeID());
		wiki_node_tableImpl.setNodeName(wiki_node_table.getNodeName());
		wiki_node_tableImpl.setNodeDescription(wiki_node_table.getNodeDescription());
		wiki_node_tableImpl.setNodeCreationDate(wiki_node_table.getNodeCreationDate());
		wiki_node_tableImpl.setNodeCreator(wiki_node_table.getNodeCreator());
		wiki_node_tableImpl.setNodeModificationDate(wiki_node_table.getNodeModificationDate());

		return wiki_node_tableImpl;
	}

	/**
	 * Returns the wiki_node_table with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the wiki_node_table
	 * @return the wiki_node_table
	 * @throws NoSuchwiki_node_tableException if a wiki_node_table with the primary key could not be found
	 */
	@Override
	public wiki_node_table findByPrimaryKey(Serializable primaryKey)
		throws NoSuchwiki_node_tableException {
		wiki_node_table wiki_node_table = fetchByPrimaryKey(primaryKey);

		if (wiki_node_table == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchwiki_node_tableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return wiki_node_table;
	}

	/**
	 * Returns the wiki_node_table with the primary key or throws a {@link NoSuchwiki_node_tableException} if it could not be found.
	 *
	 * @param NodeID the primary key of the wiki_node_table
	 * @return the wiki_node_table
	 * @throws NoSuchwiki_node_tableException if a wiki_node_table with the primary key could not be found
	 */
	@Override
	public wiki_node_table findByPrimaryKey(long NodeID)
		throws NoSuchwiki_node_tableException {
		return findByPrimaryKey((Serializable)NodeID);
	}

	/**
	 * Returns the wiki_node_table with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wiki_node_table
	 * @return the wiki_node_table, or <code>null</code> if a wiki_node_table with the primary key could not be found
	 */
	@Override
	public wiki_node_table fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(wiki_node_tableModelImpl.ENTITY_CACHE_ENABLED,
				wiki_node_tableImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		wiki_node_table wiki_node_table = (wiki_node_table)serializable;

		if (wiki_node_table == null) {
			Session session = null;

			try {
				session = openSession();

				wiki_node_table = (wiki_node_table)session.get(wiki_node_tableImpl.class,
						primaryKey);

				if (wiki_node_table != null) {
					cacheResult(wiki_node_table);
				}
				else {
					entityCache.putResult(wiki_node_tableModelImpl.ENTITY_CACHE_ENABLED,
						wiki_node_tableImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(wiki_node_tableModelImpl.ENTITY_CACHE_ENABLED,
					wiki_node_tableImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return wiki_node_table;
	}

	/**
	 * Returns the wiki_node_table with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param NodeID the primary key of the wiki_node_table
	 * @return the wiki_node_table, or <code>null</code> if a wiki_node_table with the primary key could not be found
	 */
	@Override
	public wiki_node_table fetchByPrimaryKey(long NodeID) {
		return fetchByPrimaryKey((Serializable)NodeID);
	}

	@Override
	public Map<Serializable, wiki_node_table> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, wiki_node_table> map = new HashMap<Serializable, wiki_node_table>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			wiki_node_table wiki_node_table = fetchByPrimaryKey(primaryKey);

			if (wiki_node_table != null) {
				map.put(primaryKey, wiki_node_table);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(wiki_node_tableModelImpl.ENTITY_CACHE_ENABLED,
					wiki_node_tableImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (wiki_node_table)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_WIKI_NODE_TABLE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (wiki_node_table wiki_node_table : (List<wiki_node_table>)q.list()) {
				map.put(wiki_node_table.getPrimaryKeyObj(), wiki_node_table);

				cacheResult(wiki_node_table);

				uncachedPrimaryKeys.remove(wiki_node_table.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(wiki_node_tableModelImpl.ENTITY_CACHE_ENABLED,
					wiki_node_tableImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the wiki_node_tables.
	 *
	 * @return the wiki_node_tables
	 */
	@Override
	public List<wiki_node_table> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<wiki_node_table> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<wiki_node_table> findAll(int start, int end,
		OrderByComparator<wiki_node_table> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<wiki_node_table> findAll(int start, int end,
		OrderByComparator<wiki_node_table> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<wiki_node_table> list = null;

		if (retrieveFromCache) {
			list = (List<wiki_node_table>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_WIKI_NODE_TABLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WIKI_NODE_TABLE;

				if (pagination) {
					sql = sql.concat(wiki_node_tableModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<wiki_node_table>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<wiki_node_table>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the wiki_node_tables from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (wiki_node_table wiki_node_table : findAll()) {
			remove(wiki_node_table);
		}
	}

	/**
	 * Returns the number of wiki_node_tables.
	 *
	 * @return the number of wiki_node_tables
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_WIKI_NODE_TABLE);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return wiki_node_tableModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wiki_node_table persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(wiki_node_tableImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_WIKI_NODE_TABLE = "SELECT wiki_node_table FROM wiki_node_table wiki_node_table";
	private static final String _SQL_SELECT_WIKI_NODE_TABLE_WHERE_PKS_IN = "SELECT wiki_node_table FROM wiki_node_table wiki_node_table WHERE NodeID IN (";
	private static final String _SQL_COUNT_WIKI_NODE_TABLE = "SELECT COUNT(wiki_node_table) FROM wiki_node_table wiki_node_table";
	private static final String _ORDER_BY_ENTITY_ALIAS = "wiki_node_table.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No wiki_node_table exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(wiki_node_tablePersistenceImpl.class);
}