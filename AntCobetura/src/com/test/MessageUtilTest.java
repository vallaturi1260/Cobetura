package com.test;

import junit.framework.TestCase;

import org.junit.Test;

import com.mark.MessageUtil;

public class MessageUtilTest extends TestCase {

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		assertEquals(message, messageUtil.printMessage());
	}

}
