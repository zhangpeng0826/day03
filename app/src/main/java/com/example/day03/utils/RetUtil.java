package com.example.day03.utils;

public class RetUtil {
    private static volatile RetUtil retUtil;
    public RetUtil() {
    }

    public static RetUtil getRetUtil() {
        if (retUtil==null)
        return retUtil;
    }
}
