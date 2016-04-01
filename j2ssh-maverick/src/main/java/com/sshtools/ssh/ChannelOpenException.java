/**
 * Copyright 2003-2016 SSHTOOLS Limited. All Rights Reserved.
 *
 * For product documentation visit https://www.sshtools.com/
 *
 * This file is part of J2SSH Maverick.
 *
 * J2SSH Maverick is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * J2SSH Maverick is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with J2SSH Maverick.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.sshtools.ssh;

/**
 * Exception thrown when a channel cannot be opened, the reason for which should
 * be specified in with any of the constants defined here.
 * 
 * @author Lee David Painter
 */
public class ChannelOpenException extends Exception {

	private static final long serialVersionUID = 1L;

	/** The administrator does not permit this channel to be opened **/
	public static final int ADMINISTRATIVIVELY_PROHIBITED = 1;

	/** The connection could not be established **/
	public static final int CONNECT_FAILED = 2;

	/** The channel type is unknown **/
	public static final int UNKNOWN_CHANNEL_TYPE = 3;

	/** There are no more resources available to open the channel **/
	public static final int RESOURCE_SHORTAGE = 4;

	int reason;

	public ChannelOpenException(String msg, int reason) {
		super(msg);
		this.reason = reason;
	}

	public int getReason() {
		return reason;
	}
}
