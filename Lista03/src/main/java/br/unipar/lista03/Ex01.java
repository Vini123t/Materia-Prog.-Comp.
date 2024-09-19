/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista03;
//. Construa um programa que exiba os valores entre dois números informados pelo usuário.

import javax.swing.JOptionPane;


/**
 *
 * @author vinid
 */
public class Ex01 {
    public static void main(String[] args) {
        String input;
        String resultado;
        int num1;
        int num2; 
        
        
        
        input = JOptionPane.showInputDialog("Digite o primeiro número:");
        num1 = Integer.parseInt(input);

        
        input = JOptionPane.showInputDialog("Digite o segundo número:");
        num2 = Integer.parseInt(input);

        
        resultado = "Valores entre " + num1 + " e " + num2 + ":\n";

        
        if (num1 < num2) {
            for (int i = num1 + 1; i < num2; i++) {
                resultado += i + " ";
            }
        } else if (num1 > num2) {
            
            for (int i = num2 + 1; i < num1; i++) {
                resultado += i + " ";
            }
        } else {
            
            resultado = "Os números são iguais, não há valores entre eles.";
        }

        
        JOptionPane.showMessageDialog(null, resultado);
    }
}

