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

import com.daffo.wiki_node_tableservice.exception.NoSuchwiki_comment_tableException;
import com.daffo.wiki_node_tableservice.model.impl.wiki_comment_tableImpl;
import com.daffo.wiki_node_tableservice.model.impl.wiki_comment_tableModelImpl;
import com.daffo.wiki_node_tableservice.model.wiki_comment_table;
import com.daffo.wiki_node_tableservice.service.persistence.wiki_comment_tablePersistence;

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
 * The persistence implementation for the wiki_comment_table service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see wiki_comment_tablePersistence
 * @see com.daffo.wiki_node_tableservice.service.persistence.wiki_comment_tableUtil
 * @generated
 */
@ProviderType
public class wiki_comment_tablePersistenceImpl extends BasePersistenceImpl<wiki_comment_table>
	implements wiki_comment_tablePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link wiki_comment_tableUtil} to access the wiki_comment_table persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = wiki_comment_tableImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_comment_tableModelImpl.FINDER_CACHE_ENABLED,
			wiki_comment_tableImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_comment_tableModelImpl.FINDER_CACHE_ENABLED,
			wiki_comment_tableImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_comment_tableModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PAGEID = new FinderPath(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_comment_tableModelImpl.FINDER_CACHE_ENABLED,
			wiki_comment_tableImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPageID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PAGEID =
		new FinderPath(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_comment_tableModelImpl.FINDER_CACHE_ENABLED,
			wiki_comment_tableImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPageID",
			new String[] { Long.class.getName() },
			wiki_comment_tableModelImpl.PAGEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PAGEID = new FinderPath(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_comment_tableModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPageID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the wiki_comment_tables where PageID = &#63;.
	 *
	 * @param PageID the page ID
	 * @return the matching wiki_comment_tables
	 */
	@Override
	public List<wiki_comment_table> findByPageID(long PageID) {
		return findByPageID(PageID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<wiki_comment_table> findByPageID(long PageID, int start, int end) {
		return findByPageID(PageID, start, end, null);
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
	@Override
	public List<wiki_comment_table> findByPageID(long PageID, int start,
		int end, OrderByComparator<wiki_comment_table> orderByComparator) {
		return findByPageID(PageID, start, end, orderByComparator, true);
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
	@Override
	public List<wiki_comment_table> findByPageID(long PageID, int start,
		int end, OrderByComparator<wiki_comment_table> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PAGEID;
			finderArgs = new Object[] { PageID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PAGEID;
			finderArgs = new Object[] { PageID, start, end, orderByComparator };
		}

		List<wiki_comment_table> list = null;

		if (retrieveFromCache) {
			list = (List<wiki_comment_table>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (wiki_comment_table wiki_comment_table : list) {
					if ((PageID != wiki_comment_table.getPageID())) {
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

			query.append(_SQL_SELECT_WIKI_COMMENT_TABLE_WHERE);

			query.append(_FINDER_COLUMN_PAGEID_PAGEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(wiki_comment_tableModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(PageID);

				if (!pagination) {
					list = (List<wiki_comment_table>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<wiki_comment_table>)QueryUtil.list(q,
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
	 * Returns the first wiki_comment_table in the ordered set where PageID = &#63;.
	 *
	 * @param PageID the page ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wiki_comment_table
	 * @throws NoSuchwiki_comment_tableException if a matching wiki_comment_table could not be found
	 */
	@Override
	public wiki_comment_table findByPageID_First(long PageID,
		OrderByComparator<wiki_comment_table> orderByComparator)
		throws NoSuchwiki_comment_tableException {
		wiki_comment_table wiki_comment_table = fetchByPageID_First(PageID,
				orderByComparator);

		if (wiki_comment_table != null) {
			return wiki_comment_table;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("PageID=");
		msg.append(PageID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchwiki_comment_tableException(msg.toString());
	}

	/**
	 * Returns the first wiki_comment_table in the ordered set where PageID = &#63;.
	 *
	 * @param PageID the page ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wiki_comment_table, or <code>null</code> if a matching wiki_comment_table could not be found
	 */
	@Override
	public wiki_comment_table fetchByPageID_First(long PageID,
		OrderByComparator<wiki_comment_table> orderByComparator) {
		List<wiki_comment_table> list = findByPageID(PageID, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wiki_comment_table in the ordered set where PageID = &#63;.
	 *
	 * @param PageID the page ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wiki_comment_table
	 * @throws NoSuchwiki_comment_tableException if a matching wiki_comment_table could not be found
	 */
	@Override
	public wiki_comment_table findByPageID_Last(long PageID,
		OrderByComparator<wiki_comment_table> orderByComparator)
		throws NoSuchwiki_comment_tableException {
		wiki_comment_table wiki_comment_table = fetchByPageID_Last(PageID,
				orderByComparator);

		if (wiki_comment_table != null) {
			return wiki_comment_table;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("PageID=");
		msg.append(PageID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchwiki_comment_tableException(msg.toString());
	}

	/**
	 * Returns the last wiki_comment_table in the ordered set where PageID = &#63;.
	 *
	 * @param PageID the page ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wiki_comment_table, or <code>null</code> if a matching wiki_comment_table could not be found
	 */
	@Override
	public wiki_comment_table fetchByPageID_Last(long PageID,
		OrderByComparator<wiki_comment_table> orderByComparator) {
		int count = countByPageID(PageID);

		if (count == 0) {
			return null;
		}

		List<wiki_comment_table> list = findByPageID(PageID, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public wiki_comment_table[] findByPageID_PrevAndNext(long comment_ID,
		long PageID, OrderByComparator<wiki_comment_table> orderByComparator)
		throws NoSuchwiki_comment_tableException {
		wiki_comment_table wiki_comment_table = findByPrimaryKey(comment_ID);

		Session session = null;

		try {
			session = openSession();

			wiki_comment_table[] array = new wiki_comment_tableImpl[3];

			array[0] = getByPageID_PrevAndNext(session, wiki_comment_table,
					PageID, orderByComparator, true);

			array[1] = wiki_comment_table;

			array[2] = getByPageID_PrevAndNext(session, wiki_comment_table,
					PageID, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected wiki_comment_table getByPageID_PrevAndNext(Session session,
		wiki_comment_table wiki_comment_table, long PageID,
		OrderByComparator<wiki_comment_table> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WIKI_COMMENT_TABLE_WHERE);

		query.append(_FINDER_COLUMN_PAGEID_PAGEID_2);

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
			query.append(wiki_comment_tableModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(PageID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(wiki_comment_table);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<wiki_comment_table> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wiki_comment_tables where PageID = &#63; from the database.
	 *
	 * @param PageID the page ID
	 */
	@Override
	public void removeByPageID(long PageID) {
		for (wiki_comment_table wiki_comment_table : findByPageID(PageID,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(wiki_comment_table);
		}
	}

	/**
	 * Returns the number of wiki_comment_tables where PageID = &#63;.
	 *
	 * @param PageID the page ID
	 * @return the number of matching wiki_comment_tables
	 */
	@Override
	public int countByPageID(long PageID) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PAGEID;

		Object[] finderArgs = new Object[] { PageID };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WIKI_COMMENT_TABLE_WHERE);

			query.append(_FINDER_COLUMN_PAGEID_PAGEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(PageID);

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

	private static final String _FINDER_COLUMN_PAGEID_PAGEID_2 = "wiki_comment_table.PageID = ?";

	public wiki_comment_tablePersistenceImpl() {
		setModelClass(wiki_comment_table.class);
	}

	/**
	 * Caches the wiki_comment_table in the entity cache if it is enabled.
	 *
	 * @param wiki_comment_table the wiki_comment_table
	 */
	@Override
	public void cacheResult(wiki_comment_table wiki_comment_table) {
		entityCache.putResult(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_comment_tableImpl.class, wiki_comment_table.getPrimaryKey(),
			wiki_comment_table);

		wiki_comment_table.resetOriginalValues();
	}

	/**
	 * Caches the wiki_comment_tables in the entity cache if it is enabled.
	 *
	 * @param wiki_comment_tables the wiki_comment_tables
	 */
	@Override
	public void cacheResult(List<wiki_comment_table> wiki_comment_tables) {
		for (wiki_comment_table wiki_comment_table : wiki_comment_tables) {
			if (entityCache.getResult(
						wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
						wiki_comment_tableImpl.class,
						wiki_comment_table.getPrimaryKey()) == null) {
				cacheResult(wiki_comment_table);
			}
			else {
				wiki_comment_table.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all wiki_comment_tables.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(wiki_comment_tableImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the wiki_comment_table.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(wiki_comment_table wiki_comment_table) {
		entityCache.removeResult(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_comment_tableImpl.class, wiki_comment_table.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<wiki_comment_table> wiki_comment_tables) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (wiki_comment_table wiki_comment_table : wiki_comment_tables) {
			entityCache.removeResult(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
				wiki_comment_tableImpl.class, wiki_comment_table.getPrimaryKey());
		}
	}

	/**
	 * Creates a new wiki_comment_table with the primary key. Does not add the wiki_comment_table to the database.
	 *
	 * @param comment_ID the primary key for the new wiki_comment_table
	 * @return the new wiki_comment_table
	 */
	@Override
	public wiki_comment_table create(long comment_ID) {
		wiki_comment_table wiki_comment_table = new wiki_comment_tableImpl();

		wiki_comment_table.setNew(true);
		wiki_comment_table.setPrimaryKey(comment_ID);

		return wiki_comment_table;
	}

	/**
	 * Removes the wiki_comment_table with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param comment_ID the primary key of the wiki_comment_table
	 * @return the wiki_comment_table that was removed
	 * @throws NoSuchwiki_comment_tableException if a wiki_comment_table with the primary key could not be found
	 */
	@Override
	public wiki_comment_table remove(long comment_ID)
		throws NoSuchwiki_comment_tableException {
		return remove((Serializable)comment_ID);
	}

	/**
	 * Removes the wiki_comment_table with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wiki_comment_table
	 * @return the wiki_comment_table that was removed
	 * @throws NoSuchwiki_comment_tableException if a wiki_comment_table with the primary key could not be found
	 */
	@Override
	public wiki_comment_table remove(Serializable primaryKey)
		throws NoSuchwiki_comment_tableException {
		Session session = null;

		try {
			session = openSession();

			wiki_comment_table wiki_comment_table = (wiki_comment_table)session.get(wiki_comment_tableImpl.class,
					primaryKey);

			if (wiki_comment_table == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchwiki_comment_tableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(wiki_comment_table);
		}
		catch (NoSuchwiki_comment_tableException nsee) {
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
	protected wiki_comment_table removeImpl(
		wiki_comment_table wiki_comment_table) {
		wiki_comment_table = toUnwrappedModel(wiki_comment_table);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wiki_comment_table)) {
				wiki_comment_table = (wiki_comment_table)session.get(wiki_comment_tableImpl.class,
						wiki_comment_table.getPrimaryKeyObj());
			}

			if (wiki_comment_table != null) {
				session.delete(wiki_comment_table);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (wiki_comment_table != null) {
			clearCache(wiki_comment_table);
		}

		return wiki_comment_table;
	}

	@Override
	public wiki_comment_table updateImpl(wiki_comment_table wiki_comment_table) {
		wiki_comment_table = toUnwrappedModel(wiki_comment_table);

		boolean isNew = wiki_comment_table.isNew();

		wiki_comment_tableModelImpl wiki_comment_tableModelImpl = (wiki_comment_tableModelImpl)wiki_comment_table;

		Session session = null;

		try {
			session = openSession();

			if (wiki_comment_table.isNew()) {
				session.save(wiki_comment_table);

				wiki_comment_table.setNew(false);
			}
			else {
				wiki_comment_table = (wiki_comment_table)session.merge(wiki_comment_table);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !wiki_comment_tableModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((wiki_comment_tableModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PAGEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						wiki_comment_tableModelImpl.getOriginalPageID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PAGEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PAGEID,
					args);

				args = new Object[] { wiki_comment_tableModelImpl.getPageID() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PAGEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PAGEID,
					args);
			}
		}

		entityCache.putResult(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
			wiki_comment_tableImpl.class, wiki_comment_table.getPrimaryKey(),
			wiki_comment_table, false);

		wiki_comment_table.resetOriginalValues();

		return wiki_comment_table;
	}

	protected wiki_comment_table toUnwrappedModel(
		wiki_comment_table wiki_comment_table) {
		if (wiki_comment_table instanceof wiki_comment_tableImpl) {
			return wiki_comment_table;
		}

		wiki_comment_tableImpl wiki_comment_tableImpl = new wiki_comment_tableImpl();

		wiki_comment_tableImpl.setNew(wiki_comment_table.isNew());
		wiki_comment_tableImpl.setPrimaryKey(wiki_comment_table.getPrimaryKey());

		wiki_comment_tableImpl.setComment_ID(wiki_comment_table.getComment_ID());
		wiki_comment_tableImpl.setComment_data(wiki_comment_table.getComment_data());
		wiki_comment_tableImpl.setComment_User(wiki_comment_table.getComment_User());
		wiki_comment_tableImpl.setComment_Date(wiki_comment_table.getComment_Date());
		wiki_comment_tableImpl.setPageID(wiki_comment_table.getPageID());

		return wiki_comment_tableImpl;
	}

	/**
	 * Returns the wiki_comment_table with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the wiki_comment_table
	 * @return the wiki_comment_table
	 * @throws NoSuchwiki_comment_tableException if a wiki_comment_table with the primary key could not be found
	 */
	@Override
	public wiki_comment_table findByPrimaryKey(Serializable primaryKey)
		throws NoSuchwiki_comment_tableException {
		wiki_comment_table wiki_comment_table = fetchByPrimaryKey(primaryKey);

		if (wiki_comment_table == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchwiki_comment_tableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return wiki_comment_table;
	}

	/**
	 * Returns the wiki_comment_table with the primary key or throws a {@link NoSuchwiki_comment_tableException} if it could not be found.
	 *
	 * @param comment_ID the primary key of the wiki_comment_table
	 * @return the wiki_comment_table
	 * @throws NoSuchwiki_comment_tableException if a wiki_comment_table with the primary key could not be found
	 */
	@Override
	public wiki_comment_table findByPrimaryKey(long comment_ID)
		throws NoSuchwiki_comment_tableException {
		return findByPrimaryKey((Serializable)comment_ID);
	}

	/**
	 * Returns the wiki_comment_table with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wiki_comment_table
	 * @return the wiki_comment_table, or <code>null</code> if a wiki_comment_table with the primary key could not be found
	 */
	@Override
	public wiki_comment_table fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
				wiki_comment_tableImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		wiki_comment_table wiki_comment_table = (wiki_comment_table)serializable;

		if (wiki_comment_table == null) {
			Session session = null;

			try {
				session = openSession();

				wiki_comment_table = (wiki_comment_table)session.get(wiki_comment_tableImpl.class,
						primaryKey);

				if (wiki_comment_table != null) {
					cacheResult(wiki_comment_table);
				}
				else {
					entityCache.putResult(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
						wiki_comment_tableImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
					wiki_comment_tableImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return wiki_comment_table;
	}

	/**
	 * Returns the wiki_comment_table with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param comment_ID the primary key of the wiki_comment_table
	 * @return the wiki_comment_table, or <code>null</code> if a wiki_comment_table with the primary key could not be found
	 */
	@Override
	public wiki_comment_table fetchByPrimaryKey(long comment_ID) {
		return fetchByPrimaryKey((Serializable)comment_ID);
	}

	@Override
	public Map<Serializable, wiki_comment_table> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, wiki_comment_table> map = new HashMap<Serializable, wiki_comment_table>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			wiki_comment_table wiki_comment_table = fetchByPrimaryKey(primaryKey);

			if (wiki_comment_table != null) {
				map.put(primaryKey, wiki_comment_table);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
					wiki_comment_tableImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (wiki_comment_table)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_WIKI_COMMENT_TABLE_WHERE_PKS_IN);

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

			for (wiki_comment_table wiki_comment_table : (List<wiki_comment_table>)q.list()) {
				map.put(wiki_comment_table.getPrimaryKeyObj(),
					wiki_comment_table);

				cacheResult(wiki_comment_table);

				uncachedPrimaryKeys.remove(wiki_comment_table.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(wiki_comment_tableModelImpl.ENTITY_CACHE_ENABLED,
					wiki_comment_tableImpl.class, primaryKey, nullModel);
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
	 * Returns all the wiki_comment_tables.
	 *
	 * @return the wiki_comment_tables
	 */
	@Override
	public List<wiki_comment_table> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<wiki_comment_table> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<wiki_comment_table> findAll(int start, int end,
		OrderByComparator<wiki_comment_table> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<wiki_comment_table> findAll(int start, int end,
		OrderByComparator<wiki_comment_table> orderByComparator,
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

		List<wiki_comment_table> list = null;

		if (retrieveFromCache) {
			list = (List<wiki_comment_table>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_WIKI_COMMENT_TABLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WIKI_COMMENT_TABLE;

				if (pagination) {
					sql = sql.concat(wiki_comment_tableModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<wiki_comment_table>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<wiki_comment_table>)QueryUtil.list(q,
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
	 * Removes all the wiki_comment_tables from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (wiki_comment_table wiki_comment_table : findAll()) {
			remove(wiki_comment_table);
		}
	}

	/**
	 * Returns the number of wiki_comment_tables.
	 *
	 * @return the number of wiki_comment_tables
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_WIKI_COMMENT_TABLE);

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
		return wiki_comment_tableModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wiki_comment_table persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(wiki_comment_tableImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_WIKI_COMMENT_TABLE = "SELECT wiki_comment_table FROM wiki_comment_table wiki_comment_table";
	private static final String _SQL_SELECT_WIKI_COMMENT_TABLE_WHERE_PKS_IN = "SELECT wiki_comment_table FROM wiki_comment_table wiki_comment_table WHERE comment_ID IN (";
	private static final String _SQL_SELECT_WIKI_COMMENT_TABLE_WHERE = "SELECT wiki_comment_table FROM wiki_comment_table wiki_comment_table WHERE ";
	private static final String _SQL_COUNT_WIKI_COMMENT_TABLE = "SELECT COUNT(wiki_comment_table) FROM wiki_comment_table wiki_comment_table";
	private static final String _SQL_COUNT_WIKI_COMMENT_TABLE_WHERE = "SELECT COUNT(wiki_comment_table) FROM wiki_comment_table wiki_comment_table WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "wiki_comment_table.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No wiki_comment_table exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No wiki_comment_table exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(wiki_comment_tablePersistenceImpl.class);
}