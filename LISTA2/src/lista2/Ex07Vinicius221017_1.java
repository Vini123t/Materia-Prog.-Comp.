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
public class Ex07Vinicius221017_1 {
       public static void main(String[] args) {
           int mes;
           int mesAtual;
           String input;
           String mensagem;
           
       
         input = JOptionPane.showInputDialog("Digite um número de 1 a 12 correspondente ao mês:");
        mes = Integer.parseInt(input);

      
        if (mes < 1 || mes > 12) {
            JOptionPane.showMessageDialog(null, "Valor Inválido");
            return;
        }

        input = JOptionPane.showInputDialog("Digite o número do mês atual (1 a 12):");
        mesAtual = Integer.parseInt(input);

        if (mes < mesAtual) {
            mensagem = "Mês já passou";
        } else if (mes == mesAtual) {
            mensagem = "Mês atual";
        } else {
            mensagem = "Mês futuro";
        }
       
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
    

