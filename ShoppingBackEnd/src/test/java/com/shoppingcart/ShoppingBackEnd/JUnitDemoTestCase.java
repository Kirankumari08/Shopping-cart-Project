package com.shoppingcart.ShoppingBackEnd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitDemoTestCase {
@Test
	public void testAdd( ){
		JunitDemo j = new JunitDemo();
		int result= j.sum(15, 5);
		assertEquals("add test case", 20, result);
		}

@Test
public void testSub( ){
	JunitDemo j = new JunitDemo();
	int result= j.sub(15, 5);
	assertEquals("sub test case", 10, result);
	
}
}

