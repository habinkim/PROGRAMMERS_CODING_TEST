package com.habin.Lv_0;

import java.util.Arrays;

/**
 * 문제 설명 <p></p>
 * 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요. <p></p>
 * <p></p>
 * 제한사항 <p></p>
 * 1 ≤ num ≤ 100 <p></p>
 * 0 ≤ total ≤ 1000 <p></p>
 * num개의 연속된 수를 더하여 total이 될 수 없는 테스트 케이스는 없습니다. <p></p>
 * 입출력 예 <p></p>
 * num	total	result <p></p>
 * 3	12	[3, 4, 5] <p></p>
 * 5	15	[1, 2, 3, 4, 5] <p></p>
 * 4	14	[2, 3, 4, 5] <p></p>
 * 5	5	[-1, 0, 1, 2, 3] <p></p>
 */

public class SumOfConsecutiveNumbers {

    public static void main(String[] args) {
        System.out.println("solution(3, 12) = " + Arrays.toString(solution(3, 12)));
    }

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];

//        num = 3, total = 12
//        total / num = 4
//        num / 2 = 1.5
//        4 - 1.5 = 2.5
//        Math.ceil(2.5) = 3

        double min = Math.ceil((double)total / (double)num - Math.floor((double)num / 2));

        for(int i = 0; i < num; i++) {
            answer[i] = (int) min + i;
        }
        return answer;
    }

}
