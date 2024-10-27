/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista1.bimestre;

import javax.swing.JOptionPane;
//Crie dois vetores de 8 posições para armazenar números inteiros. Agora crie um 
//terceiro do mesmo tamanho e armaze em cada posição
//a multiplicação dos valores armazenados nas mesma posição nos dois primeiros


/**
 *
 * @author vinid
 */
public class Att04 {
     public static void main(String[] args) {
        int[] vetorA = new int[8];
        int[] vetorB = new int[8];
        int[] vetorC = new int[8];

        
        for (int i = 0; i < 8; i++) {
            String inputA = JOptionPane.showInputDialog("Digite o valor do elemento " + (i + 1) + " do vetor A:");
            vetorA[i] = Integer.parseInt(inputA);
        }

        
        for (int i = 0; i < 8; i++) {
            String inputB = JOptionPane.showInputDialog("Digite o valor do elemento " + (i + 1) + " do vetor B:");
            vetorB[i] = Integer.parseInt(inputB);
        }

       
        for (int i = 0; i < 8; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        
        String resultado = "Vetor C (multiplicação dos elementos de A e B):\n";
        for (int i = 0; i < 8; i++) {
            resultado += "Posição " + (i + 1) + ": " + vetorC[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}

