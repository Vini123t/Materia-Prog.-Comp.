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
//Escreva um algoritmo que leia três valores diferentes e os escreva em ordem crescente. Utilize uma seleção encadeada
public class Ex03_Vinicius221017_1 {
      public static void main(String[] args) {
         String input;
         double valor1;
         double valor2;
         double valor3;
         double menor;
         double meio;
         double maior;
         
         input = JOptionPane.showInputDialog("Digite o primeiro valor:");
         valor1 = Double.parseDouble(input);
         input = JOptionPane.showInputDialog("Digite o segundo valor:");
         valor2 = Double.parseDouble(input);
         input = JOptionPane.showInputDialog("Digite o terceiro valor:");
         valor3 = Double.parseDouble(input);


        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
            if (valor2 < valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
            if (valor1 < valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 < valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }
        JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são: " 
                                            + menor + ", " + meio + ", " + maior);
    }
}
    
    

