package com.habin.Lv_1;

import java.util.Arrays;
import java.util.Objects;

public class Ponketmon {

    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 2};

        System.out.println("solution(nums) = " + solution(nums));
    }

    public static class MyHash {
        public Slot[] hashTable;

        public MyHash(Integer size) {
            this.hashTable = new Slot[size];
        }

        public static class Slot {
            Integer key;
            Integer value;

            public Slot(Integer key, Integer value) {
                this.key = key;
                this.value = value;
            }
        }

        public int hashFunc(Integer key, Integer length) {
            return key % length;
        }

        public void saveData(Integer value, Integer length) {
            int address = hashFunc(value, length);
            if (this.hashTable[address] != null) {
                this.hashTable[address].value = value;
            } else {
                this.hashTable[address] = new Slot(address, value);
            }
        }
    }

    public static int solution(int[] nums) {
        int length = nums.length / 2;
        MyHash myHash = new MyHash(length);
        for (int i = 0; i < nums.length; i++) {
            myHash.saveData(nums[i], length);
        }

        return (int)Arrays.stream(myHash.hashTable).filter(Objects::nonNull).count();
    }

}
