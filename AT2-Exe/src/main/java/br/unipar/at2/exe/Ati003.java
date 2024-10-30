/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at2.exe;

import java.util.Random;
import javax.swing.JOptionPane;

//Declare uma matriz de 20 posições de número reais, sendo 5 linhas e 4 colunas. 
//Preencha-a com números aleatórios e depois imprima na tela. 

/**
 *
 * @author vinid
 */
public class Ati003 {
      public static void main(String[] args) {
        double[][] matriz = new double[5][4];  
        Random random = new Random();
        String resultado;

       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextDouble() * 100;  
            }
        }

        
        resultado = "Valores armazenados na matriz:\n";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                resultado += String.format("Posição [%d][%d]: %.2f\n", i, j, matriz[i][j]);
            }
        }

        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
