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
public class problem_6 {
    private static void DrawXYZ(int n){
        // looping untuk melakukan cetak data
        for(int i = 1; i <= n * n; i++){
            // proses seleksi antara kelipatan 3, ganjil, ataupun genap
            if(i % 3 == 0){
                System.out.print("X ");
            } else if(i % 2 == 1){
                System.out.print("Y ");
            } else if(i % 2 == 0){
                System.out.print("Z ");
            }
            // jika kelipatan n maka akan membuat baris baru
            if(i % n == 0){
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        // panggil function dan diberikan nilai
        DrawXYZ(5);
        System.out.println("");
        DrawXYZ(3);
        System.out.println("");
        DrawXYZ(1);
        
        Scanner input =  new Scanner(System.in);
        System.out.print("\nInput : ");
        int n = input.nextInt();
        System.out.println("Output : ");
        DrawXYZ(n);
    }
}