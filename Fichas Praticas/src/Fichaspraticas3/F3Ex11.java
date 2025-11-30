package Fichaspraticas3;

import java.util.Scanner;

public class F3Ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 0, limite, salto;

        // Ler valores
        System.out.print("Limite do intervalo: ");
        limite = input.nextInt();

        System.out.print("Salto: ");
        salto = input.nextInt();

        while (numero <= limite) {
            System.out.println(numero);
            numero = numero + salto;
        }

    }
}

