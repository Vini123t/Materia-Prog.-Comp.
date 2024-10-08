/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.correcaoprova;

import javax.swing.JOptionPane;

/**
 *
 * @author vinid
 */
public class Atividade01 {
     public static void main(String[] args) {
        
        String produto, input;
        double precoBruto; 
        double percentualDesconto; 
        double valorDesconto;
         double precoLiquido;
        
        produto = JOptionPane.showInputDialog("Qual o seu produto? ");
        input = JOptionPane.showInputDialog("Qual o valor do seu produto?");
        precoBruto = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Qual o percetoal de desconto do  produto?");
        percentualDesconto = Double.parseDouble(input);  

         valorDesconto = precoBruto * (percentualDesconto / 100);
         precoLiquido = precoBruto - valorDesconto;

        
        JOptionPane.showMessageDialog(null, "Descrição do produto: " + produto
                + "\n Preço bruto: R$ " + precoBruto
                        + "\n Percentual de desconto: " + percentualDesconto + "%"
                                + "\n Preço com desconto: R$ " + precoLiquido );
      
    }
    
}
