package com.mark;

public class MessageUtil {

	private String message;

	// Constructor
	// @param message to be printed

	public MessageUtil(String message) {
		System.out.println("This is constructor");
		this.message = message;
	}

	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}
}