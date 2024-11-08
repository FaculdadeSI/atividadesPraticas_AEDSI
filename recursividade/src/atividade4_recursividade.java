/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 0072379
 */
public class atividade4_recursividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 12;
        int num2 = 18;
        System.out.println("Máximo divisor comum: " + mdc(num1, num2));
    }

    public static int mdc(int num1, int num2) {
        if (num2 != 0) {
            return mdc(num2, num1 % num2);
        } else {
            return num1;
        }
    }

}
