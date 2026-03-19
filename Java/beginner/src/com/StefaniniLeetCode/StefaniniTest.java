package com.StefaniniLeetCode;

import java.util.HashMap;
import java.util.Map;

class StefaniniTest {
    public int[] twoSum(int[] nums, int target) {
        // Map to store value and its corresponding index
        // Mapa para armazenar o valor e seu respectivo índice
        Map<Integer, Integer> prevMap = new HashMap<>();

        // Para variavek i = 0, enquanto for menor que o tamanho do array passado,i ++
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            // Calculate the complement (target - current number)
            // Calcula o complemento (alvo - número atual)
            int diff = target - n;

            // If the complement is in the map, we found the pair
            // Se o complemento estiver no mapa, encontramos o par
            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            // Otherwise, add the current number and its index to the map
            // Caso contrário, adiciona o número atual e seu índice ao mapa
            prevMap.put(n, i);
        }

        // Return null if doesn't have solution
        // Retorna nulo se não houver solução (embora o problema garanta uma)
        return null;
    }
}