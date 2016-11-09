package com.codencare.learning.environment;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesFileDemo {

    public static void main(String[] args) {

        Properties prop = new Properties();
        InputStream input = null;

        try {

            String filename = "konfigurasi.properties";
            input = PropertiesFileDemo.class.getClassLoader().getResourceAsStream(filename);
            if (input == null) {
                System.out.printf("file configurasi %s gak ketemu ", filename);
                return;
            }

            //baca properties
            prop.load(input);

            //tampilkan ke layar
            System.out.println(prop.getProperty("database"));
            System.out.println(prop.getProperty("dbuser"));
            System.out.println(prop.getProperty("dbpassword"));
            
            Enumeration<?> e =  prop.propertyNames();
            while (e.hasMoreElements()) {
                String el =(String) e.nextElement();
                System.out.printf("%s = %s\n",el ,prop.getProperty(el));
            }
            

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
