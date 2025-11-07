package Fichaspraticas2;

import java.util.Scanner;

public class F1Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario, valor1 = 15000, valor2 = 25000, taxa1 = 0.80, taxa2 = 0.65, taxa3 = 0.60, imposto;

        System.out.print("Qual e o valor do seu salario? ");
        salario = input.nextDouble();

        if (salario < valor1) {
            imposto = salario * taxa1;
            System.out.print("O montante de impostos a pagar sera de " + imposto + "€");
        } if (salario >= valor1 && salario <= valor2) {
            imposto = salario * taxa2;
            System.out.print("O montante de impostos a pagar sera de " + imposto + "€");
        } else {
            imposto = salario * taxa3;
            System.out.print("O montante de impostos a pagar sera de " + imposto + "€");
        }

    }
}
