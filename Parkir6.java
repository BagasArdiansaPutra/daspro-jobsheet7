import java.util.Scanner;
public class Parkir6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPembayaran = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk keluar): ");
            int jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            System.out.print("Masukkan durasi parkir dalam jam: ");
            int durasi = sc.nextInt();

            int pembayaran = 0;

            if (durasi > 5) {
                pembayaran = 12500; 
            } else {
                if (jenisKendaraan == 1) { 
                    pembayaran = durasi * 3000;
                } else if (jenisKendaraan == 2) { 
                    pembayaran = durasi * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid. Masukkan 1 untuk mobil atau 2 untuk motor.");
                    continue;
                }
            }

            totalPembayaran += pembayaran;
            System.out.println("Pembayaran untuk kendaraan ini: Rp " + pembayaran);
        }

        System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
    }
}