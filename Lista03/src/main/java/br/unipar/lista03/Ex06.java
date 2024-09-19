/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista03;
//Elabore um algoritmo que simule uma contagem regressiva de 10 minutos, seja, 
//mostre 10:00, 9:59, 9:58 até 0:00. (para)

import javax.swing.JOptionPane;


/**
 *
 * @author vinid
 */
public class Ex06 {
      public static void main(String[] args) {
        
        for (int minutos = 9; minutos >= 0; minutos--) {
            for (int segundos = 59; segundos >= 0; segundos--) {
                
                String tempo = String.format("%02d:%02d", minutos, segundos);
                
                System.out.println(tempo);

                
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

       
        JOptionPane.showMessageDialog(null, "A contagem regressiva terminou!");
    }
}

