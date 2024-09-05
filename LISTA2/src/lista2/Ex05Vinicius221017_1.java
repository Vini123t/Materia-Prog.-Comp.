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
public class Ex05Vinicius221017_1 {
       public static void main(String[] args) {
           String input;
           String mensagem;
           int anoNascimento;
           int anoAtual;
           int idade;
           
        input = JOptionPane.showInputDialog("Digite o ano de nascimento:");
        anoNascimento = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Digite o ano atual:");
        anoAtual = Integer.parseInt(input);
 
        idade = anoAtual - anoNascimento;

        if (idade >= 18) {
            mensagem = "Você tem " + idade + " anos. Já pode votar e tirar habilitação.";
        } else if (idade >= 16) {
            mensagem = "Você tem " + idade + " anos. Já pode votar, mas ainda não pode tirar habilitação.";
        } else {
            mensagem = "Você tem " + idade + " anos. Não pode votar nem tirar habilitação.";
        }

       
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
