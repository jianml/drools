package cn.jianml.drools.util;

import java.util.Map;

public class FunctionUtils {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static void setName(Map<String, Object> map) {
        map.put("name", "wujian");
    }
}
