package com.test;

import junit.framework.TestCase;

import org.junit.Test;

import com.mark.MyUnit;

public class MyUnitTest extends TestCase	{

	@Test
	public void testConcatenate() {
		MyUnit myUnit = new MyUnit();

		String result = myUnit.concatenate("one", "two");

		assertEquals("onetwo", result);

	}
}