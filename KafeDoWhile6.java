import java.util.Scanner;
public class KafeDoWhile6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int kopi, teh, roti;
        String namapelanggan;
        double hrgKopi = 12000.0, hrgTeh = 7000.0, hrgRoti = 20000.0;
        do { 
            System.out.print("Masukkan pelanggan (ketik 'batal' untuk keluar): ");
            namapelanggan = sc.nextLine();
            if (namapelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            double totalHarga = (kopi * hrgKopi) + (teh * hrgTeh) + (roti * hrgRoti);
            System.out.println("Total yang harus dibayar: Rp." + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
    }
}