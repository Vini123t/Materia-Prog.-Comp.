/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_exx;

import javax.swing.JOptionPane;

/**
 *
 * Faça um programa que peça ao usuário o valor do relógio de água de uma residência no dia 1º 
 * do mês e no dia 30º do mesmo mês. Depois mostre quantos litros foram consumidos e a 
 * média por dia. considere 30 dias.
 */
public class Ex008 {
     public static void main(String[] args) {
         String input;
         double valorDia1, valorDia30, consumoTotal, mediaDiaria;
          
         input = JOptionPane.showInputDialog("Digite o valor do relógio de água no dia 1º do mês:");
         valorDia1 = Double.parseDouble(input);
        
        
        input = JOptionPane.showInputDialog("Digite o valor do relógio de água no dia 30º do mês:");
         valorDia30 = Double.parseDouble(input);
        
       
         consumoTotal = valorDia30 - valorDia1;
        
       
         mediaDiaria = consumoTotal / 30;
        
       
        String mensagem = ("Consumo total de água: " + consumoTotal + " litros\n" +
                          "Média de consumo diário: " + mediaDiaria + " litros por dia");
        
       
        JOptionPane.showMessageDialog(null, mensagem);
         
     }
    
}
