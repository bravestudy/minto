package org.bravestudy.minto.common.utils;

public class XSSUtil {
    public static String cleanXSS(String value) {
        //You'll need to remove the spaces from the html entities below
        
        value = value.replaceAll("<", "").replaceAll(">", "");
        value = value.replaceAll("'", "");
        value = value.replaceAll("eval\\((.*)\\)", "");
        value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
        value = value.replaceAll("/script", "").replaceAll("script", "");
        
        
//        value = value.replaceAll("<", "& lt;").replaceAll(">", "& gt;");
//        value = value.replaceAll("\\(", "& #40;").replaceAll("\\)", "& #41;");
//        value = value.replaceAll("'", "& #39;");
//        value = value.replaceAll("eval\\((.*)\\)", "");
//        value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
//        value = value.replaceAll("script", "");
        return value;
    }
}
