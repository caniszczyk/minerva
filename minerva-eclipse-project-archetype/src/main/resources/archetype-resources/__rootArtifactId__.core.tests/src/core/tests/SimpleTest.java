#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*******************************************************************************
 * Copyright (C) 2011, Chris Aniszczyk <caniszczyk@gmail.com>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package ${package}.core.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import ${package}.core.Model;
import org.junit.Test;

public class SimpleTest {
	
	@Test
	public void simpleTest() {
		Model model = new Model();
		assertNull(model.getId());
		model.setId("id");
		assertEquals("id", model.getId());
	}

}
