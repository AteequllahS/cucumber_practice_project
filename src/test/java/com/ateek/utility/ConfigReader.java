package com.ateek.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {

        try{
            String path = "config.properties";
            FileInputStream in = new FileInputStream("config.properties");
            properties = new Properties();
            properties.load(in);
            in.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static String read(String key){
        return properties.getProperty(key);
    }
}
