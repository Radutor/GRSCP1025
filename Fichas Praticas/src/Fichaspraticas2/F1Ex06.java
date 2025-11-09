package Fichaspraticas2;

import java.util.Scanner;

public class F1Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite o primeiro numero: ");
        n1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        n2 = input.nextInt();

        if (n1 > n2) {
            System.out.print("Os dois valores numericos indicados por ordem decrescente sao " + n1 + " e " + n2);
        } else {
            System.out.print("Os dois valores numericos indicados por ordem decrescente sao " + n2 + " e " + n1);
        }

    }
}
