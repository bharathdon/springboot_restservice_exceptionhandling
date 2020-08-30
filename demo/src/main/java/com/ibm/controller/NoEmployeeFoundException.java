package com.ibm.controller;

public class NoEmployeeFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoEmployeeFoundException(String msg) {

		super(msg);
	}
}
