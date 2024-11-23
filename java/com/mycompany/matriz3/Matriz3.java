/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz3;
import javax.swing.JOptionPane;

/*
 *
 * @author Bea
 */
public class Matriz3 {

     public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        boolean possuiRepetidos = false;
        int pares = 0, impares = 0;

        // Preenchendo a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para posição [" + i + "][" + j + "]:"));
            }
        }

        // Verificando elementos repetidos e contagem de pares e ímpares
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                // Verificar se há repetidos
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 5; y++) {
                        if ((i != x || j != y) && matriz[i][j] == matriz[x][y]) {
                            possuiRepetidos = true;
                        }
                    }
                }
                // Contagem de pares e ímpares
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        // Exibindo os resultados
        JOptionPane.showMessageDialog(null, "A matriz possui elementos repetidos: " + (possuiRepetidos ? "Sim" : "Não"));
        JOptionPane.showMessageDialog(null, "Quantidade de números pares: " + pares);
        JOptionPane.showMessageDialog(null, "Quantidade de números ímpares: " + impares);
    }
}
