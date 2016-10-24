/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.string;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author iman
 */
public class RegExDemo {

    static String payload = "{$kota} adalah kota yang indah, "
            + "karena {$kota} punya banyak {$fitur} kota";

    public static void main(String[] args) {
        Map<String, String> params = new HashMap<String, String>() {
            {
                put("kota", "Bandung");
                put("fitur", "taman");
            }
        };

        System.out.println(replaceTag(payload, params));
        findDebug(payload, "\\w*");
    }

    static String replaceTag(String text, Map<String, String> params) {
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String tag = entry.getKey();
            String value = entry.getValue();
            String patternStr = "\\{\\$(" + tag + ")\\}";
            text = text.replaceAll(patternStr, value);
        }
        return text;
    }

    static void findDebug(String text, String tag) {
        String patternStr = "\\{\\$(" + tag + ")\\}";
        Pattern p = Pattern.compile(patternStr);
        Matcher m = p.matcher(text);

        int start = 0;
        while (m.find(start)) {
            int count = m.groupCount();
            start = m.end();
            System.out.println("group count is " + count);
            for (int i = 1; i <= count; i++) {
                System.out.println("m.group(i):" + m.group(i));
            }
        }
    }
}
