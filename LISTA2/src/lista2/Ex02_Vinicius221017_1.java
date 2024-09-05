package lista2;

import javax.swing.JOptionPane;

public class Ex02_Vinicius221017_1 {
     public static void main(String[] args) {
          String matricula;
          String horasStr;
          String valorHoraStr;
          String mes;
          String resultado;
          double horasTrabalhadas;
          double valorPorHora;
          double horasNormais;
          double horasExtras; 
          double salarioNormal;
          double salarioExtra;
          double salarioTotal;
       
        matricula = JOptionPane.showInputDialog("Digite a matrícula do funcionário:");

        horasStr = JOptionPane.showInputDialog("Digite o número de horas trabalhadas:");
        horasTrabalhadas = Double.parseDouble(horasStr);

        valorHoraStr = JOptionPane.showInputDialog("Digite o valor que o funcionário recebe por hora:");
        valorPorHora = Double.parseDouble(valorHoraStr);

        mes = JOptionPane.showInputDialog("Digite o mês e ano (ex: Maio/24):");

        horasNormais = Math.min(horasTrabalhadas, 200);
        horasExtras = Math.max(horasTrabalhadas - 200, 0);

        salarioNormal = horasNormais * valorPorHora;
        salarioExtra = horasExtras * valorPorHora * 1.5; 

        salarioTotal = salarioNormal + salarioExtra;

       
         resultado = "Matrícula: " + matricula + "\n" +
                           "Horas trabalhadas: " + horasTrabalhadas + "\n" +
                           "Mês: " + mes + "\n" +
                           "Salário total: R$ " + String.format("%.2f", salarioTotal) + "\n";

        if (horasExtras > 0) {
            resultado += "Horas extras trabalhadas: " + horasExtras;
        } else {
            resultado += "Não houve horas extras trabalhadas.";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
    
    
}
