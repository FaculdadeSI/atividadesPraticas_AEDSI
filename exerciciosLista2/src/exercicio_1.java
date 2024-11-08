
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio_1 {

    public static void main(String[] args) {

        int idade;

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> lista_idade = new ArrayList();

        System.out.println("Informe as idades, caso queira parar, escreva '-1': ");
        do {
            idade = s.nextInt();
            System.out.println(" ");
            if (idade >= 0) {
                lista_idade.add(idade);
            }
        } while (idade >= 0);

        System.out.print("Maiores de 18 anos: " + IdadeMax(lista_idade));
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Menores de 18 anos: " + IdadeMin(lista_idade));
        System.out.println(" ");
        System.out.println(" ");

        System.out.print("Maior idade: " + MostrarIdadeMax(lista_idade));
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Menor idade: " + MostrarIdadeMin(lista_idade));
        System.out.println(" ");
        System.out.println(" ");

    }

    public static int IdadeMax(ArrayList<Integer> lista_idade) {

        int cont_1 = 0;

        for (int i = 0; i < lista_idade.size(); i++) {
            if (lista_idade.get(i) >= 18) {
                cont_1++;
            }
        }
        return cont_1;
    }

    public static int IdadeMin(ArrayList<Integer> lista_idade) {

        int cont_2 = 0;

        for (int i = 0; i < lista_idade.size(); i++) {
            if (lista_idade.get(i) >= 0 & lista_idade.get(i) < 18) {
                cont_2++;
            }
        }

        return cont_2;
    }

    public static int MostrarIdadeMax(ArrayList<Integer> lista_idade) {

        int max = -1;
        for (int i = 0; i < lista_idade.size(); i++) {
            if (lista_idade.get(i) > max) {
                max = lista_idade.get(i);
            }
        }

        return max;
    }

    public static int MostrarIdadeMin(ArrayList<Integer> lista_idade) {

        int min = 1000;
        for (int i = 0; i < lista_idade.size(); i++) {
            if (lista_idade.get(i) < min) {
                min = lista_idade.get(i);
            }
        }

        return min;
    }
}
