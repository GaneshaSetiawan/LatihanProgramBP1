import java.util.Scanner;

public class ModifKasirWarungSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalPembelian = 0;
        char lanjutkan = 'y';

        System.out.println("Selamat Datang Di Warung Sederhana");

        do {
            System.out.println("\nPilih Menu Makanan:");
            System.out.println("1. Sate");
            System.out.println("2. Pecel");
            System.out.println("3. Penyetan");
            System.out.println("4. Selesai dan Hitung Total");

            System.out.print("Masukkan Nomor Menu Pilihan Anda: ");
            int menuUtama = input.nextInt();
            double harga = 0;
            int jumlah = 0;

            switch (menuUtama) {
                case 1:
                    System.out.println("Pilih Jenis Sate:");
                    System.out.println("1. Sate Ayam (Rp. 1.500/Tusuk)");
                    System.out.println("2. Sate Kambing (Rp. 3.000/Tusuk)");
                    System.out.print("Masukkan Nomor Pilihan: ");
                    int jenisSate = input.nextInt();

                    if (jenisSate == 1) {
                        harga = 1500;
                    } else if (jenisSate == 2) {
                        harga = 3000;
                    } else {
                        System.out.println("Pilihan Tidak valid.");
                        continue;
                    }

                    System.out.print("Masukkan Jumlah Tusuk Yang Dibeli: ");
                    jumlah = input.nextInt();
                    break;

                case 2:
                    System.out.println("Pilih Lauk Pecel:");
                    System.out.println("1. Lauk Ayam (Rp. 13.000/Porsi)");
                    System.out.println("2. Lauk Empal (Rp. 15.000/Porsi)");
                    System.out.print("Masukkan Nomor Pilihan: ");
                    int laukPecel = input.nextInt();

                    if (laukPecel == 1) {
                        harga = 13000;
                    } else if (laukPecel == 2) {
                        harga = 15000;
                    } else {
                        System.out.println("Pilihan Tidak valid.");
                        continue;
                    }

                    System.out.print("Masukkan Jumlah Porsi Yang Dibeli: ");
                    jumlah = input.nextInt();
                    break;

                case 3:
                    System.out.println("Pilih Lauk Penyetan:");
                    System.out.println("1. Tahu/Tempe (Rp. 5.000/Porsi)");
                    System.out.println("2. Telur (Rp. 7.000/Porsi)");
                    System.out.println("3. Ayam (Rp. 10.000/Porsi)");
                    System.out.print("Masukkan Nomor Pilihan: ");
                    int laukPenyetan = input.nextInt();

                    switch (laukPenyetan) {
                        case 1:
                            harga = 5000;
                            break;
                        case 2:
                            harga = 7000;
                            break;
                        case 3:
                            harga = 10000;
                            break;
                        default:
                            System.out.println("Pilihan Tidak valid.");
                            continue;
                    }

                    System.out.print("Masukkan Jumlah Porsi Yang Dibeli: ");
                    jumlah = input.nextInt();
                    break;

                case 4:
                    System.out.println("Proses Pembayaran Selesai.");
                    System.out.printf("Total biaya dari seluruh pembelian: Rp %.2f\n", totalPembelian);
                    return;

                default:
                    System.out.println("Menu Tidak Valid.");
                    continue;
            }

            double total = harga * jumlah;

            System.out.print("Apakah Anda Memiliki Kartu Member? (Y/N): ");
            char isMember = input.next().charAt(0);

            if (isMember == 'y' || isMember == 'Y') {
                total *= 0.95;
                System.out.println("Anda mendapatkan diskon 5%.");
            }

            System.out.printf("Total biaya untuk pesanan ini: Rp %.2f\n", total);
            totalPembelian += total;

            System.out.print("Apakah Anda ingin membeli lagi? (Y/N): ");
            lanjutkan = input.next().charAt(0);

        } while (lanjutkan == 'y' || lanjutkan == 'Y');

        System.out.printf("Total biaya dari seluruh pembelian: Rp %.2f\n", totalPembelian);
    }
}