package org.example;

import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        StringUtils stringUtils = new StringUtils();

        return Arrays.stream(str).allMatch(stringUtils::isPositiveNumber);
    }
}