/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 0072379
 */
public class atividade2_recursividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c, d;
        c = soma1(5);
        d = soma2(5);
        System.out.println("Soma: " + c);
    }

    private static int soma1(int n) {
        int r;
        if (n <= 0) {
            r = 0;
        } else {
            r = n + soma1(n - 1);
        }
        return r;
    }

    private static int soma2(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + soma2(n - 1);
        }
    }

}
