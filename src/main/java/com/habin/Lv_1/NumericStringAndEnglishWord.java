package com.habin.Lv_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumericStringAndEnglishWord {

    public static void main(String[] args) {
        System.out.println("solution(\"one4seveneight\") = " + solution("one4seveneight"));
    }

    public static int solution(String s) {
//        48 <= c <= 57 (숫자 ASCII)

        List<Character> charList = new ArrayList<>();
        List<String> strList = new ArrayList<>();

        String[] split = s.split("\\d*$");
        System.out.println("split = " + Arrays.toString(split));

//        for(int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) < 48 || s.charAt(i) > 57) {
//                charList.add(s.split());
//            } else {
//                String numStr = charList.stream().map(String::valueOf).collect(Collectors.joining());
//                strList.add(numStr);
//                strList.add(String.valueOf(s.charAt(i)));
//            }
//
//        }

//        return Integer.parseInt(String.join("", strList));
        return 0;
    }

}
