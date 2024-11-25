/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at5_lista_2_2_bimestre;

//Crie uma função que peça um nome de um produto ao usuário, verifique se esse nome possui ao menos 

import javax.swing.JOptionPane;

//10 caracteres e retorne o nome somente se o nome for valido

/**
 *
 * @author vinid
 */
public class Ra221017_1_vinicius_at007 {
     public static void main(String[] args) {
        String nomeProduto = solicitaNomeProduto();
        if (nomeProduto != null) {
            JOptionPane.showMessageDialog(null, "Nome válido: " + nomeProduto);
        }
    }

    public static String solicitaNomeProduto() {
        while (true) {
            String nome = JOptionPane.showInputDialog("Informe o nome do produto (mínimo 10 caracteres):");
            if (nome != null && nome.length() >= 10) {
                return nome;
            }
            JOptionPane.showMessageDialog(null, "Nome inválido. Tente novamente.");
        }
    }
    
}
