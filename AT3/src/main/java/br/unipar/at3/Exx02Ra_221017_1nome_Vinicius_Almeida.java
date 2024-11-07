/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at3;

import java.util.Scanner;

/**
 *
 * @author vinid
 */
public class Exx02Ra_221017_1nome_Vinicius_Almeida {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] frutas = new String[5];
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Informe o nome de uma fruta: ");
            frutas[i] = solicita_texto(scanner);
        }

        System.out.println("\nFrutas cadastradas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        scanner.close();
    }

    public static String solicita_texto(Scanner scanner) {
        while (true) {
            String texto = scanner.nextLine();
            if (texto.length() > 5) {
                return texto;
            } else {
                System.out.print("Palavra muito pequena. Informe novamente: ");
            }
        }
    }
}