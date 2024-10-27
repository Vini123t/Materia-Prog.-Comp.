/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista1.bimestre;
// Crie um vetor com 50 posições de número inteiros e preencha-o automaticamente
//com números entre 1 e 100. Depois peço um numero ao usuário e verifique se esse 
//número esta presente no Vetor. Caso sim, exiba “Esta Presente” caso não, “Não 
//esta pres

import java.util.Random;
import javax.swing.JOptionPane;



/**
 *
 * @author vinid
 */
public class Att07 {  public static void main(String[] args) {
        int[] numeros = new int[50];
        Random random = new Random();

       
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        
        String input = JOptionPane.showInputDialog("Digite um número para verificar se está presente no vetor:");
        int numeroUsuario = Integer.parseInt(input);

        
        boolean estaPresente = false;
        for (int numero : numeros) {
            if (numero == numeroUsuario) {
                estaPresente = true;
                break;
            }
        }

        
        if (estaPresente) {
            JOptionPane.showMessageDialog(null, "Está Presente");
        } else {
            JOptionPane.showMessageDialog(null, "Não está Presente");
        }
    }
}