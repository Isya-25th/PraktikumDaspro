package jobsheet5;

import java.util.Scanner;

public class Tugas3Latihan1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("--- SISTEM IZIN MASUK PERPUSTAKAAN ---");
        System.out.print("Apakah Anda membawa kartu mahasiswa? (TRUE/FALSE): ");
        boolean kartuMahasiswa = sc.nextBoolean();
        System.out.print("Apakah Anda sudah melakukan registrasi online? (TRUE/FALSE): ");
        boolean registrasiOnline = sc.nextBoolean();

        if (kartuMahasiswa && registrasiOnline){
            System.out.println("Anda diizinkan masuk perpustakaan");
        } else {
            System.out.println("Anda tidak diizinkan masuk perpustakaan");
        }

        sc.close();
    }   
}
