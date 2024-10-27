/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista1.bimestre;

import javax.swing.JOptionPane;

/**
 *
 * @author vinid
 */
public class Att06 {
    public static void main(String[] args) {
       
        String input = JOptionPane.showInputDialog("Quantos preços você deseja informar?");
        int totalPrecos = Integer.parseInt(input);

       
        double[] precos = new double[totalPrecos];
        double soma = 0; 

        
        for (int i = 0; i < totalPrecos; i++) {
            String precoInput = JOptionPane.showInputDialog("Digite o preço " + (i + 1) + ":");
            precos[i] = Double.parseDouble(precoInput);
            soma += precos[i];
        }

        
        double menorPreco = precos[0];
        double maiorPreco = precos[0];

       
        for (int i = 1; i < totalPrecos; i++) {
            if (precos[i] < menorPreco) {
                menorPreco = precos[i];
            }
            if (precos[i] > maiorPreco) {
                maiorPreco = precos[i];
            }
        }

        
        double media = soma / totalPrecos;

        
        String resultado = String.format(
            "Menor preço: R$ %.2f\nMaior preço: R$ %.2f\nMédia dos preços: R$ %.2f",
            menorPreco, maiorPreco, media
        );
        JOptionPane.showMessageDialog(null, resultado);
    }
}
