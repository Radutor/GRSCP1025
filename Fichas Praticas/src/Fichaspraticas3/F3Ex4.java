package Fichaspraticas3;

import java.util.Scanner;

public class F3Ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0, limite;

        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        while (num <= limite){
            System.out.println(num);
            num = num + 1;
        }


    }
}
