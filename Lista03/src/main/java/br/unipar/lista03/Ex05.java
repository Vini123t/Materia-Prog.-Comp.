/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista03;
//Imagine uma brincadeira entre dois colegas onde um fornece um número e o outro 
//deve adivinhar qual é. Como dica, indique se o chute dado foi alto ou baixo em

import java.util.Random;
import javax.swing.JOptionPane;

//relação ao número escolhido. Pode sortear um número aleatório também. (repita)


/**
 *
 * @author vinid
 */
public class Ex05 {
     public static void main(String[] args) {
        String input;
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; 
        int chute;
        do {
           
            input = JOptionPane.showInputDialog("Tente adivinhar o número (entre 1 e 100):");
            chute = Integer.parseInt(input);

            
            if (chute > numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Alto demais! Tente um número menor.");
            } else if (chute < numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Baixo demais! Tente um número maior.");
            }

        } while (chute != numeroAleatorio); 

       
        JOptionPane.showMessageDialog(null, "Parabéns! Você adivinhou o número.");
    }
}

      