package Jogo_do_galo;

public class LogicaJogo {

    //Função para criar a matriz
    public static void criarTabuleiro(char[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(" " + matriz[i][c] + " ");
                if (c < 2) {
                    System.out.print("|");

                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-----------");

            }
        }
    }
    //Verificar vitoria
    public static boolean condicaovitoria(char[][] m, char c) {
        for (int i = 0; i < 3; i++) {
            //Linhas e colunas
            if ((m[i][0] == c && m[i][1] == c && m[i][2] == c) || (m[0][i] == c && m[1][i] == c && m[2][i] == c)) {
                return true;
            }
        }
        return false;
    }
    //Verificar empate
    public static boolean condicaoempate(int jogadas) {
        return jogadas == 9;
    }
}
