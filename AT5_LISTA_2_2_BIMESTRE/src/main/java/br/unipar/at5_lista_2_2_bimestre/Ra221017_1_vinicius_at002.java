/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at5_lista_2_2_bimestre;

import javax.swing.JOptionPane;


//Crie uma função chamada imprime_vetor_int que receba um vetor de 
//inteiro por parâmetro e faça a impressão na tela do vetor. 
/**
 *
 * @author vinid
 */
public class Ra221017_1_vinicius_at002 {
     public static void main(String[] args) {
        
        String tamanhoStr = JOptionPane.showInputDialog("Digite o tamanho do vetor:");
        int tamanho = Integer.parseInt(tamanhoStr);

       
        int[] vetor = new int[tamanho];

       
        for (int i = 0; i < tamanho; i++) {
            String valorStr = JOptionPane.showInputDialog("Digite o valor para a posição " + i + ":");
            vetor[i] = Integer.parseInt(valorStr);
        }

       
        imprime_vetor_int(vetor);
    }

    
    public static void imprime_vetor_int(int[] vetor) {
        StringBuilder resultado = new StringBuilder("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            resultado.append(vetor[i]);
            if (i < vetor.length - 1) {
                resultado.append(", ");
            }
        }
       
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
    
}
