import java.util.Scanner;

public class DiskonPembelian {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Barang Yang Dibeli: ");
        int JumlahBarang = scanner.nextInt();

        System.out.print("Masukkan Harga Satuan Barang: ");
        double HargaSatuan = scanner.nextDouble();

        double TotalPembelian = JumlahBarang * HargaSatuan;
        double diskon = 0;

        if (TotalPembelian >= 100001 && TotalPembelian <= 200000) {
            diskon = 0.05;
        } else if (TotalPembelian >= 200001 && TotalPembelian <= 300000) {
            diskon = 0.10;
        } else if (TotalPembelian >= 300001 && TotalPembelian <= 400000) {
            diskon = 0.15;
        } else if (TotalPembelian >= 400001 && TotalPembelian <= 500000) {
            diskon = 0.20;
        } else if (TotalPembelian > 500000) {
            diskon = 0.25;
        }

        double NominalDiskon = TotalPembelian * diskon;
        double TotalSetelahDiskon = TotalPembelian - NominalDiskon;

        System.out.println("Total Pembelian: Rp " + TotalPembelian);
        System.out.println("Diskon: Rp " + NominalDiskon);
        System.out.println("Total Setelah Diskon: Rp " + TotalSetelahDiskon);

        System.out.print("Masukkan Jumlah Uang Yang Dibayarkan: ");
        double UangDibayarkan = scanner.nextDouble();

        if (UangDibayarkan > TotalSetelahDiskon) {
            double kembalian = UangDibayarkan - TotalSetelahDiskon;
            System.out.println("Kembalian: Rp " + kembalian);
        } else if (UangDibayarkan == TotalSetelahDiskon) {
            System.out.println("Uang Pas");
        } else {
            System.out.println("Uang Yang Dibayarkan Kurang.");
        }

        scanner.close();
    }
}
