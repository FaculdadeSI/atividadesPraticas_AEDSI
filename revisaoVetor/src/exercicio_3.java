
import java.util.Scanner;

public class exercicio_3 {

    public static void main(String[] args) {

        int numeros[] = new int[20];
        int valores[] = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Informe o " + (i + 1) + "° número: ");
            numeros[i] = s.nextInt();
            System.out.println(" ");
        }

        for (int i = 0; i < 10; i++) {
            valores[i] = numeros[i];
        }
        System.out.println("Vetor 2: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(valores[i] + " ");
        }
    }
}
