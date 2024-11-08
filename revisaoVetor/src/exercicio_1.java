
import java.util.Scanner;

public class exercicio_1 {

    public static void main(String[] args) {

        int numeros[] = new int[10];
        double media;
        int soma = 0;
        int cont = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Informe o " + (i + 1) + "° número: ");
            numeros[i] = s.nextInt();
            System.out.println(" ");
            cont++;

            soma += numeros[i];

        }

        System.out.println("Números digitados: ");

        for (int i = 0; i < 10; i++) {

            System.out.print(numeros[i] + " ");
        }

        media = soma / cont;
        
        System.out.println(" ");
        System.out.println("\nMédia: " + media);

    }

}
