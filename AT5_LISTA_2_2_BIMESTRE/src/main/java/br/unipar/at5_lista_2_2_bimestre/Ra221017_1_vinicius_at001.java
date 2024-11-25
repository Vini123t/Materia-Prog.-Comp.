/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at5_lista_2_2_bimestre;

import javax.swing.JOptionPane;

//Crie uma função chamada divisão, com retorno real e que receba dois 
//valores por parâmetros. Se o divisor for igual a 0, ela 
//deve retornar 0. Se não, deve retornar a divisão entre eles. 

/**
 *
 * @author vinid
 */
public class Ra221017_1_vinicius_at001 {
    public static void main(String[] args) {
        
        String dividendoStr = JOptionPane.showInputDialog("Digite o dividendo:");
        double dividendo = Double.parseDouble(dividendoStr);

       
        String divisorStr = JOptionPane.showInputDialog("Digite o divisor:");
        double divisor = Double.parseDouble(divisorStr);

       
        double resultado = divisao(dividendo, divisor);

       
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
    }

   
    public static double divisao(double dividendo, double divisor) {
        if (divisor == 0) {
            return 0; 
        }
        return dividendo / divisor; 
    }
}
