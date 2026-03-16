package com.praticas.day_two;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AppTabuada {

    public static void main(String args[]) {
        // Tabuada
        // Receba um número e exiba sua tabuada de 1 a 10.
        Scanner c1 = new Scanner(System.in);
        System.out.print("Digite o número que deseja ver a Tabuada de 10: ");

        exibirTabuada(c1.nextLine());
        c1.close();
    }

    protected static void exibirTabuada(String num) {
        double numero = Double.parseDouble(num);
        if (numero % 1 != 0) {
            imprimeTabuada(numero);
        } else {
            imprimeTabuada((int) numero);
        }
    }

    protected static void imprimeTabuada(int ni) {
        System.out.println("============ Tabuada ============");

        for (int i = 0; i <= 10; i++) {
            System.out.println(ni + " X " + i + " = " + ni * i);
        }
        System.out.println("=================================");
    }

    protected static void imprimeTabuada(double nd) {
        System.out.println("============ Tabuada ============");
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i <= 10; i++) {
            System.out.println(df.format(nd) + " X " + i + " = " + df.format(nd * i));
        }
        System.out.println("=================================");
    }
}