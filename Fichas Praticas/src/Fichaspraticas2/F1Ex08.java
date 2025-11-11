package Fichaspraticas2;

import java.util.Scanner;

public class F1Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n1, n2, n3, notam = 0, notamax = 20, notafi = 9.5, notamedia, divisor = 3;

        System.out.print("Digite a primeira nota: ");
        n1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = input.nextDouble();

        System.out.print("Digite  terceira nota: ");
        n3 = input.nextDouble();

        if ((n1 >= notam) && (n1 <= notamax) && (n2 >= notam) && (n2 <= notamax) && (n3 >= notam) && (n3 <= notamax)) {
            notamedia = (n1 + n2 + n3) / divisor;

            if (notamedia >= notafi) {
                System.out.print("Voce esta aprovado. A sua media e de  " + notamedia);
            } else {
                System.out.print("Voce nao passou. A sua media e de " + notamedia);
            }
        } else {
            System.out.print("Uma ou varias notas que digitou nao sao validas. As notas tem que estar entre 0 e 20 ");
        }


    }
}
