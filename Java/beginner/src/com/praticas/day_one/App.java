package com.praticas.day_one;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        double a = scanner.nextDouble();

        System.out.print("Segundo valor: ");
        double b = scanner.nextDouble();

        System.out.println("\n[1] Adição  [2] Subtração  [3] Multiplicação  [4] Divisão");
        int operacao = scanner.nextInt();
        scanner.close();

        // O yield é usado dentro de um bloco {} no switch expression para dizer qual
        // valor retornar.
        // javacase 4 -> {
        // if (b == 0) throw new ArithmeticException("Divisão por zero");
        // yield a / b; // "retorna" a / b para o switch expression
        // }
        // Pensa assim:

        // Se o case é simples → usa -> direto, sem yield
        // Se o case precisa de mais de uma linha → abre {} e usa yield no final

        // javadouble resultado = switch (operacao) {
        // case 1 -> a + b; // simples, sem yield
        // case 4 -> {
        // if (b == 0) throw new ArithmeticException("Divisão por zero");
        // yield a / b; // bloco, precisa de yield
        // }
        // };

        double resultado = switch (operacao) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> {
                if (b == 0)
                    throw new ArithmeticException("Divisão por zero");
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Operação inválida: " + operacao);
        };

        System.out.println("Resultado: " + (int) resultado);
        // Ou
        System.out.println(String.format("Resultado: %.0f", resultado));
    }
}