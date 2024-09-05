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

//Faça um algoritmo para calcular o volume de uma esfera de raio R, em que R é 
//fornecido pelo usuário. o volume de uma esfera é dado por:  V = 4/3
public class Ex01_Vinicius221017_1 {
     public static void main(String[] args) {
         double raio;
         double volume;
         String input;
           
         input = JOptionPane.showInputDialog("Digite o raio da esfera:");
        
         raio = Double.parseDouble(input);
        
         volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        
        
        JOptionPane.showMessageDialog(null, "O volume da esfera é: " + volume);
    }
    
}
