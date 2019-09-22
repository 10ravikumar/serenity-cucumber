package com.example.serenitycucumber.util;

import java.util.HashMap;

/**
 * 
 * @author ravi kumar
 * This is a scenario context class used to save intermediate values.
 *
 */
public class Context {
	
	private HashMap<String, Object> con;

	public Context() {
		con = new HashMap<>();
	}
	
	public Object getValue(String value) {
		return con.get(value);
		
	}
	
	public void setValue(String key,Object value) {
		con.put(key, value);
	}
	
	public void clearContext() {
		con.clear();
	}
	
	public void removeValue(String key) {
		con.remove(key);
	}
}
