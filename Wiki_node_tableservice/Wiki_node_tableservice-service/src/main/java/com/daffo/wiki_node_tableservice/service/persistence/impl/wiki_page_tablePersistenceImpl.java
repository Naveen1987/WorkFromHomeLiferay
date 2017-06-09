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

import com.daffo.wiki_node_tableservice.exception.NoSuchwiki_page_tableException;
import com.daffo.wiki_node_tableservice.model.impl.wiki_page_tableImpl;
import com.daffo.wiki_node_tableservice.model.impl.wiki_page_tableModelImpl;
import com.daffo.wiki_node_tableservice.model.wiki_page_table;
import com.daffo.wiki_node_tableservice.service.persistence.wiki_page_tablePersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
 * The persistence implementation for the wiki_page_table service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see wiki_page_tablePersistence
 * @see com.daffo.wiki_node_tableservice.service.persistence.wiki_page_tableUtil
 * @generated
 */
@ProviderType
public class wiki_page_tablePersistenceImpl extends BasePersistenceImpl<wiki_page_table>
	implements wiki_page_tablePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link wiki_page_tableUtil} to access the wiki_page_table persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = wiki_page_tableImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_page_tableModelImpl.FINDER_CACHE_ENABLED,
			wiki_page_tableImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_page_tableModelImpl.FINDER_CACHE_ENABLED,
			wiki_page_tableImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_page_tableModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NODEID = new FinderPath(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_page_tableModelImpl.FINDER_CACHE_ENABLED,
			wiki_page_tableImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNodeID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NODEID =
		new FinderPath(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_page_tableModelImpl.FINDER_CACHE_ENABLED,
			wiki_page_tableImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNodeID",
			new String[] { Long.class.getName() },
			wiki_page_tableModelImpl.NODEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NODEID = new FinderPath(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_page_tableModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNodeID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the wiki_page_tables where NodeID = &#63;.
	 *
	 * @param NodeID the node ID
	 * @return the matching wiki_page_tables
	 */
	@Override
	public List<wiki_page_table> findByNodeID(long NodeID) {
		return findByNodeID(NodeID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<wiki_page_table> findByNodeID(long NodeID, int start, int end) {
		return findByNodeID(NodeID, start, end, null);
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
	@Override
	public List<wiki_page_table> findByNodeID(long NodeID, int start, int end,
		OrderByComparator<wiki_page_table> orderByComparator) {
		return findByNodeID(NodeID, start, end, orderByComparator, true);
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
	@Override
	public List<wiki_page_table> findByNodeID(long NodeID, int start, int end,
		OrderByComparator<wiki_page_table> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NODEID;
			finderArgs = new Object[] { NodeID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NODEID;
			finderArgs = new Object[] { NodeID, start, end, orderByComparator };
		}

		List<wiki_page_table> list = null;

		if (retrieveFromCache) {
			list = (List<wiki_page_table>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (wiki_page_table wiki_page_table : list) {
					if ((NodeID != wiki_page_table.getNodeID())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_WIKI_PAGE_TABLE_WHERE);

			query.append(_FINDER_COLUMN_NODEID_NODEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(wiki_page_tableModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(NodeID);

				if (!pagination) {
					list = (List<wiki_page_table>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<wiki_page_table>)QueryUtil.list(q,
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
	 * Returns the first wiki_page_table in the ordered set where NodeID = &#63;.
	 *
	 * @param NodeID the node ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wiki_page_table
	 * @throws NoSuchwiki_page_tableException if a matching wiki_page_table could not be found
	 */
	@Override
	public wiki_page_table findByNodeID_First(long NodeID,
		OrderByComparator<wiki_page_table> orderByComparator)
		throws NoSuchwiki_page_tableException {
		wiki_page_table wiki_page_table = fetchByNodeID_First(NodeID,
				orderByComparator);

		if (wiki_page_table != null) {
			return wiki_page_table;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("NodeID=");
		msg.append(NodeID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchwiki_page_tableException(msg.toString());
	}

	/**
	 * Returns the first wiki_page_table in the ordered set where NodeID = &#63;.
	 *
	 * @param NodeID the node ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wiki_page_table, or <code>null</code> if a matching wiki_page_table could not be found
	 */
	@Override
	public wiki_page_table fetchByNodeID_First(long NodeID,
		OrderByComparator<wiki_page_table> orderByComparator) {
		List<wiki_page_table> list = findByNodeID(NodeID, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wiki_page_table in the ordered set where NodeID = &#63;.
	 *
	 * @param NodeID the node ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wiki_page_table
	 * @throws NoSuchwiki_page_tableException if a matching wiki_page_table could not be found
	 */
	@Override
	public wiki_page_table findByNodeID_Last(long NodeID,
		OrderByComparator<wiki_page_table> orderByComparator)
		throws NoSuchwiki_page_tableException {
		wiki_page_table wiki_page_table = fetchByNodeID_Last(NodeID,
				orderByComparator);

		if (wiki_page_table != null) {
			return wiki_page_table;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("NodeID=");
		msg.append(NodeID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchwiki_page_tableException(msg.toString());
	}

	/**
	 * Returns the last wiki_page_table in the ordered set where NodeID = &#63;.
	 *
	 * @param NodeID the node ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wiki_page_table, or <code>null</code> if a matching wiki_page_table could not be found
	 */
	@Override
	public wiki_page_table fetchByNodeID_Last(long NodeID,
		OrderByComparator<wiki_page_table> orderByComparator) {
		int count = countByNodeID(NodeID);

		if (count == 0) {
			return null;
		}

		List<wiki_page_table> list = findByNodeID(NodeID, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public wiki_page_table[] findByNodeID_PrevAndNext(long PageID, long NodeID,
		OrderByComparator<wiki_page_table> orderByComparator)
		throws NoSuchwiki_page_tableException {
		wiki_page_table wiki_page_table = findByPrimaryKey(PageID);

		Session session = null;

		try {
			session = openSession();

			wiki_page_table[] array = new wiki_page_tableImpl[3];

			array[0] = getByNodeID_PrevAndNext(session, wiki_page_table,
					NodeID, orderByComparator, true);

			array[1] = wiki_page_table;

			array[2] = getByNodeID_PrevAndNext(session, wiki_page_table,
					NodeID, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected wiki_page_table getByNodeID_PrevAndNext(Session session,
		wiki_page_table wiki_page_table, long NodeID,
		OrderByComparator<wiki_page_table> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WIKI_PAGE_TABLE_WHERE);

		query.append(_FINDER_COLUMN_NODEID_NODEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(wiki_page_tableModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(NodeID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(wiki_page_table);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<wiki_page_table> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wiki_page_tables where NodeID = &#63; from the database.
	 *
	 * @param NodeID the node ID
	 */
	@Override
	public void removeByNodeID(long NodeID) {
		for (wiki_page_table wiki_page_table : findByNodeID(NodeID,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(wiki_page_table);
		}
	}

	/**
	 * Returns the number of wiki_page_tables where NodeID = &#63;.
	 *
	 * @param NodeID the node ID
	 * @return the number of matching wiki_page_tables
	 */
	@Override
	public int countByNodeID(long NodeID) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NODEID;

		Object[] finderArgs = new Object[] { NodeID };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WIKI_PAGE_TABLE_WHERE);

			query.append(_FINDER_COLUMN_NODEID_NODEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(NodeID);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_NODEID_NODEID_2 = "wiki_page_table.NodeID = ?";

	public wiki_page_tablePersistenceImpl() {
		setModelClass(wiki_page_table.class);
	}

	/**
	 * Caches the wiki_page_table in the entity cache if it is enabled.
	 *
	 * @param wiki_page_table the wiki_page_table
	 */
	@Override
	public void cacheResult(wiki_page_table wiki_page_table) {
		entityCache.putResult(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_page_tableImpl.class, wiki_page_table.getPrimaryKey(),
			wiki_page_table);

		wiki_page_table.resetOriginalValues();
	}

	/**
	 * Caches the wiki_page_tables in the entity cache if it is enabled.
	 *
	 * @param wiki_page_tables the wiki_page_tables
	 */
	@Override
	public void cacheResult(List<wiki_page_table> wiki_page_tables) {
		for (wiki_page_table wiki_page_table : wiki_page_tables) {
			if (entityCache.getResult(
						wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
						wiki_page_tableImpl.class,
						wiki_page_table.getPrimaryKey()) == null) {
				cacheResult(wiki_page_table);
			}
			else {
				wiki_page_table.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all wiki_page_tables.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(wiki_page_tableImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the wiki_page_table.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(wiki_page_table wiki_page_table) {
		entityCache.removeResult(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_page_tableImpl.class, wiki_page_table.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<wiki_page_table> wiki_page_tables) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (wiki_page_table wiki_page_table : wiki_page_tables) {
			entityCache.removeResult(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
				wiki_page_tableImpl.class, wiki_page_table.getPrimaryKey());
		}
	}

	/**
	 * Creates a new wiki_page_table with the primary key. Does not add the wiki_page_table to the database.
	 *
	 * @param PageID the primary key for the new wiki_page_table
	 * @return the new wiki_page_table
	 */
	@Override
	public wiki_page_table create(long PageID) {
		wiki_page_table wiki_page_table = new wiki_page_tableImpl();

		wiki_page_table.setNew(true);
		wiki_page_table.setPrimaryKey(PageID);

		return wiki_page_table;
	}

	/**
	 * Removes the wiki_page_table with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param PageID the primary key of the wiki_page_table
	 * @return the wiki_page_table that was removed
	 * @throws NoSuchwiki_page_tableException if a wiki_page_table with the primary key could not be found
	 */
	@Override
	public wiki_page_table remove(long PageID)
		throws NoSuchwiki_page_tableException {
		return remove((Serializable)PageID);
	}

	/**
	 * Removes the wiki_page_table with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wiki_page_table
	 * @return the wiki_page_table that was removed
	 * @throws NoSuchwiki_page_tableException if a wiki_page_table with the primary key could not be found
	 */
	@Override
	public wiki_page_table remove(Serializable primaryKey)
		throws NoSuchwiki_page_tableException {
		Session session = null;

		try {
			session = openSession();

			wiki_page_table wiki_page_table = (wiki_page_table)session.get(wiki_page_tableImpl.class,
					primaryKey);

			if (wiki_page_table == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchwiki_page_tableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(wiki_page_table);
		}
		catch (NoSuchwiki_page_tableException nsee) {
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
	protected wiki_page_table removeImpl(wiki_page_table wiki_page_table) {
		wiki_page_table = toUnwrappedModel(wiki_page_table);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wiki_page_table)) {
				wiki_page_table = (wiki_page_table)session.get(wiki_page_tableImpl.class,
						wiki_page_table.getPrimaryKeyObj());
			}

			if (wiki_page_table != null) {
				session.delete(wiki_page_table);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (wiki_page_table != null) {
			clearCache(wiki_page_table);
		}

		return wiki_page_table;
	}

	@Override
	public wiki_page_table updateImpl(wiki_page_table wiki_page_table) {
		wiki_page_table = toUnwrappedModel(wiki_page_table);

		boolean isNew = wiki_page_table.isNew();

		wiki_page_tableModelImpl wiki_page_tableModelImpl = (wiki_page_tableModelImpl)wiki_page_table;

		Session session = null;

		try {
			session = openSession();

			if (wiki_page_table.isNew()) {
				session.save(wiki_page_table);

				wiki_page_table.setNew(false);
			}
			else {
				wiki_page_table = (wiki_page_table)session.merge(wiki_page_table);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !wiki_page_tableModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((wiki_page_tableModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NODEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						wiki_page_tableModelImpl.getOriginalNodeID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_NODEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NODEID,
					args);

				args = new Object[] { wiki_page_tableModelImpl.getNodeID() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_NODEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NODEID,
					args);
			}
		}

		entityCache.putResult(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_page_tableImpl.class, wiki_page_table.getPrimaryKey(),
			wiki_page_table, false);

		wiki_page_table.resetOriginalValues();

		return wiki_page_table;
	}

	protected wiki_page_table toUnwrappedModel(wiki_page_table wiki_page_table) {
		if (wiki_page_table instanceof wiki_page_tableImpl) {
			return wiki_page_table;
		}

		wiki_page_tableImpl wiki_page_tableImpl = new wiki_page_tableImpl();

		wiki_page_tableImpl.setNew(wiki_page_table.isNew());
		wiki_page_tableImpl.setPrimaryKey(wiki_page_table.getPrimaryKey());

		wiki_page_tableImpl.setPageID(wiki_page_table.getPageID());
		wiki_page_tableImpl.setPageName(wiki_page_table.getPageName());
		wiki_page_tableImpl.setPageDescription(wiki_page_table.getPageDescription());
		wiki_page_tableImpl.setPageRating(wiki_page_table.getPageRating());
		wiki_page_tableImpl.setPageVersion(wiki_page_table.getPageVersion());
		wiki_page_tableImpl.setNodeID(wiki_page_table.getNodeID());
		wiki_page_tableImpl.setPage_Creation_Date(wiki_page_table.getPage_Creation_Date());
		wiki_page_tableImpl.setPage_creator(wiki_page_table.getPage_creator());

		return wiki_page_tableImpl;
	}

	/**
	 * Returns the wiki_page_table with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the wiki_page_table
	 * @return the wiki_page_table
	 * @throws NoSuchwiki_page_tableException if a wiki_page_table with the primary key could not be found
	 */
	@Override
	public wiki_page_table findByPrimaryKey(Serializable primaryKey)
		throws NoSuchwiki_page_tableException {
		wiki_page_table wiki_page_table = fetchByPrimaryKey(primaryKey);

		if (wiki_page_table == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchwiki_page_tableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return wiki_page_table;
	}

	/**
	 * Returns the wiki_page_table with the primary key or throws a {@link NoSuchwiki_page_tableException} if it could not be found.
	 *
	 * @param PageID the primary key of the wiki_page_table
	 * @return the wiki_page_table
	 * @throws NoSuchwiki_page_tableException if a wiki_page_table with the primary key could not be found
	 */
	@Override
	public wiki_page_table findByPrimaryKey(long PageID)
		throws NoSuchwiki_page_tableException {
		return findByPrimaryKey((Serializable)PageID);
	}

	/**
	 * Returns the wiki_page_table with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wiki_page_table
	 * @return the wiki_page_table, or <code>null</code> if a wiki_page_table with the primary key could not be found
	 */
	@Override
	public wiki_page_table fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
				wiki_page_tableImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		wiki_page_table wiki_page_table = (wiki_page_table)serializable;

		if (wiki_page_table == null) {
			Session session = null;

			try {
				session = openSession();

				wiki_page_table = (wiki_page_table)session.get(wiki_page_tableImpl.class,
						primaryKey);

				if (wiki_page_table != null) {
					cacheResult(wiki_page_table);
				}
				else {
					entityCache.putResult(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
						wiki_page_tableImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
					wiki_page_tableImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return wiki_page_table;
	}

	/**
	 * Returns the wiki_page_table with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param PageID the primary key of the wiki_page_table
	 * @return the wiki_page_table, or <code>null</code> if a wiki_page_table with the primary key could not be found
	 */
	@Override
	public wiki_page_table fetchByPrimaryKey(long PageID) {
		return fetchByPrimaryKey((Serializable)PageID);
	}

	@Override
	public Map<Serializable, wiki_page_table> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, wiki_page_table> map = new HashMap<Serializable, wiki_page_table>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			wiki_page_table wiki_page_table = fetchByPrimaryKey(primaryKey);

			if (wiki_page_table != null) {
				map.put(primaryKey, wiki_page_table);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
					wiki_page_tableImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (wiki_page_table)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_WIKI_PAGE_TABLE_WHERE_PKS_IN);

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

			for (wiki_page_table wiki_page_table : (List<wiki_page_table>)q.list()) {
				map.put(wiki_page_table.getPrimaryKeyObj(), wiki_page_table);

				cacheResult(wiki_page_table);

				uncachedPrimaryKeys.remove(wiki_page_table.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(wiki_page_tableModelImpl.ENTITY_CACHE_ENABLED,
					wiki_page_tableImpl.class, primaryKey, nullModel);
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
	 * Returns all the wiki_page_tables.
	 *
	 * @return the wiki_page_tables
	 */
	@Override
	public List<wiki_page_table> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<wiki_page_table> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<wiki_page_table> findAll(int start, int end,
		OrderByComparator<wiki_page_table> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<wiki_page_table> findAll(int start, int end,
		OrderByComparator<wiki_page_table> orderByComparator,
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

		List<wiki_page_table> list = null;

		if (retrieveFromCache) {
			list = (List<wiki_page_table>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_WIKI_PAGE_TABLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WIKI_PAGE_TABLE;

				if (pagination) {
					sql = sql.concat(wiki_page_tableModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<wiki_page_table>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<wiki_page_table>)QueryUtil.list(q,
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
	 * Removes all the wiki_page_tables from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (wiki_page_table wiki_page_table : findAll()) {
			remove(wiki_page_table);
		}
	}

	/**
	 * Returns the number of wiki_page_tables.
	 *
	 * @return the number of wiki_page_tables
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_WIKI_PAGE_TABLE);

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
		return wiki_page_tableModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wiki_page_table persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(wiki_page_tableImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_WIKI_PAGE_TABLE = "SELECT wiki_page_table FROM wiki_page_table wiki_page_table";
	private static final String _SQL_SELECT_WIKI_PAGE_TABLE_WHERE_PKS_IN = "SELECT wiki_page_table FROM wiki_page_table wiki_page_table WHERE PageID IN (";
	private static final String _SQL_SELECT_WIKI_PAGE_TABLE_WHERE = "SELECT wiki_page_table FROM wiki_page_table wiki_page_table WHERE ";
	private static final String _SQL_COUNT_WIKI_PAGE_TABLE = "SELECT COUNT(wiki_page_table) FROM wiki_page_table wiki_page_table";
	private static final String _SQL_COUNT_WIKI_PAGE_TABLE_WHERE = "SELECT COUNT(wiki_page_table) FROM wiki_page_table wiki_page_table WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "wiki_page_table.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No wiki_page_table exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No wiki_page_table exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(wiki_page_tablePersistenceImpl.class);
}