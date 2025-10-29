import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, area, pi= 3.14;

        System.out.print("Qual é o raio da circunferencia? ");
        raio = input.nextDouble();

        area = 3.14 * raio * raio;
        System.out.print("A area da circunferencia é: " + area);


    }


}



