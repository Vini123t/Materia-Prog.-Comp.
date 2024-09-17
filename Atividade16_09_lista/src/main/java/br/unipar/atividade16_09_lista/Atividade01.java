/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.atividade16_09_lista;

import javax.swing.JOptionPane;

//Faça um programa que receba uma Mês em formato numérico (1 a 12). Caso o número 
//informado não seja um mês, exiba a mensagem “Valor Inválido”. Depois, compare 
//com o mês atual e exiba o nome por extenso do mês e se: “mês já passou”, “é mês atual” ou “mês Futuro”;

/**
 *
 * @author vinid
 */
public class Atividade01 {

    public static void main(String[] args) {
        int mesAtual = 9; 
        String input;
        int mesInformado;
        String nomeMes;
        String texto;
        
        
         input = JOptionPane.showInputDialog("Informe o número do mês (1 a 12):");

        
            mesInformado = Integer.parseInt(input);

            if (mesInformado < 1 || mesInformado > 12) {
                JOptionPane.showMessageDialog(null, "Valor Inválido");
            } else {
                // Opa Professor tudo certo?
                // fiz usando Array pq fique com preguiça  de usar o switch  vlww
                
                String[] nomesMeses = {
                    "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                    "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
                };
                
                 nomeMes = nomesMeses[mesInformado - 1];

                
                if (mesInformado < mesAtual) {
                    texto = "Mês já passou";
                } else if (mesInformado == mesAtual) {
                    texto = "É mês atual";
                } else {
                    texto = "Mês futuro";
                }
 
                JOptionPane.showMessageDialog(null, "Mês: " + nomeMes + "\n" + texto);
            }
        
            
        }
    }
    

