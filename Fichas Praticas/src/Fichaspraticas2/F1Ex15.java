package Fichaspraticas2;

import java.util.Scanner;

public class F1Ex15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3;
        String ordem;


        System.out.print("Insira o primeiro numero: ");
        n1 = input.nextInt();

        System.out.print("Insira o segundo numero: ");
        n2 = input.nextInt();

        System.out.print("Insira o terceiro numero: ");
        n3 = input.nextInt();

        System.out.print("Que ordem deseja usar? ");
        ordem = input.next();

        switch (ordem) {
            case "crescente":
            case "Crescente":
                if (n1 < n2 && n1 < n3) {
                    if (n2 < n3) {
                        System.out.println(n1 + " " + n2 + " " + n3);
                    } else {
                        System.out.println(n1 + " " + n3 + " " + n2);
                    }
                }
                if (n2 < n1 && n2 < n3) {
                    if (n1 < n3) {
                        System.out.println(n2 + " " + n1 + " " + n3);
                    } else {
                        System.out.println(n2 + " " + n3 + " " + n1);
                    }
                }
                if (n3 < n1 && n3 < n2) {
                    if (n1 < n2) {
                        System.out.println(n3 + " " + n1 + " " + n2);
                    } else {
                        System.out.println(n3 + " " + n2 + " " + n1);
                    }
                }
            break;
            case "decrescente":
            case "Decrescente":
                if (n1 < n2 && n1 < n3) {
                    if (n2 < n3) {
                        System.out.println(n3 + " " + n2 + " " + n1);
                    } else {
                        System.out.println(n2 + " " + n3 + " " + n1);
                    }
                }
                if (n2 < n1 && n2 < n3) {
                    if (n1 < n3) {
                        System.out.println(n3 + " " + n1 + " " + n2);
                    } else {
                        System.out.println(n1 + " " + n3 + " " + n2);
                    }
                }
                if (n3 < n1 && n3 < n2) {
                    if (n1 < n2) {
                        System.out.println(n2 + " " + n1 + " " + n3);
                    } else {
                        System.out.println(n1 + " " + n2 + " " + n3);
                    }
                }
            break;
            default:
                System.out.print("Opcao invalida ");
            break;

        }
    }
}
