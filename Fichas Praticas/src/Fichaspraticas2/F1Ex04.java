package Fichaspraticas2;

import java.util.Scanner;

public class F1Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lugar, pos1 = 1, pos2 = 2, pos3 = 3, pos4 = 4, pos5 = 5, pos6 = 6, pos7 = 7, pos8 = 8, valor1 = 10, valor2 = 8, valor3 = 6, valor4 = 5, valor5 = 4, valor6 = 3, valor7 = 2, valor8 = 1, valor9 = 0, pontuacao;

        System.out.print("Qual foi a sua posicao? ");
        lugar = input.nextInt();

        if (lugar == pos1 ) {
            pontuacao = valor1;
            System.out.print("A sua pontuacao e de: " + pontuacao);
        } if (lugar == pos2) {
            pontuacao = valor2;
            System.out.print("A sua pontuacao e de: " + pontuacao);
        } if (lugar == pos3) {
            pontuacao = valor3;
            System.out.print("A sua pontuacao e de: " + pontuacao);
        } if (lugar == pos4) {
            pontuacao = valor4;
            System.out.print("A sua pontuacao e de: " + pontuacao);
        } if (lugar == pos5) {
            pontuacao = valor5;
            System.out.print("A sua pontuacao e de: " + pontuacao);
        } if (lugar == pos6) {
            pontuacao = valor6;
            System.out.print("A sua pontuacao e de: " + pontuacao);
        } if (lugar == pos7) {
            pontuacao = valor7;
            System.out.print("A sua pontuacao e de: " + pontuacao);
        } if (lugar == pos8) {
            pontuacao = valor8;
            System.out.print("A sua pontuacao é de: " + pontuacao);
        } if (lugar > pos8)
            pontuacao = valor9;
            System.out.print("A sua pontuacao e de: " + pontuacao);
        }
    }
}
