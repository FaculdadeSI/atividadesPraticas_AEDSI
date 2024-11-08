
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author 0072379
 */
public class atividade_fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        a = fat1(5);
        b = fat2(5);
        System.out.println("A: " + a + "\nB: " + b);
    }

    private static int fat1(int n) {
        int r;
        if (n <= 0) {
            r = 1;
        } else {
            r = n * fat1(n - 1);
        }
        return r;
    }

    private static int fat2(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * fat2(n - 1);
        }
    }

}
