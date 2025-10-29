import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X1, X2, X3, MA, N= 3;

        System.out.print("Introduza a primeira nota: ");
        X1 = input.nextInt();

        System.out.print("Introduza a segunda nota: ");
        X2 = input.nextInt();

        System.out.print("Introduza a terceira nota: ");
        X3 = input.nextInt();

        MA = (X1 + X2 + X3) / N;
        System.out.println("Aqui está a media aritmetica: " + MA);
        System.out.println("Conclusão: Voce falhou");


    }


}



