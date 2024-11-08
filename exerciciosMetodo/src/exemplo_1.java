
import java.util.Scanner;

public class exemplo_1 {

    public static void main(String[] args) {

        int numero;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe um número: ");
        numero = s.nextInt();

        int fatorial = numero;

        while (numero > 1) {

            fatorial *= (numero - 1);
            numero--;

        }

        System.out.println("\nFatorial: " + fatorial);

    }

}
