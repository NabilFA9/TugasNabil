/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nabil.soal.pkg3;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class NabilSoal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan dua angka bulat
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        // Melakukan operasi penjumlahan, pengurangan, perkalian, dan pembagian
        int hasilPenjumlahan = angka1 + angka2;
        int hasilPengurangan = angka1 - angka2;
        int hasilPerkalian = angka1 * angka2;

        // Memeriksa pembagian oleh nol
        double hasilPembagian = 0.0;
        if (angka2 != 0) {
            hasilPembagian = (double) angka1 / angka2;
        } else {
            System.out.println("Pembagian oleh nol tidak valid.");
        }

        // Menampilkan hasil operasi ke layar
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);

        if (angka2 != 0) {
            System.out.println("Hasil Pembagian: " + hasilPembagian);
        }

        // Menutup objek Scanner
        input.close();
    }
}
