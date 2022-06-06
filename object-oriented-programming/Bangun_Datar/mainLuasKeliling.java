/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun_Datar;

/**
 *
 * @author agy
 */
public class mainLuasKeliling {
    public static void main(String[] args) {
        bangunDatar bangun_datar = new bangunDatar();
        Persegi persegi = new Persegi(4);
        Segitiga segitiga = new Segitiga(3, 4);
        PersegiPanjang persegiPanjang = new PersegiPanjang(7, 8);
        
        bangun_datar.luas();
        System.out.println("Luas Persegi : "+persegi.luas());
        System.out.println("Luas Segitiga : "+segitiga.luas());
        System.out.println("Luas Persegi Panjang : "+persegiPanjang.luas());
        
        System.out.println("");
        
        bangun_datar.keliling();
        System.out.println("Keliling Persegi : "+persegi.keliling());
        System.out.println("Keliling segitiga : "+segitiga.keliling());
        System.out.println("Keliling Persegi Panjang : "+persegiPanjang.keliling());
    }
}
