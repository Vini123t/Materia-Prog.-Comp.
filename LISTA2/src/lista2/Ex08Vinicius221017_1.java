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
public class Ex08Vinicius221017_1 {
    public static void main(String[] args) {
        String input;
        String categoria;
        int idade;
        
  
        input = JOptionPane.showInputDialog("Digite a idade do nadador:");
        idade = Integer.parseInt(input);

        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18) {
            categoria = "Adulto";
        } else {
            categoria = "Idade inválida para classificação";
        }

        JOptionPane.showMessageDialog(null, "Idade: " + idade + "\nCategoria: " + categoria);
    }
    
}
