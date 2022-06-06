/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bangun_Ruang;

/**
 *
 * @author agy
 */
public class Kubus extends bangunRuang {
    double sisi;
    
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double volume() {
        return Math.pow(sisi, 3);
    }
    
    
}
