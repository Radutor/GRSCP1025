package Fichaspraticas3;

import java.util.Scanner;

public class F3Ex6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio, limite;

        System.out.print("Insira o início do intervalo: ");
        inicio = input.nextInt();

        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        while (inicio <= limite) {
            System.out.println(inicio);
            inicio = inicio + 1;
        }
    }
}
