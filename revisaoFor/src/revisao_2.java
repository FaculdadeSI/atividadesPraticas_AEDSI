
import java.util.Scanner;

public class revisao_2 {

    public static void main(String[] args) {

        int qntd[] = new int[3];
        double valor[] = new double[3];
        double total = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Informe a quantidade do " + (i + 1) + "° produto: ");
            qntd[i] = s.nextInt();
            System.out.println(" ");

        }

        for (int i = 0; i < 3; i++) {

            System.out.println("Informe o valor do " + (i + 1) + "° produto: ");
            valor[i] = s.nextDouble();
            System.out.println(" ");

        }

        for (int i = 0; i < 3; i++) {

            total = (qntd[0] * valor[0]) + (qntd[1] * valor[1]) + (qntd[2] * valor[2]);

        }

        System.out.println("\nValor total da compra: R$" + total);

        s.close();

    }

}
