
import java.util.Scanner;

public class exercicio_4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int quantidade;

        System.out.println("Informe a quantidade de produtos: ");
        quantidade = s.nextInt();
        System.out.println(" ");

        double valor[] = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe o valor do " + (i + 1) + "° produto: ");
            valor[i] = s.nextDouble();
            System.out.println(" ");
        }

        double total;
        total = soma(valor);
        System.out.println("O total da compra é: R$ " + total);
    }

    public static double soma(double[] compras) {

        double soma = 0;
        for (int i = 0; i < compras.length; i++) {
            soma += compras[i];
        }

        return soma;
    }
}
