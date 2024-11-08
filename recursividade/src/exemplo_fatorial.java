/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 0072379
 */
public class exemplo_fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int f, g;
        f = fat1(4);
        g = fat2(4);
        System.out.println(" f: " + f + "\ng: " + g);
    }

    public static int fat1(int n) {
        int r;
        if (n <= 0) {
            r = 1;
        } else {
            r = n * fat1(n - 1);

        }
        return r;
    }

    public static int fat2(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * fat2(n - 1);
        }
    }

}
