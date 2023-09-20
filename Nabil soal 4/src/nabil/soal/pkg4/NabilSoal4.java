/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nabil.soal.pkg4;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class NabilSoal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        while (true) {
            // Meminta pengguna untuk memasukkan angka bulat
            System.out.print("Masukkan angka bulat (0 untuk keluar): ");
            int angka = input.nextInt();

            // Memeriksa apakah angka adalah 0 (untuk keluar)
            if (angka == 0) {
                System.out.println("Terima kasih! Program berakhir.");
                break; // Keluar dari loop
            }

            // Memeriksa apakah angka genap atau ganjil dan menampilkan pesan
            if (angka % 2 == 0) {
                System.out.println("Angka genap.");
            } else {
                System.out.println("Angka ganjil.");
            }
        }

        // Menutup objek Scanner
        input.close();
    }
}
