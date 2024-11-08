
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio_3 {

    public static void main(String[] args) {

        int inteiros;

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> lista_inteiros = new ArrayList();

        System.out.println("Informe números inteiros,caso queira parar, digite '-1': ");
        do {

            inteiros = s.nextInt();
            if (inteiros >= 0) {
                lista_inteiros.add(inteiros);
                System.out.println(" ");
            }
        } while (inteiros > 0);

        System.out.println("\nLista de números adicionados: " + lista_inteiros + " ");
        System.out.println(" ");
        System.out.println("Quantidade de números adicionados: " + lista_inteiros.size());
        System.out.println(" ");
        System.out.println("Soma dos números adicionados: " + Soma(lista_inteiros));
        System.out.println(" ");
        System.out.println("Média dos números adicionados: " + Media(lista_inteiros));
        System.out.println(" ");

        int verificar;
        int num = 0;
        System.out.println("Informe o número que deseja verificar: ");
        verificar = s.nextInt();
        for (int i = 0; i < lista_inteiros.size(); i++) {
            if (verificar == lista_inteiros.get(i)) {
                num = verificar;
            }
        }
        if (num == verificar) {
            System.out.println("\nO número está na posição: " + lista_inteiros.lastIndexOf(verificar));
        } else {
            System.out.println("\nO número não está na lista!");
        }

    }

    public static double Soma(ArrayList<Integer> lista_inteiros) {

        int soma = 0;

        for (int i = 0; i < lista_inteiros.size(); i++) {
            soma += lista_inteiros.get(i);
        }

        return soma;
    }

    public static double Media(ArrayList<Integer> lista_inteiros) {

        double media = 0;

        for (int i = 0; i < lista_inteiros.size(); i++) {
            media = Soma(lista_inteiros) / lista_inteiros.size();
        }

        return media;
    }
}
