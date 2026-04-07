package com.StefaniniLeetCode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StefaniniTest st = new StefaniniTest();

        // Test 1
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] result1 = st.twoSum(nums1, target1);
        System.out.println("Test 1 - Expected: [0, 1], got: " + Arrays.toString(result1));
        System.out.println("Teste 1 - Esperado: [0, 1], Resultado: " + Arrays.toString(result1));
        System.out.println();

        // Test 2
        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] result2 = st.twoSum(nums2, target2);
        System.out.println("Test 2 - Expected: [1, 2], got: " + Arrays.toString(result2));
        System.out.println("Teste 2 - Esperado: [1, 2], resultado: " + Arrays.toString(result2));
        System.out.println();

        // Test 3
        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] result3 = st.twoSum(nums3, target3);
        System.out.println("Test 3 - Expected: [0, 1], Got: " + Arrays.toString(result3));
        System.out.println("Teste 3 - Esperado: [0, 1], Resultado: " + Arrays.toString(result3));
        System.out.println();

        // Test 3
        int[] nums4 = { 1, 2, 5, 7, 9 };
        int target4 = 10;
        int[] result4 = st.twoSum(nums4, target4);
        System.out.println("Test 4 - Expected: [0, 1], Got: " + Arrays.toString(result4));
        System.out.println("Teste 4 - Esperado: [0, 1], Resultado: " + Arrays.toString(result4));
        System.out.println();
    }
}