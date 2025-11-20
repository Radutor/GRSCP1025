package Fichaspraticas3;

import java.util.Scanner;

public class F3Ex7 {
    public static void main(String[] args) {

        int somatorio = 0, num = 1;

        while(num <= 100) {
            System.out.println(num);
            num = num + 1;
        }

        for(int i = 1; i <= 100; i++) {
            somatorio += i;
        }
        System.out.println("O somatorio de 1 a 100 e: " + somatorio);



    }
}
