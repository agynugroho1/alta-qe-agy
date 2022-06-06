/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part1;

import java.util.Scanner;

/**
 *
 * @author agy
 */
public class problem_1 {
    public static void main(String[] args) {
        // Membuat Object scanner
        Scanner input =  new Scanner(System.in);
        // Membuat label serta insialisasi alas dan tinggi (Input)
        System.out.print("Input Alas : ");
        float alas = input.nextFloat();
        System.out.print("Input Tinggi : ");
        float tinggi = input.nextFloat();
        // Inisialisasi luas (Proses)
        float luas = alas * tinggi / 2;
        // Cetak Hasil (Output)
        System.out.println("Luas Segitiga : "+luas);
    }
}
