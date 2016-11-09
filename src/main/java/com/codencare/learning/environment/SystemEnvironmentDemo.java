package com.codencare.learning.environment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * jalankan dari console dgn cara mvn exec:java
 * -Dexec.mainClass="com.codencare.learning.environment.SystemEnviromentDemo"
 *
 * @author iman
 */
public class SystemEnvironmentDemo {

    public static void main(String[] args) {
        try {
            Map<String, String> env = System.getenv();
            for (Map.Entry<String, String> entry : env.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.printf("%s = %s\n", key, value);
            }
            Process proc = Runtime.getRuntime().exec("dir");
            BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            do {
                System.out.println(reader.readLine());
            } while (reader.ready());
        } catch (IOException ex) {
            Logger.getLogger(SystemEnvironmentDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
