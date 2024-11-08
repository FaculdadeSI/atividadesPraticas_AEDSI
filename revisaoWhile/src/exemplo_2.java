
import java.util.Scanner;

public class exemplo_2 {

    public static void main(String[] args) {

        int numero = 0;
        int tentativa = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe o número certo: ");
        numero = s.nextInt();

        do {

            System.out.println(" ");
            System.out.println("ERRADO! Tente novamente:");
            numero = s.nextInt();
            tentativa++;
        } while (numero != 28);

        System.out.println("\nPARABÉNS! Você acertou o número!");
        System.out.println("\nTentativas: " + tentativa);

    }

}
