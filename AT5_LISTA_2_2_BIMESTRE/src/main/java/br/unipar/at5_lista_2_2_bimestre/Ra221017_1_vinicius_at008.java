/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at5_lista_2_2_bimestre;
//Faça uma função que receba um código NCM (Nome comum do Mercosul) 
//e retorne se ele é relacionado a informática (computadores, 

import javax.swing.JOptionPane;

//equipamentos de informática, smartphones, equipamentos de rede). 
//Consulte mais sobre link. sou um contador 
//(tem o curso de ciências contábeis na universidade)

/**
 *
 * @author vinid
 */
public class Ra221017_1_vinicius_at008 {
    public static void main(String[] args) {
        String codigoNCM = JOptionPane.showInputDialog("Informe o código NCM:");
        if (codigoNCM != null) {
            boolean isInformatica = verificaNCMInformatica(codigoNCM);
            String mensagem = isInformatica 
                ? "O código NCM está relacionado à informática." 
                : "O código NCM não está relacionado à informática.";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

    public static boolean verificaNCMInformatica(String ncm) {
        if (ncm == null || ncm.length() < 4) {
            return false;
        }

        String prefixo = ncm.substring(0, 4);
        return prefixo.equals("8471") || prefixo.equals("8517") || prefixo.equals("8528") 
            || prefixo.equals("8518") || prefixo.equals("8525");
    }
    
}
