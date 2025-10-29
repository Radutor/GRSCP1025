import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double numero1, numero2, resultado;

        System.out.print("Introduza o numero que pretende somar: ");
        numero1 = input.nextDouble();

        System.out.print("Introduza o segundo numero que pretende somar: ");
        numero2 = input.nextDouble();

        resultado = numero1 + numero2;
        System.out.println("Aqui se econtra a soma de " + numero1 + " e de " + numero2 + " que é: " + resultado);

        resultado = numero1 - numero2;
        System.out.println("Eu sei que não pediu mas sinto que tambem não sabe subtrair " + numero1 + " e " + numero2 + " por isso o resultado é este: " + resultado);

        resultado = numero1 * numero2;
        System.out.println("No final aceito um pagamento no valor de " + numero1 + " multiplicado por " + numero2 + ", portanto o valor devera ser este: " + resultado);

        resultado = numero1 / numero2;
        System.out.println("Como sou uma exelente maquina vou reduzir o valor por " + numero1 + " a dividir por " + numero2 + " que dará um valor de: " + resultado);

    }

}