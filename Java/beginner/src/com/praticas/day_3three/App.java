package com.praticas.day_3three;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Estruturas de Repetição.
        /*
         * Resumo Rápido:
         * Qual usar?
         * Sabe o limite exato? Use? for.
         * 
         * Quer ler todos os itens de uma lista? Use for-each.
         * 
         * Não sabe quando vai parar? Use while.
         * 
         * Precisa rodar pelo menos uma vez? Use do-while.
         * 
         * Precisa remover itens enquanto varre a lista? Use Iterator.
         */

        Scanner c1 = new Scanner(System.in);
        System.out.print("Digite a quantidade de frutas que deseja adicionar: ");
        Integer fruits_quantity = c1.nextInt();
        ArrayList<String> frutas = new ArrayList<>();

        for (int i = 0; i <= fruits_quantity; i++) {
            System.out.print("Digite a " + i + "o. Fruta: ");
            frutas.add(c1.nextLine());
        }

        System.out.println("Método forEach do proprio arraylist:");
        frutas.forEach(fruta -> System.out.println("Fruta: " + fruta));
        System.out.println();

        System.out.println("ForEach arraylist: - Elemento em Elementos - Para cada elemento : no Array:");
        // Para cada fruta em frutas...
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        //
        
        Iterator<String> it = frutas.iterator(); // Criando o "braço mecânico"

        while (it.hasNext()) {
            String fruta = it.next();
            if (fruta.equals("Podre")) {
                it.remove(); // Remove com segurança durante a varredura
            }
        }
        System.out.println();

        c1.close();
    }
}
