import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int comprimento, largura, area, perimetro;

        System.out.print("Qual é o comprimento do retangulo? ");
        comprimento = input.nextInt();

        System.out.print("Qual é a largura do retangulo? ");
        largura = input.nextInt();

        area = comprimento * largura;
        System.out.println("A area do retangulo é: " + area);

        perimetro = comprimento + comprimento + largura + largura;
        System.out.print("O perimetro do retangulo é: " + perimetro);

    }


}


