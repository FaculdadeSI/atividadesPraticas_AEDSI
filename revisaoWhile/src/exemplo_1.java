
import java.util.Scanner;

public class exemplo_1 {

    public static void main(String[] args) {

        int nota = 0;
        double soma = 0;
        double media = 0;
        int cont = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe a nota do aluno: ");
        nota = s.nextInt();

        while (nota >= 0) {

            soma += nota;
            cont++;

            System.out.println(" Informe a nota do aluno: ");
            nota = s.nextInt();

        }

        media = soma / cont;
        System.out.println(" soma " + soma);
        System.out.println("Média das notas: " + media);
        
    }

}
