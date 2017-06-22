package com.heap.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.json.JSONException;
import org.json.JSONObject;

public class extension_identifier {

	
	public static void main(String[] args) throws IOException, JSONException {
	   // ZipFile zipFile = new ZipFile("C:\\Users\\i309309\\Documents\\Lumira2.0\\sprint5\\com.sap.bi.da.extension.jsonextension_1.29.2.201601041408.zip");

		ZipFile zipFile = new ZipFile("C:\\Users\\i309309\\Downloads\\lumira-extension-viz-master.zip");

	    Enumeration<? extends ZipEntry> entries = zipFile.entries();

	    while(entries.hasMoreElements()){
	        ZipEntry entry = entries.nextElement();
	        if(entry.getName().endsWith(".json")){
	        	System.out.println(entry.getName());
	        	InputStream stream = zipFile.getInputStream(entry);
	        	BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
	        	StringBuilder out = new StringBuilder();
	            String line;
	            while ((line = reader.readLine()) != null) {
	                out.append(line);
	            }
	            System.out.println(out.toString());   //Prints the string content read from input stream
	            reader.close();
	            JSONObject json = new JSONObject(out.toString());
	            String json1 =  json.getString("id");
	            if(json1.contains("viz")) {
	            	System.out.println("Viz extension");
	            }
	            else if(json1.contains("da")) {
	            	System.out.println("Da extension");
	            }
	            else {
	            	System.out.println("No id defined");
	            }
	        	System.out.println("id = " +json1);
	        	break;
	        }
	        
	    }
	}
}
