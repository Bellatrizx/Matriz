/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz4;
import javax.swing.JOptionPane;
/**
 *
 * @author Bea
 */
public class Matriz4 {

     public static void main(String[] args) {
        double[][] matriz = new double[4][4];
        StringBuilder diagonalPrincipal = new StringBuilder();
        StringBuilder diagonalSecundaria = new StringBuilder();

        // Preenchendo a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para posição [" + i + "][" + j + "]:"));
            }
        }

        // Obtendo as diagonais
        for (int i = 0; i < 4; i++) {
            diagonalPrincipal.append(matriz[i][i]).append(" ");
            diagonalSecundaria.append(matriz[i][3 - i]).append(" ");
        }

        // Exibindo os resultados
        JOptionPane.showMessageDialog(null, "Diagonal Principal: " + diagonalPrincipal.toString());
        JOptionPane.showMessageDialog(null, "Diagonal Secundária: " + diagonalSecundaria.toString());
    }
}
