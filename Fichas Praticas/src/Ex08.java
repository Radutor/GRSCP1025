import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sm1, sm2, sm3, mm1, mm2, mm3, somas, somam, somah, tempo= 60;

        System.out.print("Qual o tempo em minutos da primeira musica? ");
        mm1 = input.nextInt();

        System.out.print("Qual o tempo em segundos da primeira musica? ");
        sm1 = input.nextInt();

        System.out.print("Qual é o tempo em minutos da segunda musica? ");
        mm2 = input.nextInt();

        System.out.print("Qual é o tempo em segundos da segunda musica? ");
        sm2 = input.nextInt();

        System.out.print("Qual é o tempo em minutos da terceira musica? ");
        mm3 = input.nextInt();

        System.out.print("Qual é o tempo em segundos da terceira musica? ");
        sm3 = input.nextInt();

        somas = (sm1 + sm2 + sm3) % tempo;

        somam = ((mm1 + mm2 + mm3) % tempo) + ((sm1 + sm2 + sm3) / tempo);

        somah = (mm1 + mm2 + mm3) / tempo;

        System.out.print("O tempo total de playlist de musica escolhida é de " + somah + "h:" + somam + "m:" + somas + "s");


    }


}