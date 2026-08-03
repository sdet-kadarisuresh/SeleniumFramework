package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.*;
public class ConfigReader {
    private static Properties properties = new Properties();
    static {
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");

            // Load all properties into the Properties object
            properties.load(file);

            // Close the file after reading
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Generic method to return any property value
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }



}
