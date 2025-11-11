package Fichaspraticas2;

import javax.print.DocFlavor;
import java.util.Scanner;

public class F1Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n1, n2, resultado;
        String operacao;


        System.out.print("Digite o primeiro numero: ");
        n1 = input.nextDouble();

        System.out.print("Digite o segundo numero: ");
        n2 = input.nextDouble();

        System.out.print("Qual das seguintes operacoes pretende utilizar? ");
        operacao = input.next();

        switch (operacao) {
            case "+":
            case "soma":
                resultado = n1 + n2;
                System.out.print("A soma destes dois numeros e: " + resultado);
                break;

            case "-":
            case "subtracao":
                resultado = n1 - n2;
                System.out.print("A subtracao destes dois numeros e: " + resultado);
                break;

            case "*":
            case "multiplicao":
                resultado = n1 * n2;
                System.out.print("A multiplicacao destes dois numeros e: " + resultado);
                break;

            case "/":
            case "divisao":
                resultado = n1 / n2;
                System.out.print("A divisao destes dois numeros e: " + resultado);
                break;

            default:
                System.out.print("Operacao invalida");
                break;

        }


    }
}
