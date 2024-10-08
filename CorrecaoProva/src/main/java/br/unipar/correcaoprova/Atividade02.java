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
public class Atividade02 {
     public static void main(String[] args) {
        String nome,input,serie;
        double n1, n2, media;
        
         nome = JOptionPane.showInputDialog("Qual o seu nome? ");
         serie = JOptionPane.showInputDialog("Qual o sua serie? ");
         
         input = JOptionPane.showInputDialog("Qual sua primeira nota? ");
         n1 = Double.parseDouble(input);
         
         input = JOptionPane.showInputDialog("Qual sua segunda nota? ");
         n2 = Double.parseDouble(input);
         
         media = (n1 + n2)/2;
         
         JOptionPane.showMessageDialog(null, "Seu nome e: " + nome
                 + "\n Sua serie e: " + serie
                         + "\n Sua media final e: " + media);
        
    }
    
}
