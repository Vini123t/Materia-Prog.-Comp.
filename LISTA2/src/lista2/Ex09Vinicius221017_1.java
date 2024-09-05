/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;

import javax.swing.JOptionPane;

/**
 *
 * @author vinid
 */
public class Ex09Vinicius221017_1 {
      public static void main(String[] args) {
         String input;
         String condicao = "";
         int parcelas = 0;
         int codigo;
         double valorFinal = 0;    
         double valorTotal;
         double valorParcela;
       
        input = JOptionPane.showInputDialog("Digite o valor total da compra:");
        valorTotal = Double.parseDouble(input);

        
        input = JOptionPane.showInputDialog("Digite o código da condição de pagamento:\n"
                + "1 - À vista com 10% de desconto\n"
                + "2 - À prazo, 1x com 8% de desconto\n"
                + "3 - À prazo, 5x sem desconto ou acréscimos\n"
                + "4 - À prazo, 10x com acréscimo de 5%");
        codigo = Integer.parseInt(input);

        
        switch (codigo) {
            case 1:
               
                valorFinal = valorTotal * 0.90;
                parcelas = 1;
                condicao = "À vista com 10% de desconto";
                break;
            case 2:
               
                valorFinal = valorTotal * 0.92;
                parcelas = 1;
                condicao = "À prazo, 1x com 8% de desconto";
                break;
            case 3:
               
                valorFinal = valorTotal;
                parcelas = 5;
                condicao = "À prazo, 5x sem desconto ou acréscimos";
                break;
            case 4:
               
                valorFinal = valorTotal * 1.05;
                parcelas = 10;
                condicao = "À prazo, 10x com acréscimo de 5%";
                break;
            default:
                
                JOptionPane.showMessageDialog(null, "Código de condição de pagamento inválido.");
                return; 
        }

        
         valorParcela = valorFinal / parcelas;
       
        JOptionPane.showMessageDialog(null, "Condição de pagamento: " + condicao +
                "\nValor total a pagar: R$ " + String.format("%.2f", valorFinal) +
                "\nQuantidade de parcelas: " + parcelas +
                "\nValor por parcela: R$ " + String.format("%.2f", valorParcela));
    }
}
    

