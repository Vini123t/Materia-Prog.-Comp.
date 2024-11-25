/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at5_lista_2_2_bimestre;
// Crie uma função que receba um um nome e o ano de nascimento de 
//uma pessoa. Se o ano de nascimento for um número primo, troque as 

import javax.swing.JOptionPane;

//letras ‘A’ por ‘@’ e as letras ‘E’ por ‘!’. Senao, troque as letras 
//‘E’ por ‘#’ e as letras ‘O’ por ‘*’ .


/**
 *
 * @author vinid
 */
public class Ra221017_1_vinicius_at009 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe o nome:");
        String anoString = JOptionPane.showInputDialog("Informe o ano de nascimento:");

        if (nome != null && anoString != null && !anoString.isEmpty()) {
            try {
                int anoNascimento = Integer.parseInt(anoString);
                String nomeTransformado = transformaNome(nome, anoNascimento);
                JOptionPane.showMessageDialog(null, "Resultado: " + nomeTransformado);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ano de nascimento inválido.");
            }
        }
    }

    public static String transformaNome(String nome, int ano) {
        if (isPrimo(ano)) {
            return nome.replace('A', '@').replace('E', '!');
        } else {
            return nome.replace('E', '#').replace('O', '*');
        }
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
