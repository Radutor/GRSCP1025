package Ficha06;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, res;

        System.out.println("Insira um numero: ");
        num1 = input.nextInt();

        while ((num1 - num1) == 0) {
            System.out.println("Insira um numero: ");
            num1 = input.nextInt();
        }
        res = "*" * num1;
        System.out.println(res);

    }
}
