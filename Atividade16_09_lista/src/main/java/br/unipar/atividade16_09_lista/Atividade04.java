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
public class Atividade04 {
       public static void main(String[] args) {
           String input;
           int quantidadePessoas;
           int pessoasPorPizza = 0;
        
         input = JOptionPane.showInputDialog("Informe a quantidade de pessoas:");
         quantidadePessoas = Integer.parseInt(input);
        
        
        input = JOptionPane.showInputDialog("Informe o tamanho da pizza (broto, pequena, media ou grande):");
        
       
        switch (input) {
            case "broto":
                pessoasPorPizza = 1;
                break;
            case "pequena":
                pessoasPorPizza = 2;
                break;
            case "media": 
                pessoasPorPizza = 3;
                break;
            case "grande":
                pessoasPorPizza = 4;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tamanho de pizza inválido. "
                        + "Escolha entre: broto, pequena, media ou grande.");
                return;
        }
        int quantidadePizzas = quantidadePessoas / pessoasPorPizza;

 
        if (quantidadePessoas % pessoasPorPizza != 0) {
            quantidadePizzas++; 
        }
        
        JOptionPane.showMessageDialog(null, String.format("Você precisará de %d"
                + " pizza(s) tamanho %s para atender %d pessoa(s).", 
                quantidadePizzas, input, quantidadePessoas));
    }
}


    
