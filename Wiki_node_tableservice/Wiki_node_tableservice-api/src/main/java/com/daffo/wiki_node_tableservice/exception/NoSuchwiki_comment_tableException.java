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
package com.daffo.wiki_node_tableservice.exception;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
@ProviderType
public class NoSuchwiki_comment_tableException extends NoSuchModelException {

	public NoSuchwiki_comment_tableException() {
	}

	public NoSuchwiki_comment_tableException(String msg) {
		super(msg);
	}

	public NoSuchwiki_comment_tableException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchwiki_comment_tableException(Throwable cause) {
		super(cause);
	}

}