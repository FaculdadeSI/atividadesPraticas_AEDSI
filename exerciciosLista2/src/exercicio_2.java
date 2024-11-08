
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio_2 {

    public static void main(String[] args) {

        double valor;
        int qntd;

        Scanner s = new Scanner(System.in);

        ArrayList<Double> lista_valor = new ArrayList();

        ArrayList<Integer> lista_qntd = new ArrayList();

        System.out.println("Informe a quantidade dos produtos, ao acabar, digite '-1': \n");

        do {

            qntd = s.nextInt();
            if (qntd >= 0) {
                lista_qntd.add(qntd);
                System.out.println(" ");
            }
        } while (qntd > 0);

        System.out.println("Informe o valores dos produtos, ao acabar, digite '-1': ");

        do {

            valor = s.nextInt();
            if (valor >= 0) {
                lista_valor.add(valor);
                System.out.println(" ");
            }
        } while (valor > 0);

        System.out.println("Lista de valores: " + lista_valor + " ");
        System.out.println(" ");
        System.out.println("Lista da quantidade dos produtos: " + lista_qntd + " ");
        System.out.println(" ");
        System.out.println("Total da compra: " + Total(lista_valor, lista_qntd));
        System.out.println(" ");
    }

    public static double Total(ArrayList<Double> lista_valor, ArrayList<Integer> lista_qntd) {

        double total = 0;

        for (int i = 0; i < lista_valor.size(); i++) {
            total += lista_valor.get(i) * lista_qntd.get(i);
        }

        return total;
    }

}
