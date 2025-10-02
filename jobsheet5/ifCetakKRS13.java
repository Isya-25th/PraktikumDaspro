package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("--- CETAK KRS SIAKAD---");
        System.out.print("Apakah sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = "";

        pesan = (uktLunas == true) ? "Pembayaran UKT terverifikasi. Silakan cetak KRS" : "Regristasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(pesan);

        sc.close();
    }
}