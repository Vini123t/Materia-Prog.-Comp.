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
public class Ex04Vinicius221017_1 {
        public static void main(String[] args) {
            String input;
            String resultado;
            String sexo; 
            double altura,peso, pesoIdeal = 0;
           
            
        
        input = JOptionPane.showInputDialog("Digite a altura (em metros):");
        altura = Double.parseDouble(input);
        String pesoStr = JOptionPane.showInputDialog("Digite o peso (em kg):");
        peso = Double.parseDouble(pesoStr);
        sexo = JOptionPane.showInputDialog("Digite o sexo (M para masculino, F para feminino):");

        
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            JOptionPane.showMessageDialog(null, "Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
            return; 
        }

        if (peso < pesoIdeal) {
            resultado = "Você está abaixo do peso ideal.";
        } else if (peso > pesoIdeal) {
            resultado = "Você está acima do peso ideal.";
        } else {
            resultado = "Você está no peso ideal.";
        }

       
        JOptionPane.showMessageDialog(null, "Peso ideal: " + String.format("%.2f", pesoIdeal) + " kg\n" + resultado);
    }
}

    
