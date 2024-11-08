
import java.util.Scanner;

public class exercicio_2 {

    public static void main(String[] args) {

        double notas[] = new double[10];
        int cont = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe a " + (i + 1) + "° nota: ");
            notas[i] = s.nextDouble();
            System.out.println(" ");
        }

        for (int i = 0; i < 10; i++) {
            if (notas[i] >= 60) {
                cont++;
            }
        }

        System.out.println("Alunos acima da média: " + cont);
    }
}
