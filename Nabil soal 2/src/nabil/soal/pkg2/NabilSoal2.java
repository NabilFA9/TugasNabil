/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nabil.soal.pkg2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class NabilSoal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan nama
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        
        // Meminta pengguna untuk memasukkan usia
        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();
        
        // Meminta pengguna untuk memasukkan tinggi badan
        System.out.print("Masukkan tinggi badan Anda (dalam meter): ");
        double tinggiBadan = input.nextDouble();
        
        // Menampilkan informasi yang dimasukkan pengguna
        System.out.println("===== Informasi Pengguna =====");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " meter");
        
        // Menutup objek Scanner
        input.close();
    }
}


