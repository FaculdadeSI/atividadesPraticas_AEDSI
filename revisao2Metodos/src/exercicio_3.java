
import java.util.Scanner;

public class exercicio_3 {

    public static void main(String[] args) {

        float valor[] = new float[5];
        int cont = 0;
        float soma = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Informe o " + (i + 1) + "° valor: ");
            valor[i] = s.nextFloat();
            cont++;
            System.out.println(" ");

        }

        soma = Msoma(valor);
        Mmedia(soma, cont);

        System.out.println("Soma: " + Msoma(valor));
        System.out.println("\nMédia: " + Mmedia(soma, cont));

    }

    public static float Msoma(float valor[]) {

        float soma = 0;

        for (int i = 0; i < 5; i++) {

            soma += valor[i];

        }

        return soma;

    }

    public static float Mmedia(float soma, int cont) {

        float media;

        media = soma / cont;

        return media;

    }

}
