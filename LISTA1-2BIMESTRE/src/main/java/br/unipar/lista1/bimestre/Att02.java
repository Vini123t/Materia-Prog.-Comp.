/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista1.bimestre;
//Declare um vetor do tipo real de 10 posições. Peça as notas de 10 alunos da 
//disciplina de algoritmos. Insira novetor e depois exiba a média da sala, a menor 

import javax.swing.JOptionPane;

//e a maior nota.

/**
 *
 * @author vinid
 */


public class Att02 {

    public static void main(String[] args) {
        double[] notas = new double[10];  
        double soma = 0.0;

       
        String notaInput = JOptionPane.showInputDialog("Digite a nota do aluno 1:");
        notas[0] = Double.parseDouble(notaInput);
        soma += notas[0];
        double menorNota = notas[0];
        double maiorNota = notas[0];

        
        for (int i = 1; i < 10; i++) {
            notaInput = JOptionPane.showInputDialog("Digite a nota do aluno " + (i + 1) + ":");
            notas[i] = Double.parseDouble(notaInput);
            soma += notas[i];

            
            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        
        double media = soma / 10;

       
        String resultado = "Média da sala: " + media +
                           "\nMenor nota: " + menorNota +
                           "\nMaior nota: " + maiorNota;
        JOptionPane.showMessageDialog(null, resultado);
    }
}

