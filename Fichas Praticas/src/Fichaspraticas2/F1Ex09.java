package Fichaspraticas2;

import java.util.Scanner;

public class F1Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Digite o primeiro numero: ");
        n1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        n2 = input.nextInt();

        System.out.print("Digite o terceiro numero: ");
        n3 = input.nextInt();

        if ((n1 > n2) && (n1 > n3)) {
            System.out.print("O menor numero e: " + n3);
        } if ((n1 < n2) && (n1 < n3)) {
            System.out.print("O menor numero e: " + n1);
        } if ((n2 < n1) && (n2 < n3)) {
            System.out.print("O menor numero e: " + n2);
        } if ((n2 > n1) && (n2 > n3)) {
            System.out.print("O menor numero e: " + n3);
        }

    }
}
