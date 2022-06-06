/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ongkos_Kirim;

import java.util.Scanner;

/**
 *
 * @author agy
 */
public class mainOngkosKirim {
    public static void main(String[] args) {
        ongkosKirim ongkir = new ongkosKirim();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Pajang (cm) : ");
        double panjang = input.nextDouble();
        System.out.print("Input Lebar (cm) : ");
        double lebar = input.nextDouble();
        System.out.print("Input Tinggi (cm) : ");
        double tinggi = input.nextDouble();
        System.out.print("Input Berat (kg) : ");
        double berat = input.nextDouble();
        
        ongkir.hitungOngkir(panjang, lebar, tinggi, berat);
    }
}
