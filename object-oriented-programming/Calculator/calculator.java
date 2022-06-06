/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;


//import java.util.Scanner;

/**
 *
 * @author agy
 */

public class calculator {

    public static void main(String[] args) {
        
//        Scanner input = new Scanner(System.in);
          operator Operator = new operator();
          
          System.out.println("Hasil Pertambahan : " + Operator.pertambahan(3, 4));
          System.out.println("Hasil Pengurangan : " + Operator.pengurangan(15, 4));
          System.out.println("Hasil Perkalian : " + Operator.perkalian(10, 10));
          System.out.println("Hasil Pembagian : " + Operator.pembagian(12, 3));

//        System.out.print("Input angka pertama : ");
//        double angka1 = Double.parseDouble(input.nextLine());
//        System.out.print("Input angka kedua : ");
//        double angka2 = Double.parseDouble(input.nextLine());
//        System.out.print("Pilih Operator (+ , - , *, /) : ");
//        String op = input.nextLine();
//
//        switch (op) {
//            case "+":
//                System.out.println("Hasil Pertambahan : " + Operator.pertambahan(angka1, angka2));
//                break;
//            case "-":
//                System.out.println("Hasil Pengurangan : " + Operator.pengurangan(angka1, angka2));
//                break;
//            case "*":
//                System.out.println("Hasil Perkalian : " + Operator.perkalian(angka1, angka2));
//                break;
//            case "/":
//                System.out.println("Hasil Pembagian : " + Operator.pembagian(angka1, angka2));
//                break;
//            default:
//                System.out.println("invalid operator");
//                break;
//        }

    }
}
