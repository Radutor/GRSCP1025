package Fichaspraticas2;

import java.util.Scanner;

public class F1Ex13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos, valor1 = 12, valor2 = 0, valor3 = 1, valor4 = 60, valor5 = 24, horas1;
        String sistema, sistema1;

        System.out.print("Qual o sistema que esta a utilizar, AM/PM ou 24H ? ");
        sistema = input.next();

        switch (sistema) {
            case "AM/PM":
            case "am/pm":
                System.out.print("Insira os minutos: ");
                minutos = input.nextInt();
                System.out.print("Insira as horas: ");
                horas = input.nextInt();
                System.out.print("AM ou PM ?");
                sistema1 = input.next();

                switch (sistema1) {
                    case "AM":
                    case "am":
                        if ((minutos < valor4) && (minutos >= valor2) && (horas <= valor1) && (horas >= valor2)) {
                            System.out.print("As horas em formato 24H e: " + horas + ":" + minutos + "H");
                        } else {
                            System.out.print("Horas indicadas sao invalidas ");
                        }
                    break;
                    case "PM":
                    case "pm":
                        if ((minutos < valor4) && (minutos >= valor2) && (horas <= valor1) && (horas >= valor3)) {
                            horas1 = horas + valor1;
                            System.out.print("As horas em formato 24H e: " + horas1 + ":" + minutos + "H");
                        } else {
                            System.out.print("Horas indicadas sao invalidas ");
                        }
                    break;
                    default:
                        System.out.print("Formato invalido ");
                    break;
                }
            break;
            case "24H":
            case "24h":
                System.out.print("Insira os minutos: ");
                minutos = input.nextInt();
                System.out.print("Insira as horas: ");
                horas = input.nextInt();

                if ((minutos < valor4) && (minutos >= valor2) && (horas < valor5) && (horas >= valor2)) {
                    if (horas <= valor1) {
                        System.out.print("A hora em formato AM/PM e: " + horas + ":" + minutos + " AM");
                    } if (horas > valor1) {
                        horas1 = horas - valor1;
                        System.out.print("A hora em formato AM/PM e: " + horas1 + ":" + minutos + " PM");
                    }
                } else {
                    System.out.print("Horas indicadas invalidas ");
                }
            break;
            default:
                System.out.print("Formato invalido ");
            break;
        }

    }
}
