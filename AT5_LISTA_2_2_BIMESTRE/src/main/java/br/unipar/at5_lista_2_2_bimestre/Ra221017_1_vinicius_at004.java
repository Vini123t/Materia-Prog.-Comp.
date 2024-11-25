/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at5_lista_2_2_bimestre;
//Crie uma função chama ordena_vetor que receba um vetor de inteiros e retorne 
//um vetor de inteiros em ordem crecente. 

import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author vinid
 */
public class Ra221017_1_vinicius_at004 {
    public static void main(String[] args) {
        String tamanhoStr = JOptionPane.showInputDialog("Digite o tamanho do vetor:");
        int tamanho = Integer.parseInt(tamanhoStr);

        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            String valorStr = JOptionPane.showInputDialog("Digite o valor para a posição " + i + ":");
            vetor[i] = Integer.parseInt(valorStr);
        }

        int[] vetorOrdenado = ordena_vetor(vetor);

        StringBuilder resultado = new StringBuilder("Vetor ordenado: ");
        for (int i = 0; i < vetorOrdenado.length; i++) {
            resultado.append(vetorOrdenado[i]);
            if (i < vetorOrdenado.length - 1) {
                resultado.append(", ");
            }
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    public static int[] ordena_vetor(int[] vetor) {
        int[] copia = Arrays.copyOf(vetor, vetor.length);
        Arrays.sort(copia);
        return copia;
    }
    
}
