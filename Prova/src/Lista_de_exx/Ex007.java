/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_exx;

import javax.swing.JOptionPane;

/**
 *
 * Faça um programa que peça ao usuário dois números (num1 e num2) e depois exiba o resultado das operações relacionais 
 * maior que, menor que, igual e diferente
 */
public class Ex007 {
    public static void main(String[] args) {
        String input;
        double num1 , num2;
        boolean maiorQue, menorQue, igual, diferente;
        
        
        input = JOptionPane.showInputDialog("Digite o primeiro número:");
        num1 = Double.parseDouble(input);
        
       input = JOptionPane.showInputDialog("Digite o segundo número:");
        num2 = Double.parseDouble(input);
        
         maiorQue = num1 > num2;
         menorQue = num1 < num2;
         igual = num1 == num2;
         diferente = num1 != num2;
        
       
        String mensagem = ("Operações Relacionais entre " + num1 + " e " + num2 + ":\n" +
                          "Maior que: " + maiorQue + "\n" +
                          "Menor que: " + menorQue + "\n" +
                          "Igual: " + igual + "\n" +
                          "Diferente: " + diferente);
        
        
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
    
}
