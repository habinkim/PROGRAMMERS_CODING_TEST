package com.habin.Lv_0;

/**
 * 문제 설명 <p>
 * 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요. <p>
 * <p>
 * <p>
 * 제한사항 <p>
 * 2 < common의 길이 < 1,000 <p>
 * -1,000 < common의 원소 < 2,000 <p></p>
 * common의 원소는 모두 정수입니다. <p></p>
 * 등차수열 혹은 등비수열이 아닌 경우는 없습니다. <p></p>
 * 등비수열인 경우 공비는 0이 아닌 정수입니다. <p></p>
 * <p>
 * 입출력 예 <p>
 * common	result <p></p>
 * [1, 2, 3, 4]	5 <p></p>
 * [2, 4, 8]	16 <p></p>
 */
public class NextNumber {

    public static void main(String[] args) {
        int[] common = {1, 2, 3, 4};
        System.out.println(solution(common));
    }

    public static int solution(int[] common) {
        int answer = 0;

        if (common[1] - common[0] == common[2] - common[1]) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }

        return answer;
    }
}
