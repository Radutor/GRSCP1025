package Fichaspraticas3;

import java.util.Scanner;

public class F3Ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 1;

        while (num <= 400) {

            if (num % 2 == 0) {
                System.out.println(num);
            }

            num = num + 1;
        }
    }
}
