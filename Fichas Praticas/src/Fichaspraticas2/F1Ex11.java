package Fichaspraticas2;

import java.util.Scanner;

public class F1Ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldo, montante, saldof, montantevalido = 0;
        String operacao;

        System.out.print("Insire o seu saldo: ");
        saldo = input.nextDouble();

        System.out.print("Insire o montante: ");
        montante = input.nextDouble();

        System.out.print("Insira a operacao que deseja realizar: ");
        operacao = input.next();

        switch (operacao) {
            case "levantar":
                if (saldo >= montante) {
                    saldof = saldo - montante;
                    System.out.print("Montante pode ser levantado, o valor do saldo restante e: " + saldof);
                } if (saldo < montante) {
                    System.out.print("Montante nao pode ser levantado, o valor do saldo nao e suficiente: ");
                }
                break;
            case "depositar":
                if (montante > montantevalido) {
                    saldof = saldo + montante;
                    System.out.print("Montante pode ser depositado. O saldo final com o deposito e de: " + saldof);
                } if (montante <= montantevalido) {
                System.out.print("Montante invalido, so pode ser depositado montante superior a 0 ");
                }
                break;
            default:
                System.out.print("Operacao invalida, as operacoes disponiveis sao: levantar, depositar, creditar/debitar ");
                break;
        }


    }
}
