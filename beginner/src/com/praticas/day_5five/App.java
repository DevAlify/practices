package com.praticas.day_5five;

import java.util.HashMap;
import java.util.Scanner;

public class App {

    static void main(String[] args) {

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        for (int i =0; i<= name.length(); i++){
            // So pra testar
            hm.put(name.charAt(i), 1);
        }
        System.out.println("Resultado: "+hm);
    }
}
