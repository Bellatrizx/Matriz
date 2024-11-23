/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz8;
import javax.swing.JOptionPane;
/**
 *
 * @author Bea
 */
public class Matriz8 {

    public static void main(String[] args) {
        int[][] mat = {
            {14, 42, 23, 14, 51},
            {22, 32, 55, 54, 12}
        };
        int x, y;

        // Exibir mensagem inicial
        JOptionPane.showMessageDialog(null, "****** Exibindo apenas os elementos pares da matriz ******");

        // Iteração pela matriz e exibição dos valores
        for (x = 0; x < 2; x++) {
            for (y = 0; y < 5; y++) {
                if (mat[x][y] % 2 == 0) {
                    System.out.print(mat[x][y] + " "); // Exibe o número par
                } else {
                    System.out.print("- "); // Substitui o número ímpar por um traço
                }
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }
}
