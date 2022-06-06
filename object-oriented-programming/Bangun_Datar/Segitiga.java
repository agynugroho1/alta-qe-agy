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
public class Segitiga extends bangunDatar {
    float alas, tinggi;
    
    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    float luas() {
        return alas * tinggi / 2;
    }

    @Override
    double keliling() {
        return (double) alas + tinggi + Math.sqrt( Math.pow(alas, 2) + Math.pow(tinggi, 2) );
    }
    
}
