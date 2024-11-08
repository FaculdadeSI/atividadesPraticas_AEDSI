/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 0072379
 */
public class atividade3_recursividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 2;
        int j = 3;
        System.out.println("Potência: " + potencia(i, j));
    }

    public static int potencia(int i, int j) {
        if (j == 0) {
            return 1;
        } else {
            return i * potencia(i, j - 1);
        }

    }
}
