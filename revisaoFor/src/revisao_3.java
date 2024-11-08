
import java.util.Scanner;

public class revisao_3 {

    public static void main(String[] args) {

        int numero = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe um número: ");
        numero = s.nextInt();

        if (numero != 0) {

            if (numero < 0) {

                System.out.println("NEGATIVO!");

            } else {

                System.out.println("POSITIVO!");
            }

        } else {

            System.out.println("Erro! Informe um número diferente de zero!");
            numero = s.nextInt();

            if (numero < 0) {

                System.out.println("NEGATIVO!");

            } else {

                System.out.println("POSITIVO!");

            }

        }

    }

}
