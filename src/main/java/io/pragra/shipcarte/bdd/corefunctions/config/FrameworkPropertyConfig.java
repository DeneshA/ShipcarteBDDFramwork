package io.pragra.shipcarte.bdd.corefunctions.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

public class FrameworkPropertyConfig {

    private String propertyFile = "framework.properties";
    private static FrameworkPropertyConfig instance;
    private Properties properties;

    public FrameworkPropertyConfig(){
        properties =  new Properties();
        try{
            properties.load(new FileInputStream(Paths.get("src","main","resources",propertyFile).toFile()));
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        if(instance == null){
            instance = new FrameworkPropertyConfig();
        }
        return  instance.properties.getProperty(key);
    }

}
