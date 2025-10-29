import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.print("Introduza o primeiro valor: ");
        valor1 = input.nextInt();

        System.out.print("Introduza o segundo valor. ");
        valor2 = input.nextInt();

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        System.out.print("O valor 1 corresponde a " + valor1 + " e o valor 2 corresponde a " + valor2);



    }


}
