import java.util.Scanner;

public class ProgramKasir {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Masukkan jumlah beras yang dibeli (dalam kg): ");
            double jumlahBeras = input.nextDouble();

            System.out.print("Masukkan harga beras per kg: Rp ");
            double hargaPerKg = input.nextDouble();

            double totalBiaya = jumlahBeras * hargaPerKg;
            System.out.println("Total biaya: Rp " + totalBiaya);

            double diskon = totalBiaya * 0.05;
            double totalSetelahDiskon = totalBiaya - diskon;
            System.out.println("Total setelah diskon 5%: Rp " + totalSetelahDiskon);

            System.out.print("Masukkan jumlah uang yang diterima: Rp ");
            double uangDiterima = input.nextDouble();

            double uangKembalian = uangDiterima - totalSetelahDiskon;

            if (uangKembalian >= 0) {
                System.out.println("Uang kembalian: Rp " + uangKembalian);
            } else {
                System.out.println("Uang yang diterima kurang Rp " + (-uangKembalian));
            }

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        }
    }
}
