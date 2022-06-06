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
public class problem_2 {
    public static void main(String[] args) {
        // Membuat Object scanner
        Scanner input =  new Scanner(System.in);
        // Membuat label dan inisialisasi nilai (Input)
        System.out.print("Masukkan Nilai : ");
        float nilai = input.nextFloat();
        // Melakukan Branching untuk menentukan Grade yg di dapat (Proses)
        if(nilai >= 80 && nilai <= 100){
            // Kalau Kondisi terpenuhi maka cetak hasil (Output)
            System.out.println("Mendapat nilai A");
        } else if(nilai >= 65 && nilai <= 79){
            // Kalau Kondisi terpenuhi maka cetak hasil (Output)
            System.out.println("Mendapat nilai B+");
        } else if(nilai >= 50 && nilai <= 64){
            // Kalau Kondisi terpenuhi maka cetak hasil (Output)
            System.out.println("Mendapat nilai B");
        } else if(nilai >= 35 && nilai <= 49){
            // Kalau Kondisi terpenuhi maka cetak hasil (Output)
            System.out.println("Mendapat nilai C");
        } else if(nilai >= 0 && nilai <= 34){
            // Kalau Kondisi terpenuhi maka cetak hasil (Output)
            System.out.println("Mendapat nilai D");
        } else{
            // Kalau Kondisi terpenuhi maka cetak hasil (Output)
            System.out.println("Invalid");
        }
    }
}
