package com.praticas.day_4four;

import java.util.Scanner;

public class App {
    static void main(String[] args) {
        // Inicializo os objetos nativos do Java com as libs utilizadas
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        
        // Cabeçalho
        System.out.println("=============================================");
        System.out.println("          Calculador de Fatorial");
        System.out.println("=============================================");
        System.out.print("Digite o valor para calcular o fatorial: ");
        int input = scanner.nextInt();
        int result = 1;
        scanner.close(); // Fecha o scanner

        System.out.println("Fatorial de: " + input);
        for (int i = input; i > 0; i--) { // For iniciado
            sb.append(i); // array com tamanho [0], o .append adiciona o valor de i e expande o tamanho
            if (i > 1) sb.append(" X "); // Se i > 1, entao ele adiciona o X. No ultimo numero (vai retornar falso) ene nao faz nada, deixando formatado.
            result *= i;
        }

        System.out.println(sb.toString() + " = " + result);

    }
}
