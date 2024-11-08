
import java.util.Scanner;

public class exemplo_1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Informe a nota: ");
        int nota = s.nextInt();

        nota(nota);
    }

    public static void nota(int notas) {
        if (notas >= 60) {

            System.out.println("Aluno aprovado, nota maior que 60!");
            System.out.println("A nota do aluno foi: " + notas);

        } else {

            System.out.println("Aluno reprovado, nota menor que 60!");
            System.out.println("A nota do aluno foi:  " + notas);

        }

    }

}
