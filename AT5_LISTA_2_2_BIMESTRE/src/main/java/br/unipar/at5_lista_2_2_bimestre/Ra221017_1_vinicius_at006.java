/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at5_lista_2_2_bimestre;

//Crie uma função que receba uma matriz e escreva na tela a soma de cada coluna da mesma.  

import javax.swing.JOptionPane;


/**
 *
 * @author vinid
 */
public class Ra221017_1_vinicius_at006 {
     public static void main(String[] args) {
        String linhasStr = JOptionPane.showInputDialog("Digite o número de linhas da matriz:");
        int linhas = Integer.parseInt(linhasStr);

        String colunasStr = JOptionPane.showInputDialog("Digite o número de colunas da matriz:");
        int colunas = Integer.parseInt(colunasStr);

        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                String valorStr = JOptionPane.showInputDialog("Digite o valor para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = Integer.parseInt(valorStr);
            }
        }

        soma_colunas(matriz);
    }

    public static void soma_colunas(int[][] matriz) {
        StringBuilder resultado = new StringBuilder("Soma de cada coluna:\n");
        int colunas = matriz[0].length;
        for (int j = 0; j < colunas; j++) {
            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
            }
            resultado.append("Coluna ").append(j).append(": ").append(soma).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
    
}
