package Jogo_do_galo;

import java.util.Scanner;

public class jogo_do_galo {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        //Matriz
        char[][] matriz = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char jogadorAtual = 'X';
        int totalJogadas = 0;
        boolean fimDeJogo = false;

        System.out.println("---Jogo Do Galo---");

        while (!fimDeJogo) {
            //Chamar a biblioteca para criação do tabuleiro
            LogicaJogo.criarTabuleiro(matriz);
            System.out.println("\nJogador " + jogadorAtual + ", é a tua vez!");

            System.out.print("Linha (0, 1, 2): ");
            int linha = input.nextInt();
            System.out.print("Coluna (0, 1, 2): ");
            int coluna = input.nextInt();

            //Verificar se a casa que se jogou já foi usada
            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && matriz[linha][coluna] == ' ') {
                matriz[linha][coluna] = jogadorAtual;
                totalJogadas++;

                //Chamar a biblioteca para verificar a vitoria ou empate
                if (LogicaJogo.condicaovitoria(matriz, jogadorAtual)) {
                    LogicaJogo.criarTabuleiro(matriz);
                    System.out.println("Vitoria! O Jogador " + jogadorAtual + " ganhou!");
                    fimDeJogo = true;
                } else if (LogicaJogo.condicaoempate(totalJogadas)) {
                    LogicaJogo.criarTabuleiro(matriz);
                    System.out.println("Empate! O tabuleiro está completo.");
                    fimDeJogo = true;
                } else {
                    //mudar para jogador seguinte
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("\n[ERRO] jogada inválida! Tenta outra vez.\n");
            }
        }
    }
}