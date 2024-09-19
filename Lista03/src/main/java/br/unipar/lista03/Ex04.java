/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista03;

//Construa um algoritmo que calcule a soma de números pares que o usuário 

import javax.swing.JOptionPane;

//informar enquanto ele não digitar zero. O usuário pode informar qualquer número 
//entre 0 e 100, mas só deve ser somado se ele for 
//par. Encerrar o laço quando o usuário digitar 0.

/**
 *
 * @author vinid
 */
public class Ex04 {
      public static void main(String[] args) {
         String input;
          int num;
        int soma = 0;
        
        do {
           input = JOptionPane.showInputDialog("Digite um número entre 0 e 100 (ou 0 para encerrar):");
            num = Integer.parseInt(input);

            
            if (num > 0 && num <= 100 && num % 2 == 0) {
                soma += num;
            }
        } while (num != 0); 

        
        JOptionPane.showMessageDialog(null, "A soma dos números pares é: " + soma);
    
    
}
}
