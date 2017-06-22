package com.heap.basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CreateBundleFile {
	public static String BUNDLE_TOBE_STARTED = "false";
	public static String BUNDLE_START_LEVEL = "4";
	
	public static String ID = "sap.viz.ext.helloworld";

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\i309309\\.sapvi_2\\plugins");
		StringBuilder builder = new StringBuilder();
		File newFile = new File(file.toString().concat("\\extensionBundle.info"));
		if(!newFile.exists()) {
			Files.createFile(newFile.toPath());
		}
		if(file.isDirectory()) {
			for(File fileEntry : file.listFiles()) {
				if(fileEntry.isFile() && !fileEntry.getName().equals("extensionBundle.info")) {
					String fileName = fileEntry.getName();
					String[] str = fileName.split("_");
					for(int i =0; i <str.length; ++i) {
						System.out.println(str[i]);
					}
					String str1 = str[str.length-1].split(".jar")[0].toString();
					System.out.println(str1);
					
					builder.append(str[0] + ", ");
					builder.append(str1 + ", ");
					builder.append(fileEntry.getAbsolutePath() + ", ");
					builder.append(BUNDLE_START_LEVEL + ", ");
					builder.append(BUNDLE_TOBE_STARTED + "\n");
					System.out.println(builder);
					Files.write(newFile.toPath(), builder.toString().getBytes());
					
				
				}
				
				
			}
		}

	}

}
