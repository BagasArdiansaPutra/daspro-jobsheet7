import java.util.Scanner;
public  class SiakadFor6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int totalLulus = 0;
        int totalTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan nilai antara 0 hingga 100.");
                i--;
            }
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                totalLulus++;
            } else {
                totalTidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + totalLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + totalTidakLulus);
        }
    }