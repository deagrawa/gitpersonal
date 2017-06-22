package com.heap.basic;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONException;
import org.json.JSONObject;

public class CreateFile {

	
	
	
	public static void main(String[] args) throws IOException {
		//File file = new File ("C:\\lumira2.0\\lumira_Dec2016_ws\\SAPVIInstallDir\\testing\\features");
		String file = "C:\\lumira2.0\\lumira_Dec2016_ws\\SAPVIInstallDir\\testing\\features";

        String extensionId = null;
        String type = "";
        BufferedReader reader = null;
        InputStream stream = null;
        ZipFile zipFile = null;
        Enumeration<? extends ZipEntry> entries = null;
        //String filePath = "C:\\Users\\i309309\\Documents\\Lumira2.0\\sprint5\\com.sap.bi.da.extension.jsonextension_1.29.2.201601041408.zip";

        String filePath = "C:\\Users\\i309309\\Downloads\\lumira-extension-viz-master.zip";

        File file2 = null;
        try {
            zipFile = new ZipFile(filePath);
            entries = zipFile.entries();

            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
 
                if (entry.getName().endsWith(".zip")) {
                    stream = zipFile.getInputStream(entry);
                    reader = new BufferedReader(new InputStreamReader(stream));
                    StringBuilder out = new StringBuilder();
                    String line;
                    /*while ((line = reader.readLine()) != null) {
                        out.append(line);
                    }
                    JSONObject json = new JSONObject(out.toString());
                    extensionId = json.getString("id");*/
                    String[] subPathArray = entry.getName().toString().split("/");
                   /* int index = 0;
                    for ( int i = 0; i < subPathArray.length ; ++i) {
                    	File temp = new File(file.toPath().toString().concat("\\" + subPathArray[i]));
                    	if(temp.exists()) {
                    		continue;
                    	}
                    	else {
                    		index = i;
                    	}
                    }*/
                    
                    String jsonFileName = subPathArray[(subPathArray.length)-1];
                    
                    String dirPath = extensionId.replaceAll("\\.", "\\\\");
                   
                    //String subStr = entry.getName().toString().substring(8, entry.getName().toString().length());
                    //file2 = new File(subStr);
                    //String replacedStr = subStr.replace('/', '\\');
                   // String file3 = file.concat("\\" + dirPath).concat("\\" + jsonFileName);
                    
                    //File file4 = new File(file3);
                    
                   // Files.createFile(pathToFile);
                                        
                    /*if(!file4.exists()) {
                    	Files.createDirectories(file4.toPath().getParent());
                    	Files.createFile(file4.toPath());
                    	Files.write(file4.toPath(), out.toString().getBytes());
                    	//file4.createNewFile();
                    	OutputStream out1 = new BufferedOutputStream(new FileOutputStream(file4));
                    	int read = 0;
                		byte[] bytes = new byte[1024];

                		while ((read = stream.read(bytes)) != -1) {
                			out1.write(bytes, 0, read);
                		}
                		out1.close();
                    
                    	
                    }*/
                    
                    
                    break;
                }
            }
        } catch (IOException e) {
          System.out.println(e.getMessage());
        } /*catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/ finally {
            if (stream != null) {
                stream.close();
                stream = null;
            }
            if (reader != null) {
                reader.close();
                reader = null;
            }
            if (zipFile != null) {
                zipFile.close();
                zipFile = null;
            }
        }
    
		
	}

}
