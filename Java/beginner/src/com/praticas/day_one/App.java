package com.praticas.day_one;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner c1 = new Scanner(System.in);
        Integer operacao = 0;
        Double final_value = 0.0;

        System.out.println("Insira o primeiro valor: ");
        double valor_1 = c1.nextDouble();
        System.out.println();

        System.out.println("Insira o segundo valor: ");
        double valor_2 = c1.nextDouble();
        System.out.println();
        System.out.println("==========================");
        System.out.println("Insira a operação:");
        System.out.println("==========================");
        System.out.println("[1] - Adição");
        System.out.println("[2] - Subtração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
        operacao = c1.nextInt();
        c1.close();
        switch (operacao) {
            case 1:
                final_value = valor_1 + valor_2;
                break;
            case 2:
                final_value = valor_1 - valor_2;
                break;
            case 3:
                final_value = valor_1 * valor_2;
                break;
            case 4:
                if (valor_2 == 0)
                    throw new ArithmeticException("Divisão por zero");
                final_value = valor_1 / valor_2;
                break;
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);

        }
        System.out.println("Resultado: " + final_value);
    }
}
