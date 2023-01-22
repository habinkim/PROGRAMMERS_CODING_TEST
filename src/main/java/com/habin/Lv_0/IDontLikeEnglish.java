package com.habin.Lv_0;

public class IDontLikeEnglish {

    public static void main(String[] args) {

        String numbers = "onetwothreefourfivesixseveneightnine";
        System.out.println("solution(numbers) = " + solution(numbers));

    }

    public static long solution(String numbers) {
        String[] numberList = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < numberList.length; i++) {
            numbers = numbers.replace(numberList[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }

}
