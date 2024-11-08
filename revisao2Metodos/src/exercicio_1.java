
import java.util.Scanner;

public class exercicio_1 {

    public static void main(String[] args) {

        int numero;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe um número: ");
        numero = s.nextInt();

        System.out.println("\nFatorial: " + Mfatorial(numero));

    }

    public static int Mfatorial(int numero) {

        int fatorial = numero;

        while (numero > 1) {

            fatorial *= (numero - 1);
            numero--;

        }

        return fatorial;

    }

}
