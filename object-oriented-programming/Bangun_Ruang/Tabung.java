/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bangun_Ruang;

/**
 *
 * @author agy
 */
public class Tabung extends bangunRuang {
    double jari, tinggi;

    public Tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    @Override
    double volume() {
        return Math.PI * Math.pow(jari, 2) * tinggi;
    }
    
}
