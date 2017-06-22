package com.heap.basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DeleteFile {

	
	public static void main(String[] args) throws IOException {
		String file = "C:\\lumira2.0\\lumira_Dec2016_ws\\SAPVIInstallDir\\testing\\features";

		String extensionId = "com.sap.bi.da.extension.jsonextension";
		String dirPath = extensionId.replaceAll("\\.", "\\\\");
		
		String absPath = file.concat(dirPath);
		
		File fileP = new File(absPath);
		Files.deleteIfExists(fileP.toPath());
		
	}

}
