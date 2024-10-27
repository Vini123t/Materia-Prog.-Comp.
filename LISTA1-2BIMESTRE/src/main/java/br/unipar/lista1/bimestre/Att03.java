/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista1.bimestre;
//Declare um vetor de texto/cadeia com 5 elementos. Solicite 5 nomes ao usuário e 
//salve no vetor. Depois imprima os nomes informados na ordem informada. 

import javax.swing.JOptionPane;


/**
 *
 * @author vinid
 */
public class Att03 {
     public static void main(String[] args) {
        String[] nomes = new String[5];  

        
        for (int i = 0; i < 5; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º usuário:");
        }

       
        String resultado = "Nomes informados:\n";
        for (int i = 0; i < 5; i++) {
            resultado += nomes[i] + "\n";
        }

    
        JOptionPane.showMessageDialog(null, resultado);
    }
}
    

