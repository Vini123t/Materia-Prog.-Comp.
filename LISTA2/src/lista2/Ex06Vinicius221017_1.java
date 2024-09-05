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
public class Ex06Vinicius221017_1 {
      public static void main(String[] args) {
          String input;
          String operador;
          String expressao = "";
          double valor1;
          double valor2;
          double resultado = 0;
          boolean operadorValido = true;
          
          
        input = JOptionPane.showInputDialog("Digite o primeiro valor:");
        valor1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Digite o segundo valor:");
        valor2 = Double.parseDouble(input);

       
        operador = JOptionPane.showInputDialog("Digite o operador aritmético (+, -, *, /):");
        
       
        switch (operador) {
            case "+":
                resultado = valor1 + valor2;
                expressao = valor1 + " + " + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                expressao = valor1 + " - " + valor2;
                break;
            case "*":
                resultado = valor1 * valor2;
                expressao = valor1 + " * " + valor2;
                break;
            case "/":
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                    expressao = valor1 + " / " + valor2;
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.");
                    return;
                }
                break;
            default:
                operadorValido = false;
                JOptionPane.showMessageDialog(null, "Símbolo inválido.");
                break;
        }

       
        if (operadorValido) {
            JOptionPane.showMessageDialog(null, "Expressão: " + expressao + "\nResultado: " + resultado);
        }
    }
}

    
