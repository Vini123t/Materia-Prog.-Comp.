/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at5_lista_2_2_bimestre;
//Crie uma função chamada imprime_vetor_string que receba uma matriz de 
//String por parâmetro e imprima os valores em tela. 

import javax.swing.JOptionPane;



/**
 *
 * @author vinid
 */
public class Ra221017_1_vinicius_at003 {
    public static void main(String[] args) {
       
        String linhasStr = JOptionPane.showInputDialog("Digite o número de linhas da matriz:");
        int linhas = Integer.parseInt(linhasStr);

       
        String colunasStr = JOptionPane.showInputDialog("Digite o número de colunas da matriz:");
        int colunas = Integer.parseInt(colunasStr);

       
        String[][] matriz = new String[linhas][colunas];

       
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = JOptionPane.showInputDialog("Digite o valor para a posição [" + i + "][" + j + "]:");
            }
        }

       
        imprime_vetor_string(matriz);
    }

   
    public static void imprime_vetor_string(String[][] matriz) {
        StringBuilder resultado = new StringBuilder("Matriz:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado.append(matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    resultado.append(" ");
                }
            }
            resultado.append("\n"); 
        }
      
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
    
}
