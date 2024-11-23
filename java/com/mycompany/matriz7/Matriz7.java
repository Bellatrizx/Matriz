/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz7;
import javax.swing.JOptionPane;
/**
 *
 * @author Bea
 */
public class Matriz7 {

     public static void main(String[] args) {
        double[][] matriz = {
            {4.5, 5.2}, 
            {4.2, 1.1}
        };
        int x, y;

        // Exibição da mensagem inicial
        JOptionPane.showMessageDialog(null, "****** Imprimindo a matriz ******");

        // Exibição dos valores da matriz
        for (x = 0; x < 2; x++) {
            for (y = 0; y < 2; y++) {
                System.out.println("matriz[" + x + "][" + y + "] = " + matriz[x][y] + " ");
            }
        }
    }
}
