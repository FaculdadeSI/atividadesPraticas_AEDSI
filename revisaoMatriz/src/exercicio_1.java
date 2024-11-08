
import java.util.Scanner;

public class exercicio_1 {

    public static void main(String[] args) {

        int numeros[][] = new int[2][5];
        int soma = 0;
        double media = 0;
        int cont = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Informe o " + (j + 1) + "° número da " + (i + 1) + "° coluna: ");
                numeros[i][j] = s.nextInt();
                cont++;
                System.out.println(" ");
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                soma += numeros[i][j];
            }
        }

        media = soma / cont;

        System.out.println("Números da matriz: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("\nMédia da matriz: " + media);
    }
}
