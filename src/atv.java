import java.util.Scanner;

public class atv {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int somaTudo = 0;

            int botoes = 2;
            int camisas = 3;
            int[][] matrizBC = new int[botoes][camisas];

            int camisas2 = 3;
            int meses = 2;
            int[][] matrizCM = new int[camisas2][meses];

            for (int i = 0; i < botoes; i++) {
                for (int j = 0; j < camisas; j++) {
                    System.out.print("Digite os valores da matriz botões por camisas");
                    matrizBC[i][j] = teclado.nextInt();
                }
            }
            System.out.println("");
            for (int i = 0; i < camisas2; i++) {
                for (int j = 0; j < meses; j++) {
                    System.out.print("Digite os valores da matriz camisas por meses");
                    matrizCM[i][j] = teclado.nextInt();
                }
            }
            for (int i = 0; i < botoes; i++) {
                for (int j = 0; j < camisas; j++) {
                    System.out.print(matrizBC[i][j] + " ");
                }
                System.out.println("");
            }
            for (int i = 0; i < camisas2; i++) {
                for (int j = 0; j < meses; j++) {
                    System.out.print(matrizCM[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");

            if (matrizBC[0].length == matrizCM.length) {

                int[][] matrizResultante = new int[botoes][meses];
                for (int i = 0; i < botoes; i++) {
                    for (int j = 0; j < meses; j++) {
                        for (int k = 0; k < camisas2; k++) {
                            matrizResultante[i][j] += matrizBC[i][k] * matrizCM[k][j];
                        }
                    }
                }
                for (int i = 0; i < botoes; i++) {
                    for (int j = 0; j < meses; j++) {
                        System.out.print(matrizResultante[i][j] + " ");
                        somaTudo = somaTudo + matrizResultante[i][j];
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println(somaTudo);
            } else {
                System.out.println("Não é pode ser concluida a multiplicação");
            }
        }
    }
