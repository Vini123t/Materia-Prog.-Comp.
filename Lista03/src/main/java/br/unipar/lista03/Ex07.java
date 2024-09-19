/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista03;
//Elabore um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de 3 de 1 a 100 (para). 

import javax.swing.JOptionPane;

/**
 *
 * @author vinid
 */
public class Ex07 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
           
            if (i % 2 != 0 && i % 3 == 0) {
                soma += i; 
            }
        }

        JOptionPane.showMessageDialog(null, "A soma dos números ímpares múltiplos de 3 entre 1 e 100 é: " + soma);
    }
    
    
}
