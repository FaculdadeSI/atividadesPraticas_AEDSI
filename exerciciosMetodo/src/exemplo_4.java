
import java.util.Scanner;

public class exemplo_4 {

    public static void main(String[] args) {

        int numero = 0;
        int max = -1;
        int min = 1000000000;
        int cont = 0;
        double soma = 0;
        double media;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe 20 números inteiros e positivos: ");

        for (int i = 0; i < 20; i++) {

            numero = s.nextInt();

            soma += numero;
            cont++;

            if (numero > max) {

                max = numero;

            }

            if (numero < min) {

                min = numero;

            }

        }

        media = soma / cont;

        System.out.println("Maior valor: " + max);
        System.out.println("Menor valor: " + min);

        System.out.println("Média: " + media);

    }

}
