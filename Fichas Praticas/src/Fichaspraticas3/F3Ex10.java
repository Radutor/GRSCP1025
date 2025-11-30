package Fichaspraticas3;

import java.util.Scanner;

public class F3Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 2, limite;

        System.out.print("Insira o limite do intervalo: ");
        limite = input.nextInt();

        while (numero <= limite) {
            System.out.println(numero);
            numero = numero + 2;
        }
    }
}
