/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bangun_Ruang;

/**
 *
 * @author agy
 */
public class mainVolume {
    public static void main(String[] args) {
        bangunRuang bangun_ruang = new bangunRuang();
        Kubus kubus = new Kubus(10);
        Balok balok = new Balok(3, 6, 10);
        Tabung tabung = new Tabung(7, 10);
        
        bangun_ruang.volume();
        System.out.println("Volume Kubus : "+kubus.volume());
        System.out.println("Volume Balok : "+balok.volume());
        System.out.println("Volume Tabung : "+Math.ceil(tabung.volume()));
    }
}
