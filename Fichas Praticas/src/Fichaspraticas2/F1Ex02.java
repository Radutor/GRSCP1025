package Fichaspraticas2;

import java.util.Scanner;

public class F1Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario, valor = 15000,  taxa1 = 0.80, taxa2 = 0.70, imposto;

        System.out.print("Introduza o seu salario: ");
        salario = input.nextDouble();

        if (salario <= valor){
            imposto = salario * taxa1;
            System.out.print("O imposto a pagar será de " + imposto + "€");
        } else {
            imposto = salario * taxa2;
            System.out.print("O imposto a pagar é de " + imposto + "€");
        }
    }
}
