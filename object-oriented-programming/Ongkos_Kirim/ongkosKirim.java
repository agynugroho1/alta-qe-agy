/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ongkos_Kirim;

/**
 *
 * @author agy
 */
public class ongkosKirim {
    double volume, ongkos;
    
    void hitungOngkir(double panjang, double lebar, double tinggi, double berat) {
        volume = (panjang * lebar * tinggi) / 5000;
        
        if(volume > berat){
            ongkos = volume * 5000;
            System.out.println("Berat Berdasarkan Dimensi(kg) : "+Math.round(volume));
        } else if (berat >= volume && berat > 1){
            ongkos = berat * 5000;
            System.out.println("Berat Berdasarkan Input (kg) : "+berat);
        } else {
            ongkos = 5000;
            System.out.println("Berat Berdasarkan Standar (kg) : 1");
        } 
        
        
        System.out.println("Harga yang harus di bayar : "+ongkos);
    }
    
}
