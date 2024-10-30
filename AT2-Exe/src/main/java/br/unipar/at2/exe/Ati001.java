/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at2.exe;
import java.util.Random;
import javax.swing.JOptionPane;
//Declare um vetor de 30 posições, sendo 5 linhas e 6 colunas. Preencha c
    //números aleatórios e depois exiba os valores armazenados, conforme sua posição.

/**
 *
 * @author vinid
 */
public class Ati001 {
     public static void main(String[] args) {
        int[][] matriz = new int[5][6];  
        Random random = new Random();
         String resultado;

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        
         resultado = "Valores armazenados na matriz:\n";
        
      
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                resultado += "Posição [" + i + "][" + j + "]: " + matriz[i][j] + "\n";
            }
        }

       
        JOptionPane.showMessageDialog(null, resultado);
    }
}
    

