package com.lqas.filestutorial;


import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.util.Properties;

/*
 * Class that extracts properties from the prop file.
 */
public class PropertyLoader {

	private static final String PROP_FILE = "/application.properties";

	public static String loadProperty(String name) {
		Properties props = new Properties();
		try {
			props.load(PropertyLoader.class.getResourceAsStream(PROP_FILE));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String value = null;
		
		if (name != null) {
			value = props.getProperty(name);
		}
		
		if (value == null) {
			System.out.println("Value for property " + name + " not found");
			value = "";
		}
		
		return value;
	}
}