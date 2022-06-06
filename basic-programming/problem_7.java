/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part2;

/**
 *
 * @author agy
 */
public class problem_7 {
    private static float Mean(float[] numbers){
        /* inisialisasi variable sum untuk menampung 
        total pertambahan dari isi Array */
        float sum = 0;
        // gunakan looping untuk membreakdown isi Array
        for(int i = 0; i < numbers.length; i++){
            // proses perhitungan total dari isi Array
            sum += numbers[i];
        }
        // Inisialisasi proses perhitungan mean
        float mean = sum / numbers.length;
    
        return mean;
    }
    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        // cetak mean
        System.out.println("Hasil Rata-rata dari Array adalah "+Mean(value));
    }
}
