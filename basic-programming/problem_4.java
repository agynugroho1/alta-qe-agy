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
public class problem_4 {
    private static boolean primeNumber(int number){
        // inisialisasi variable ada yg digunakan untuk menampung berapa kali bilangan habis di bagi
        int ada = 0;
        // Looping dimulai dari 2 karena bilangan prima itu lebih dari 1
        for(int i = 2; i <= number; i++){
            // proses seleksi bilangan yg habis dibagi atau tidak
            if(number % i == 0){
                // jika bilangan habis di bagi maka variable ada bertambah / increment
                ada++;
            }
        }
        // proses menentukan bilangan prima atau bukan
        if(ada==1){
            return true;
        } else{
            return false;
        }
        /*
            Note :
            Kenapa ada==1 untuk menentukan prima atau bukan?
            Bilangan prima itu hanya berjumlah 2 kali saat dibagi yaitu dibagi dengan 1 dan dirinya sendiri,
            tentunya semua bilangan akan habis jika dibagi dengan 1 maka dari itu looping dimulai dari angka 2
            agar dapat melihat perhitungan dari variable ada, jika variable ada hanya menghitung 1 kali berarti
            itu bilangan prima. kenapa 1 kali? karena pembagian terhitung 1 kali yaitu pada saat bilangan tersebut
            membagi dirinya sendiri dan tentunya semua bilangan dapat dibagi dengan 1 jadi cukup 1 kali perhitungan
            saja untuk menentukan prima atau bukan.
        */
    }
    
    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
   
        Scanner input = new Scanner(System.in);
        // Input bilangan yg ingin diketahui prima atau bukan
        System.out.println("\nMenentukan Bilangan Prima!");
        System.out.print("Masukkan Bilangan : ");
        int bilangan = input.nextInt();
        // cetak hasil apakah bilangan yg di input itu bilangan prima?
        System.out.println("Apakah "+bilangan+" bilangan prima? "+primeNumber(bilangan));
    }
}
