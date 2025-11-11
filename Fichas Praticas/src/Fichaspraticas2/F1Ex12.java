package Fichaspraticas2;

import java.util.Scanner;

public class F1Ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String opcao;

        System.out.print("Insira uma das seguintes opcoes: 1.Criar 2.Atualizar 3.Eliminar 4. Sair ");
        opcao = input.next();

        switch (opcao) {
            case "1":
                System.out.print("Criar");
            break;
            case "2":
                System.out.print("Atualizar");
            break;
            case "3":
                System.out.print("Eliminar");
            break;
            case "4":
            break;
        }


    }
}
