
//Declare uma matriz de 12 posições de valores inteiros, sendo 3 linhas e 4]
//colunas. Peça ao usuário os valores e insira-os em cada posição.

package br.unipar.at2.exe;

import javax.swing.JOptionPane;

/**
 *
 * @author vinid
 */
public class Ati002 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];  
        String resultado;

     
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                String input = JOptionPane.showInputDialog("Digite o valor para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = Integer.parseInt(input);  
            }
        }

        
          resultado = "Valores armazenados na matriz:\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                resultado += "Posição [" + i + "][" + j + "]: " + matriz[i][j] + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
    

