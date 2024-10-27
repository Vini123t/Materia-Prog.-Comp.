/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista1.bimestre;
//peça ao usuário quantos nomes de frutas ele deseja informar. Crie um vetor, 
//peça ao usuário uma a uma e armazene em cada posição as palavras informadas. 

import javax.swing.JOptionPane;

//Depois, exiba na tela as frutas informadas e quantos caracteres (letras) tem cada nome. 

/**
 *
 * @author vinid
 */
public class Att05 {
     public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Quantas frutas você deseja informar?");
        int totalFrutas = Integer.parseInt(input);

        
        String[] frutas = new String[totalFrutas];

       
        for (int i = 0; i < totalFrutas; i++) {
            frutas[i] = JOptionPane.showInputDialog("Digite o nome da fruta " + (i + 1) + ":");
        }

        
        String resultado = "Frutas informadas:\n";
        for (int i = 0; i < totalFrutas; i++) {
            resultado += frutas[i] + " - " + frutas[i].length() + " letras\n";
        }

       
        JOptionPane.showMessageDialog(null, resultado);
    }
}
    

