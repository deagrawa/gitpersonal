package com.heap.basic;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class jsonObj {

	public static void main(String[] args) throws JSONException {
		String extensionId = "abc";
		String extensionVersion = "1.1.1.";
		
		String abc =  "  {\"plugins\": [{\"id\": \""+extensionId+ "\","
                + "\"version\": \""+extensionVersion+"\"}]}";          
		 

		 System.out.println(new JSONObject(abc));
	}

}
