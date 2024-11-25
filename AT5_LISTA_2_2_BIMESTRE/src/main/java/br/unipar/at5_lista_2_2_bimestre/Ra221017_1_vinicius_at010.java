/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.at5_lista_2_2_bimestre;
//Crie uma função chamada busca_aluno. Essa função deve
//receber uma matriz de String com nomes completos de alunos na primeira 

import java.util.ArrayList;
import javax.swing.JOptionPane;

//coluna e o RA na segunda coluna, e um texto. A função deve buscar se existe 
//algum aluno com parte do nome informada no texto. Deve-se retornar uma matriz 
//com os alunos encontrados. Depois, faça a impressão da matriz utilizando a 
//função imprime_matriz já criada.   


/**
 *
 * @author vinid
 */
public class Ra221017_1_vinicius_at010 {
     public static void main(String[] args) {
        String[][] alunos = {
            {"João Silva", "RA001"},
            {"Maria Oliveira", "RA002"},
            {"Pedro Santos", "RA003"},
            {"Ana Clara", "RA004"},
            {"Clara Lima", "RA005"}
        };

        String texto = JOptionPane.showInputDialog("Informe o nome ou parte do nome do aluno:");
        if (texto != null && !texto.trim().isEmpty()) {
            String[][] encontrados = busca_aluno(alunos, texto);
            if (encontrados.length > 0) {
                imprime_matriz(encontrados);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum aluno encontrado com o texto informado.");
            }
        }
    }

    public static String[][] busca_aluno(String[][] matriz, String texto) {
        ArrayList<String[]> encontrados = new ArrayList<>();
        for (String[] aluno : matriz) {
            if (aluno[0].toLowerCase().contains(texto.toLowerCase())) {
                encontrados.add(aluno);
            }
        }
        return encontrados.toArray(new String[0][0]);
    }

    public static void imprime_matriz(String[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (String[] linha : matriz) {
            sb.append("Nome: ").append(linha[0]).append(", RA: ").append(linha[1]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
     
    
}
