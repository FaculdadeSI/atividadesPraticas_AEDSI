
import java.util.Scanner;

public class exemplo_3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Números pares entre 1 e 100: ");
        System.out.println(" ");

        for (int i = 1; i < 100; i++) {

            if ((i % 2 == 0)) {

                System.out.print(i + " ");

            }

        }

    }

}
