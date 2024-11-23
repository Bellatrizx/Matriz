/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz9;
  import java.util.Scanner;
/**
 *
 * @author Bea
 */
public class Matriz9 {

    public static void main(String[] args) {
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        char jogadorAtual = 'X';
        boolean jogoAtivo = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo da Velha!");
        exibirTabuleiro(tabuleiro);

        while (jogoAtivo) {
            // Jogador faz a jogada
            System.out.println("Jogador " + jogadorAtual + ", é sua vez!");
            System.out.print("Escolha a linha (1-3): ");
            int linha = scanner.nextInt() - 1; // Ajuste para índice 0
            System.out.print("Escolha a coluna (1-3): ");
            int coluna = scanner.nextInt() - 1; // Ajuste para índice 0

            // Verifica se a posição é válida
            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual; // Faz a jogada
                exibirTabuleiro(tabuleiro);

                // Verifica se há vencedor ou empate
                if (verificarVencedor(tabuleiro, jogadorAtual)) {
                    System.out.println("Parabéns! Jogador " + jogadorAtual + " venceu!");
                    jogoAtivo = false;
                } else if (tabuleiroCheio(tabuleiro)) {
                    System.out.println("O jogo terminou em empate!");
                    jogoAtivo = false;
                } else {
                    // Alterna o jogador
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Jogada inválida! Tente novamente.");
            }
        }
        scanner.close();
    }

    // Exibe o tabuleiro
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("  1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
        System.out.println();
    }

    // Verifica se há um vencedor
    public static boolean verificarVencedor(char[][] tabuleiro, char jogador) {
        // Verifica linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }

        // Verifica colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }

        // Verifica diagonais
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }

        return false;
    }

    // Verifica se o tabuleiro está cheio
    public static boolean tabuleiroCheio(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

