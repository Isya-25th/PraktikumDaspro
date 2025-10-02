package jobsheet5;

import java.util.Scanner;

public class Tugas3Latihan2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("--- SISTEM AKSES WIFI KAMPUS ---");
        System.out.print("Masukkan jenis pengguna (Mahasiswa/Dosen/Lainnya): ");
        String jenisPengguna = sc.nextLine();

        if (jenisPengguna.equalsIgnoreCase ("Dosen")){
            System.out.println("Akses WiFi diberikan");
        } else if (jenisPengguna.equalsIgnoreCase ("Mahasiswa")){
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int jumlahSKS = sc.nextInt();
            if (jumlahSKS >= 12){
                System.out.println("Akses WiFi diberikan");
            } else {
                System.out.println("Akses WiFi ditolak");
            }
                
        } else {
            System.out.println("Akses WiFi ditolak");
        }
        
        sc.close();
    }
}
