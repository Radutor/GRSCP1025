import java.util.Scanner;

    public class Ex01 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int numero1, numero2, soma;

            System.out.print("Introduza o numero que deseja minha exelencia: ");
            numero1 = input.nextInt();

            System.out.print("Aparentemente você esqueceu-se de um numero para poder somar. Escolha mais um numero: ");
            numero2 = input.nextInt();

            soma = numero1 + numero2;

            System.out.print("Parabéns você utilizou um programa para fazer uma soma que uma criança de primaria sabe fazer de cabeça." + soma);


        }
    }
