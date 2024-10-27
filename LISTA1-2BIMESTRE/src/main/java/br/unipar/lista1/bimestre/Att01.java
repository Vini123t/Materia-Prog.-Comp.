/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista1.bimestre;
//Declare um vetor do tipo real, com 4 posições.
//Peça as notas dos 4 bimestres de um aluno e no final calcule a média.
import javax.swing.JOptionPane;

/**
 *
 * @author vinid
 */
public class Att01 {
    public static void main(String[] args) {
        double[] notas = new double[4];  
        double soma = 0.0;

        
        for (int i = 0; i < 4; i++) {
            String notaInput = JOptionPane.showInputDialog("Digite a nota do " + (i + 1) + "º bimestre:");
            notas[i] = Double.parseDouble(notaInput);  
            soma += notas[i];  
        }

       
        double media = soma / 4;

       
        JOptionPane.showMessageDialog(null, "A média das notas é: " + media);
    }
}

    
    
