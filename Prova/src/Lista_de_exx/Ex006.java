/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_exx;

import javax.swing.JOptionPane;

/**
 *
 * faça um programa que peça ao usuário um número inteiro qualquer e exiba esse número elevado a 2, 4, 6, 8 e 10.
 * 
 */
public class Ex006 {
    public static void main(String[] args) {
           
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numero = Integer.parseInt(input);
       
        int potencia2 = (int) Math.pow(numero, 2);
        int potencia4 = (int) Math.pow(numero, 4);
        int potencia6 = (int) Math.pow(numero, 6);
        int potencia8 = (int) Math.pow(numero, 8);
        int potencia10 = (int) Math.pow(numero, 10);
        
        
        String mensagem = "Número: " + numero + "\n" +
                          "Elevado a 2: " + potencia2 + "\n" +
                          "Elevado a 4: " + potencia4 + "\n" +
                          "Elevado a 6: " + potencia6 + "\n" +
                          "Elevado a 8: " + potencia8 + "\n" +
                          "Elevado a 10: " + potencia10;
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
