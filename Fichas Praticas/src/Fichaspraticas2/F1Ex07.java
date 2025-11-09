package Fichaspraticas2;

import java.util.Scanner;

public class F1Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, divisor = 2, resto = 0;

        System.out.print("Digite o numero: ");
        n1 = input.nextInt();

        if ((n1 % divisor) == resto) {
            System.out.print("O numero que apresentou e par ");
        } else {
            System.out.print("O numero que apresentou e impar ");
        }


    }
}
