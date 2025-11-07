package Fichaspraticas2;

import java.util.Scanner;

public class F1Ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1,n2;

        System.out.print("Digite um numero: ");
        n1 = input.nextInt();

        System.out.print("Digite um numero: ");
        n2 = input.nextInt();

        if (n1 > n2) {
            System.out.print("O numero " + n1 + " é o maior.");
        } else {
            System.out.print("O numero " + n2 + " é o maior.");
        }

    }
}

