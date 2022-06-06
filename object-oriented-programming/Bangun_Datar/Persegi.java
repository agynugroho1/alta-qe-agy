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
public class Persegi extends bangunDatar{
    float sisi;
    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    double keliling() {
        return sisi * 4;
    }

    @Override
    float luas() {
        return sisi * sisi;
    }
    
}
