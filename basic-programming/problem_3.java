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
public class problem_3 {
    public static void main(String[] args) {
        // Membuat Object scanner
        Scanner input =  new Scanner(System.in);
        // Membuat label dan inisialisasi bilangan (Input)
        System.out.print("Masukkan Bilangan : ");
        int bilangan = input.nextInt();
        System.out.println("Faktornya : ");
        // Looping untuk melakukan pembagian (Proses)
        for(int i = 1; i <= bilangan; i++){
            // Branching; Proses dalam menentukan pembagian habis atau tidak (Proses)
            if(bilangan % i == 0){
                // Cetak faktor yang habis saat membagi bilangan
                System.out.println(i);
            }
        }
    }
}
