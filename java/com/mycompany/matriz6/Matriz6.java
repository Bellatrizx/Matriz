/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz6;
import javax.swing.JOptionPane;
/**
 *
 * @author Bea
 */
public class Matriz6 {

    public static void main(String[] args) {
        final int N_Lin = 3, N_Col = 3; // Dimensões da matriz
        int[][] mat = new int[N_Lin][N_Col];
        int l, c;

        // Cadastro dos dados na matriz
        JOptionPane.showMessageDialog(null, "****** Cadastrando dados na matriz ******\nEntre com o valor em cada posição da matriz");
        for (l = 0; l < N_Lin; l++) {
            for (c = 0; c < N_Col; c++) {
                mat[l][c] = Integer.parseInt(
                    JOptionPane.showInputDialog("Valor linha " + (l + 1) + " coluna " + (c + 1) + ":")
                );
            }
        }

        // Exibição dos dados da matriz
        JOptionPane.showMessageDialog(null, "****** Exibindo os dados da matriz ******");
        for (l = 0; l < N_Lin; l++) {
            for (c = 0; c < N_Col; c++) {
                System.out.print(mat[l][c] + "\t"); // Tabulação para melhor visualização
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }
    }
}
