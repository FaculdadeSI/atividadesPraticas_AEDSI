
import java.util.Scanner;

public class exemplo_1 {

    public static void main(String[] args) {

        double notas[][] = new double[5][3];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Informe a nota do " + (j + 1) + "° aluno na " + (i + 1) + "° disciplina: ");
                notas[i][j] = s.nextDouble();
                System.out.println(" ");
            }
        }

        System.out.println("\nNotas: ");
        System.out.println(" ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
