/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZikriatulQalbiM8;

/**
 *
 * @author hp
 */
public class OperasiAritmatika {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ArithmeticOperation <number1> <number2>");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        System.out.println("Penjumlahan = " + sum);
        System.out.println("Pengurangan = " + difference);
        System.out.println("Perkalian   = " + product);
        System.out.println("Pembagian   = " + quotient);
    }
}