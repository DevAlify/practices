package com.praticas.day_2two;

import java.util.Scanner;

public class AppParOuImpar {
    public static void main(String args[]) {
        // Par ou ímpar
        // Leia um número inteiro e diga se ele é par ou ímpar.
        Scanner c1 = new Scanner(System.in);
        System.out.print("Digite o valor que deseja saber: ");
        int valor = c1.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O número é PAR!");
        } else {
            System.out.println("O número é IMPAR!");
        }
        c1.close();
    }
}
