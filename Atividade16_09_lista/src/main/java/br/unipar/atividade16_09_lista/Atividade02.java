/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.atividade16_09_lista;

import javax.swing.JOptionPane;
//Tendo como dados de entrada a altura, o peso e o sexo de uma pessoa, construa 
//um algoritmo que calcule seu peso ideal, usando as fórmulas abaixo e exiba se a
//pessoa está abaixo, no peso ou acima do peso ideal.
//homens: (72.7 * H) - 58
// mulheres: (62.1 * H) - 44.7



/**
 *
 * @author vinid
 */
public class Atividade02 {
      public static void main(String[] args) {
            String input;
            double altura;
            double peso;
            String sexo;
            double pesoIdeal = 0;
            String situacao;
        
            input = JOptionPane.showInputDialog("Informe sua altura em metros (ex: 1.75):");
            altura = Double.parseDouble(input);
            input = JOptionPane.showInputDialog("Informe seu peso em kg (ex: 70):");
            peso = Double.parseDouble(input);
            sexo = JOptionPane.showInputDialog("Informe seu sexo (M para Masculino, F para Feminino):");
     
                      
            if (sexo.equals("M")) {
            pesoIdeal = (72.7 * altura) - 58;
            } else if (sexo.equals("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inválido. Informe M ou F.");
                return; 
            }
            
            if (peso < pesoIdeal) {
                situacao = "Você está abaixo do peso ideal.";
            } else if (peso == pesoIdeal) {
                situacao = "Você está no peso ideal.";
            } else {
                situacao = "Você está acima do peso ideal.";
            }

            
            JOptionPane.showMessageDialog(null, String.format("Seu peso ideal é: %.2f kg\n%s", pesoIdeal, situacao));

      
      }   
          
}
   
    

