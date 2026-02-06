package Jogo_do_galo;

import java.util.Scanner;

public class jogo_do_galo {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar  a variavél para o jogo do galo
        int[][] matriz = new int[3][3];

        System.out.println("Jogador 1 joga com: X");
        System.out.println("Jogador 2 joga   com: O");
        System.out.println("  |  |  ");
        System.out.println("--------");
        System.out.println("  |  |  ");
        System.out.println("--------");
        System.out.println("  |  |  ");

        int opcao1, opcao2, opcao3, opcao4, opcao5, opcao6;
        System.out.println("Jogador 1 começa!");
        System.out.println("Qual a coluna deseja jogar? Escolha entre 0, 1 ou 2: ");
        opcao1 = input.nextInt();
        System.out.println("Qual a linha deseja jogar' Escolha entre 0, 1, 2: ");
        opcao2 = input.nextInt();
        matriz[opcao1][opcao2] = "X";


        System.out.println("Jogador 2 pode jogar!");
        System.out.println("Qual a coluna que deseja jogar? Escolha entre 0, 1 ou 2: ");
        opcao3 = input.nextInt();
        System.out.println("Qual a linha deseja jogar' Escolha entre 0, 1, 2: ");
        opcao4 = input.nextInt();
        while (opcao1 == opcao3 && opcao2 == opcao4) {
            System.out.println("Essa posição já foi utilizada, escolha outra posição!");
            System.out.println("Qual a coluna que deseja jogar? Escolha entre 0, 1 ou 2: ");
            opcao3 = input.nextInt();
            System.out.println("Qual a linha deseja jogar' Escolha entre 0, 1, 2: ");
            opcao4 = input.nextInt();
        } matriz[opcao3][opcao4] = "O";

        System.out.println("Jogador 1 joga agora!");
        System.out.println("Qual a coluna deseja jogar? Escolha entre 0, 1 ou 2: ");
        opcao5 = input.nextInt();
        System.out.println("Qual a linha deseja jogar' Escolha entre 0, 1, 2: ");
        opcao6 = input.nextInt();
    }
}
