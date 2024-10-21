
package br.unipar.desafio_notas;

import javax.swing.JOptionPane;

/**
 *
 * @author vinid
 */
public class Desafio_notas {
        public static void main(String[] args) {
            String input;
            int totalAlunos;
        
        input = JOptionPane.showInputDialog("Digite o número de alunos:");
        totalAlunos = Integer.parseInt(input);
        
        
        String[] nomes = new String[totalAlunos];
        String[] ras = new String[totalAlunos];
        double[][] notas = new double[totalAlunos][2];
        double[] medias = new double[totalAlunos];
        String[] resultados = new String[totalAlunos];

        
        for (int i = 0; i < totalAlunos; i++) {
            
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ":");
            ras[i] = JOptionPane.showInputDialog("Digite o RA do aluno " + (i + 1) + ":");

            for (int j = 0; j < 2; j++) {
                String notaInput = JOptionPane.showInputDialog("Digite a nota " + (j + 1) + " do aluno " + nomes[i] + ":");
                notas[i][j] = Double.parseDouble(notaInput);
            }

            medias[i] = (notas[i][0] + notas[i][1]) / 2;
            
            if (medias[i] >= 6.0) {
                resultados[i] = "Aprovado";
            } else {
                resultados[i] = "Reprovado";
            }
        }
        
        String resultadoFinal = "Dados informados:\n";
        for (int i = 0; i < totalAlunos; i++) {
            resultadoFinal += (i + 1) + " - " + nomes[i] + " - RA: " + ras[i] +
                    " - Média: " + medias[i] + " - " + resultados[i] + "\n";
        }

    
        JOptionPane.showMessageDialog(null, resultadoFinal);
    }
}
