package com.resonances.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class can be utilized for reading and Writing the .properties files
 * 
 * @author ADMIN
 *
 */
public class PropUtil {
	/**
	 * 
	 * @param filePath
	 * @param key
	 * @return
	 */

	public String  getValue(String filePath, String key) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		Properties prop = new Properties();
		String value = null;
		try {
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;

	}

	public String[] getLocator(String key) {
		String dir = System.getProperty("user.dir") + "/src/main/resources/OR.Properties";
	String locator = getValue(dir, key);
	String[] parts = locator.split("##");
	
	return parts ;
	}

}
