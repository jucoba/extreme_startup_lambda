package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {
    private final String teamName = "Jubel";

    public String answer(String question) {
        if ("".equals(question)){
            return teamName;
        }

        Matcher sumMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(question);
        Matcher mayorMatcher = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }

        if (mayorMatcher.matches()) {
            int num1 = Integer.parseInt(mayorMatcher.group(1));
            int num2 = Integer.parseInt(mayorMatcher.group(2));
            if (num1 > num2) {
                return  String.valueOf(num1);
            }else {
                return String.valueOf(num2);
            }

        }
        
        return teamName;
    }

}