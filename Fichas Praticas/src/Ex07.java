import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double p1, p2, p3, valor, desc= 0.90;

        System.out.print("Qual é o preço do primeiro produto? ");
        p1 = input.nextDouble();

        System.out.print("Qual é o preço do segundo produto? ");
        p2 = input.nextDouble();

        System.out.print("Qual é o preço do terceiro produto? ");
        p3 = input.nextDouble();

        valor = (p1 + p2 + p3) * desc;
        System.out.println("O preço total com desconto de 10% é de " + valor + "€");
        System.out.println("Você é muito pobre para comprar isto.");




    }


}

