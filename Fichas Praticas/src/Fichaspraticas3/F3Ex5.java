package Fichaspraticas3;

import java.util.Scanner;

public class F3Ex5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 1, limite;
        String mensagem;

        System.out.print("Quantas vezes queres a mensagem: ");
        limite = input.nextInt();

        System.out.print("Mensagem: ");
        input.nextLine();
        mensagem = input.nextLine();

        while (num <= limite) {
            System.out.println(mensagem);
            num = num + 1;
        }

    }
}
