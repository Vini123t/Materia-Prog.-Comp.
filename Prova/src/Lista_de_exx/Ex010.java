/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_exx;


import javax.swing.JOptionPane;

/**
 *
 * Faça um programa que peça ao usuário um número inteiro qualquer. Se ele for maior que 10 e menor
 * que 100, calcule a potência dele elevado a 2. Se ele for maior que 100 ou menor que 10,
 * exiba a raiz quadrada do valor. Exiba os valores com 5 casas decimais.
 */
public class Ex010 {
    public static void main(String[] args) {
         
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numero = Integer.parseInt(input);
        
        if (numero > 10 && numero < 100) {
            double potencia = Math.pow(numero, 2);
            
            String resultado = String.format("%.5f", potencia);
            JOptionPane.showMessageDialog(null, "O número " + numero + " elevado a 2 é: " + resultado);
        } else {
            double raizQuadrada = Math.sqrt(numero);
            String resultado = String.format("%.5f", raizQuadrada);
            JOptionPane.showMessageDialog(null, "A raiz quadrada de " + numero + " é: " + resultado);
        }
        
    }
}
