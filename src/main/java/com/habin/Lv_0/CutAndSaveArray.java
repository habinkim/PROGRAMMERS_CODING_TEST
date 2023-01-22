package com.habin.Lv_0;

import java.util.Arrays;

public class CutAndSaveArray {

    public static void main(String[] args) {
        String my_arr = "abc1Addfggg4556b";
        int n = 6;
        System.out.println("solution(my_arr, n) = " + Arrays.toString(solution(my_arr, n)));
    }

    public static String[] solution(String my_str, int n) {
        int answerLength = (int) Math.ceil((double) my_str.length() / n);
        String[] answer = new String[answerLength];

        for (int i = 0; i < answerLength; i++) {
            int index = i * n;
            if (index + n > my_str.length()) {
                answer[i] = my_str.substring(index);
            } else {
                answer[i] = my_str.substring(index, index + n);
            }
        }

        return answer;
    }

}
