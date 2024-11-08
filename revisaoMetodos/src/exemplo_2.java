
import java.util.Scanner;

public class exemplo_2 {

    public static void main(String[] args) {

        int valor_1, valor_2;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe dois valores: ");
        valor_1 = s.nextInt();
        valor_2 = s.nextInt();

        System.out.println("\nA soma dos valores é: " + soma(valor_1, valor_2));
    }

    public static int soma(int valor_1, int valor_2) {

        int soma = valor_1 + valor_2;

        return soma;

    }

}
