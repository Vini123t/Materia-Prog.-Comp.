/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista03;
//Agora repita o exercício anterior e somente exiba a lista de números do exercício 
//anterior se o segundo valor for maior que o primeiro

import javax.swing.JOptionPane;


/**
 *
 * @author vinid
 */
public class Ex02 {
     public static void main(String[] args) {
        String input;
        String resultado;
        int num1;
        int num2; 
       
        input = JOptionPane.showInputDialog("Digite o primeiro número:");
        num1 = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Digite o segundo número:");
        num2 = Integer.parseInt(input);
      

        if (num2 > num1) {
            resultado = "Valores entre " + num1 + " e " + num2 + ":\n";
            for (int i = num1 + 1; i < num2; i++) {
                resultado += i + " ";
            }
        } else {
        
            resultado = "O segundo número deve ser maior que o primeiro.";
        }

       
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
