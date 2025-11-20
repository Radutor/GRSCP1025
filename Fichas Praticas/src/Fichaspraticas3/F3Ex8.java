package Fichaspraticas3;

import java.util.Scanner;

public class F3Ex8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Insira um numero: ");
        n1 = input.nextInt();

        n2 = n1 + 5;
        n3 = n1 - 5;

        while(n3 <= n2) {
            System.out.println(n3);
            n3 = n3 + 1;
        }

    }
}
