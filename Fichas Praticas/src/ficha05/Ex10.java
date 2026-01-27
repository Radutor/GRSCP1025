package ficha05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][5];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.println("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        int valor

        System.out.println("Insira o valor: ");
        valor = input.nextInt();


}
