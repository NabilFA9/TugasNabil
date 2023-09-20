/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nabil.soal.pkg1;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class NabilSoal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan panjang alas segitiga
        System.out.print("Masukkan panjang alas segitiga (dalam satuan): ");
        double alas = input.nextDouble();
        
        // Meminta pengguna untuk memasukkan tinggi segitiga
        System.out.print("Masukkan tinggi segitiga (dalam satuan): ");
        double tinggi = input.nextDouble();
        
        // Menghitung luas segitiga menggunakan rumus (1/2 * alas * tinggi)
        double luasSegitiga = 0.5 * alas * tinggi;
        
        // Menampilkan hasil perhitungan
        System.out.println("Luas segitiga adalah: " + luasSegitiga + " satuan persegi");
        
        // Menutup objek Scanner
        input.close();
    }
}