package jobsheet6;
//NAMA  : Isya Putra Ragil
//NIM   : 254107060116
//Absen : 13
import java.util.Scanner;

public class CM1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //INPUT DATA MAHASISWA
        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String nim = sc.nextLine();

        //INPUT NILAI MATKUL 1
        System.out.println("\n--- Mata kuliah 1: Algortima dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = sc.nextDouble();
        //HITUNG RATA2 NILAI AKHIR MATKUL 1
        double nilaiAkhir1 = (0.3 * uts1) + (0.4 * uas1) + (0.3 * tugas1);

        //INPUT NILAI MATKUL 2
        System.out.println("\n--- Mata kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = sc.nextDouble();
        //HITUNG RATA2 NILAI AKHIR MATKUL 2
        double nilaiAkhir2 = (0.3 * uts2) + (0.4 * uas2) + (0.3 * tugas2);

        //KONVERSI NILAI AKHIR MATKUL 1 
        String grade1, grade2;
        if (nilaiAkhir1 >= 80 && nilaiAkhir1 <= 100) {
            grade1 = "A";
        } else if (nilaiAkhir1 >= 73) {
            grade1 = "B+";
        } else if (nilaiAkhir1 >= 65) {
            grade1 = "B";
        } else if (nilaiAkhir1 >= 60) {
            grade1 = "C+";
        } else if (nilaiAkhir1 >= 50) {
            grade1 = "C";
        } else if (nilaiAkhir1 >= 39) {
            grade1 = "D";  
        } else {
            grade1 = "E";
        }
        //KONVERSI NILAI AKHIR MATKUL 2
        if (nilaiAkhir2 >= 80 && nilaiAkhir2 <= 100) {
            grade2 = "A";
        } else if (nilaiAkhir2 >= 73) {
            grade2 = "B+";
        } else if (nilaiAkhir2 >= 65) {
            grade2 = "B";
        } else if (nilaiAkhir2 >= 60) {
            grade2 = "C+";
        } else if (nilaiAkhir2 >= 50) {
            grade2 = "C";
        } else if (nilaiAkhir2 >= 39) {
            grade2 = "D";  
        } else {
            grade2 = "E";
        }
        //STATUS NILAI AKHIR MATKUL 1 & 2
        String status1 = (nilaiAkhir1 >= 60) ? "Lulus" : "Tidak Lulus";
        String status2 = (nilaiAkhir2 >= 60) ? "Lulus" : "Tidak Lulus";

        //OUTPUT HASIL
        System.out.println("\n====== HASIL PENILAIAN AKADEMIK ======");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("\nMata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("Algoritma & Pemrograman\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n", uts1, uas1, tugas1, nilaiAkhir1, grade1, status1);
        System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n", uts2, uas2, tugas2, nilaiAkhir2, grade2, status2);

        //Hitung rata-rata nilai akhir
        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;
        System.out.println("\n\nRata-rata Nilai Akhir: " + rataRata);
        //Status kelulusan keseluruhan
        String statusKelulusan = (rataRata >= 60) ? "Lulus" : "Tidak Lulus";
        System.out.println("Status Semester: " + statusKelulusan);
        sc.close();
    }
}
