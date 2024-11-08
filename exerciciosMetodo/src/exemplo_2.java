
import java.util.Scanner;

public class exemplo_2 {

    public static void main(String[] args) {

        int idade;
        int cont_1 = 0;
        int cont_2 = 0;
        int max = -1;
        int min = 1000;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe a idade de 10 pessoas: ");

        for (int i = 0; i < 10; i++) {

            idade = s.nextInt();

            if (idade < 18) {

                cont_1++;

            } else {

                cont_2++;

            }

            if (idade > max) {

                max = idade;

            }

            if (idade < min) {

                min = idade;

            }

        }

        System.out.println("\nPessoas maiores de 18 anos: " + cont_1);
        System.out.println("\nPessoas menores de 18 anos: " + cont_2);

        System.out.println("\nMaior idade: " + max);
        System.out.println("\nMenor idade: " + min);

    }

}
