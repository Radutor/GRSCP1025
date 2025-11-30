package Fichaspraticas3;

import java.util.Scanner;

public class F3Ex9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 0, soma = 1, contador = -1, media;

        while (numero != -1) {
            System.out.print("Insira um número: ");
            numero = input.nextInt();

            soma = soma + numero;
            contador = contador + 1;
        }

        media = soma / contador;

        System.out.println("Média: " + media);

    }
}
