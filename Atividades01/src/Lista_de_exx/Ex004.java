/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_exx;

import javax.swing.JOptionPane;

/**
 *Faça um programa que peça dois números inteiros ao usuário. 
 *Depois exiba se o primeiro é maior, menor ou igual ao segundo. 
 *
 */
public class Ex004 {
    public static void main(String[] args) {
        int n1, n2;
        String input;
        
         input = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
         n1 = Integer.parseInt(input);
    
         input = JOptionPane.showInputDialog("Digite o segundo número inteiro:");
         n2 = Integer.parseInt(input);
        
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "O primeiro número é maior que o segundo.");
        } else if (n1 < n2) {
            JOptionPane.showMessageDialog(null, "O primeiro número é menor que o segundo.");
        } else {
            JOptionPane.showMessageDialog(null, "O primeiro número é igual ao segundo.");
        }
    
    }
    
}
