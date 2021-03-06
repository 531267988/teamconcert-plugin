/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.team.build.internal.hjplugin.rtc.tests;

import org.eclipse.core.runtime.AssertionFailedException;

public class AssertUtil {

	public static void assertEquals(Object expected, Object actual) {
		if (expected == null) {
			if (actual != null) {
				throw new AssertionError("Expected <null> Instead of " + actual.toString());
			}
		} else {
			if (!expected.equals(actual)) {
				throw new AssertionFailedException("Expected: " + expected.toString() + " was: " + actual.toString());
			}
		}
	}
	
	public static void assertTrue(boolean condition, String message) {
		if (!condition) {
			throw new AssertionFailedException(message);
		}
	}
	
	public static void assertFalse(boolean condition, String message) {
		if (condition) {
			throw new AssertionFailedException(message);
		}
	}
	
	public static void fail(String message) {
		throw new AssertionFailedException(message);
	}
}
