package com.example.demo.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class utilKw {
	private final Logger logger = LoggerFactory.getLogger(utilKw.class);
	
	/*
	 * isEmpty("") 		: 	true
	 * isEmpty(" ") 	: 	true
	 * isEmpty("abc") 	:	false
	 */
	public static boolean isEmpty(String str) {
		if (str != null && !str.trim().isEmpty()) {
			return false;
		}
		return true;
	}
	
	/*
	 * isEmpty("") 		: 	false
	 * isEmpty(" ") 	: 	false
	 * isEmpty("abc") 	:	true
	 */
	public static boolean isNotEmpty(String str) {
		if (str != null && !str.trim().isEmpty()) {
			return true;
		}
		return false;
	}
}
