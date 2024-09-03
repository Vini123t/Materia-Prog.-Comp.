/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_exx;

import javax.swing.JOptionPane;

/**
 *
 * Faça um programa que peça ao usuário dois números (num1 e num2) e depois exiba o resultado das 
 * operações matemáticas soma, divisão, subtração e multiplicação.
 */
public class Ex003 {
    public static void main(String[] args) {
        double n1,n2, div, soma, multi, sub;
        String input;
        input = JOptionPane.showInputDialog("Digite um numero: ");
        n1 = Double.parseDouble(input);   
        input = JOptionPane.showInputDialog("Digite um numero: ");
        n2 = Double.parseDouble(input); 
        
        soma = n1 + n2;
        multi = n1 * n2;
        sub = n1 - n2;
        div = n1 / n2;
        
        JOptionPane.showMessageDialog(null, "A soma dos numeros e: "+ soma 
        + "\n A multiplicação dos numeros e: " + multi 
        + "\n A subtraçaõ dos numeros e: "+ sub 
        + "\n A divisão dos numeros e: " + div);
        
      
    }
    
}
