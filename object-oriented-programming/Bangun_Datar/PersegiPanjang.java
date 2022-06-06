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
public class PersegiPanjang extends bangunDatar{
    
    float panjang, lebar;
    
    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    float luas() {
        return panjang * lebar;
    }

    @Override
    double keliling() {
        return 2 * (panjang + lebar);
    }
    
    
}
