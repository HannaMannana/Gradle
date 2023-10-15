package org.example;

public class StringUtils {
    public boolean isPositiveNumber(String str) {
        double number = Double.parseDouble(str);
        return number > 0;
    }
}