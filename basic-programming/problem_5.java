/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part2;

import java.util.Scanner;

/**
 *
 * @author agy
 */
public class problem_5 {
    private static boolean palindrome(String value){
        // membuat object StringBuilder
        StringBuilder valueR = new StringBuilder();
        // menambahkan value sebagai StringBuilder yg ditampung oleh valueR
        valueR.append(value);
        // menentukan value yg di reverse apakah tetap sama? 
        if(value.equals(valueR.reverse().toString())){
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
        
        Scanner input = new Scanner(System.in);
        // Input kata yg ingin diketahui palindrome atau bukan
        System.out.println("\nMenentukan Kata Palindrome!");
        System.out.print("Masukkan Kata : ");
        String kata = input.nextLine();
        // cetak hasil apakah kata yg di input itu kata palindrome?
        System.out.println("Apakah "+kata+" kata palindrome? "+palindrome(kata));
    }
}
