/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_exx;

import javax.swing.JOptionPane;

/**
 *Faça um programa que peça ao usuário Nome, idade, Gênero, 
 * Cor favorita e se pratica esporte e depois exiba as informações digitadas.
 *
 */
public class Ex002 {
    
    public static void main(String[] args) {
        String nome,idade, genero, cor, esporte;
        
         nome = JOptionPane.showInputDialog("Qual seu nome: ");
         idade = JOptionPane.showInputDialog("Qual sua idade?");
         genero = JOptionPane.showInputDialog("Qual sue Genero?");
         cor = JOptionPane.showInputDialog("Qual sua cor faforita?");
         esporte = JOptionPane.showInputDialog("Você pratica algum esporte se sim qual?");
         
         JOptionPane.showMessageDialog(null,"Ola " + nome+ " Sua idade e: " + idade 
                 + "\n Seu genero e: " + genero + " Sua cor favorita: " + cor
                 + "\n E qual esporte vc pratica: " + esporte );
    
        
      
    }
}
