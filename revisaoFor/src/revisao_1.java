
import java.util.Scanner;

public class revisao_1 {

    public static void main(String[] args) {

        int numero[] = new int[2];
        int soma = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            System.out.println("Informe o " + (i + 1) + "° número: ");
            numero[i] = s.nextInt();
            System.out.println(" ");

        }

        for (int i = 0; i < 2; i++) {

            soma += numero[i];

        }

        System.out.println("Soma = " + soma);

        s.close();
        
    }

}
