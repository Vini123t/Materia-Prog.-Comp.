/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_exx;

import javax.swing.JOptionPane;

/**
 *
 * Faça um programa que peça um número ao usuário. Exiba se esse número é Par ou Ímpar (use o mod).
 */
public class Ex005 {
     public static void main(String[] args) {
         String input;
         int numero;
         
        input = JOptionPane.showInputDialog("Digite um número inteiro:");
        numero = Integer.parseInt(input);
        
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é Par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é Ímpar.");
        }
     }
    
    
}
