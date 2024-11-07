/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at3;

import java.util.Scanner;

//Crie uma função maior que receba dois número inteiros por parâmetro e retorne o maior deles. 


/**
 *
 * @author vinid
 */
public class Exx05Ra_221017_1nome_Vinicius_Almeida {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = scanner.nextInt();

        int resultado = maior(numero1, numero2);
        System.out.println("O maior número é: " + resultado);

        scanner.close();
    }

    public static int maior(int a, int b) {
        return (a > b) ? a : b;
    }
}