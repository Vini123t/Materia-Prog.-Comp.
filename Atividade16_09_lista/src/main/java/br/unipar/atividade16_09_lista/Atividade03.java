/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.atividade16_09_lista;

import javax.swing.JOptionPane;

/**
 *
 * @author vinid
 */
public class Atividade03 {
     public static void main(String[] args) {
       String input;
       double valorTotal;
       double valorFinal = 0;
       int quantidadeParcelas = 0;
       double valorParcela = 0;
       
        input = JOptionPane.showInputDialog("Informe o valor total da compra:");
        valorTotal = Double.parseDouble(input);
        
        
        input = JOptionPane.showInputDialog("Informe o código da condição de pagamento:\n" +
                                                         "1 - À vista com 10% de desconto\n" +
                                                         "2 - A prazo, 1 parcela com 8% de desconto\n" +
                                                         "3 - A prazo, 5 parcelas sem desconto\n" +
                                                         "4 - A prazo, 10 parcelas com acréscimo de 5%");
        int codigoPagamento = Integer.parseInt(input);
        
       
        switch (codigoPagamento) {
            case 1:
                
                valorFinal = valorTotal * 0.90;
                quantidadeParcelas = 1;
                valorParcela = valorFinal;
                break;
            case 2:
               
                valorFinal = valorTotal * 0.92;
                quantidadeParcelas = 1;
                valorParcela = valorFinal;
                break;
            case 3:
               
                valorFinal = valorTotal;
                quantidadeParcelas = 5;
                valorParcela = valorFinal / quantidadeParcelas;
                break;
            case 4:
                
                valorFinal = valorTotal * 1.05;
                quantidadeParcelas = 10;
                valorParcela = valorFinal / quantidadeParcelas;
                break;
            default:
                
                JOptionPane.showMessageDialog(null, "Código de pagamento inválido.");
                return;
        }
        
        JOptionPane.showMessageDialog(null, String.format("Valor total a ser pago: R$ %.2f\nQuantidade de parcelas: %d\nValor por parcela: R$ %.2f", 
                                                          valorFinal, quantidadeParcelas, valorParcela));
    }
}

    
