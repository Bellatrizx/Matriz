/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz2;
import javax.swing.JOptionPane;

/**
 *
 * @author Bea
 */
public class Matriz2 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int somaImpares = 0;
        int[] somaColunas = new int[5];
        int[] somaLinhas = new int[5];

        // Preenchendo a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para posição [" + i + "][" + j + "]:"));
                
                // Soma dos ímpares
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
                // Soma de cada coluna
                somaColunas[j] += matriz[i][j];
                // Soma de cada linha
                somaLinhas[i] += matriz[i][j];
            }
        }

        // Exibindo os resultados
        JOptionPane.showMessageDialog(null, "Soma dos números ímpares: " + somaImpares);
        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, "Soma da coluna " + (i + 1) + ": " + somaColunas[i]);
            JOptionPane.showMessageDialog(null, "Soma da linha " + (i + 1) + ": " + somaLinhas[i]);
        }
    }
}


