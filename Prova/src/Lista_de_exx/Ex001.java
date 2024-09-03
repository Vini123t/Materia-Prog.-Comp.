/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lista_de_exx;


import javax.swing.JOptionPane;

/**
 *
 * Faça um programa que peça ao usuário qual foi sua nota final no ano letivo. 
 * Se a nota for menor que 6 e maior que 4, exiba “precisa fazer prova substitutiva”. 
 * Se for maior que 6 exiba “aprovado”. Senão, exiba “reprovado”.
 */
public class Ex001 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a sua nota final no ano letivo:");
        double nota = Double.parseDouble(input);
        
        if (nota > 6) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else if (nota >= 4 && nota <= 6) {
            JOptionPane.showMessageDialog(null, "Precisa fazer prova substitutiva");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
        
      
    }
}

    
    

