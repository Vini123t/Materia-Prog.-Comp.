/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at2.exe;



import java.util.Random;
import javax.swing.JOptionPane;

//Dada a matriz utilizada no exercício anterior, imprima na tela a soma de todas 
//as colunas de cada linha. Ex: Linha 0 tem os seguinte valores: 5, 8, 10, 3.
//Mostrar na tela: “Linha 0: Soma: 26.”


/**
 *
 * @author vinid
 */
public class Ati004 {
      public static void main(String[] args) {
        double[][] matriz = new double[5][4]; 
        Random random = new Random();
        String resultado;
        int linhaEscolhida;

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextDouble() * 100;  
            }
        }       
        do {
            String input = JOptionPane.showInputDialog("Digite o número da linha (0 a 4) para ver a soma:");
            linhaEscolhida = Integer.parseInt(input);
        } while (linhaEscolhida < 0 || linhaEscolhida > 4);  

        
        double somaLinha = 0;
        for (int j = 0; j < 4; j++) {
            somaLinha += matriz[linhaEscolhida][j];
        }

       
        resultado = String.format("Linha %d: Soma: %.2f", linhaEscolhida, somaLinha);
        JOptionPane.showMessageDialog(null, resultado);
      }
}
