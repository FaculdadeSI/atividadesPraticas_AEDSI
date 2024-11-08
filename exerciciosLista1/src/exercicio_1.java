
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio_1 {

    public static void main(String[] args) {

        String alunos;
        int cont = 0;

        Scanner s = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList();

        System.out.println("Informe o nome dos alunos, caso queira sair digite 'sair': ");

        do {
            alunos = s.nextLine();
            System.out.println(" ");

            if (!"sair".equals(alunos)) {
                lista.add(alunos);
                cont++;
            }
        } while (!"sair".equals(alunos));

        System.out.println("Quantidade de nomes inseridos: " + cont);
        System.out.println(" ");

        System.out.println("Nomes inseridos: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }

        System.out.println(" ");
        System.out.println(" ");
        lista.clear();

        System.out.println("Lista vazia: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
