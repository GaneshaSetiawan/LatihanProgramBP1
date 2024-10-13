import java.util.Scanner;

public class ModifikasiKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalPembelian = 0;
        double totalPemasukan = 0;
        char lanjutkan = 'y';

        double hargaSateAyam = 1500;
        double hargaSateKambing = 3000;
        double hargaPecelAyam = 13000;
        double hargaPecelEmpal = 15000;
        double hargaPenyetanTahuTempe = 5000;
        double hargaPenyetanTelur = 7000;
        double hargaPenyetanAyam = 10000;

        int pilihMenuUtama;

        do {
            System.out.println("\n--- Menu Utama ---");
            System.out.println("1. Kasir");
            System.out.println("2. Admin");
            System.out.println("3. Owner");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            pilihMenuUtama = input.nextInt();

            switch (pilihMenuUtama) {
                case 1:
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
                                System.out.println("1. Sate Ayam (Rp. " + hargaSateAyam + "/Tusuk)");
                                System.out.println("2. Sate Kambing (Rp. " + hargaSateKambing + "/Tusuk)");
                                System.out.print("Masukkan Nomor Pilihan: ");
                                int jenisSate = input.nextInt();

                                if (jenisSate == 1) {
                                    harga = hargaSateAyam;
                                } else if (jenisSate == 2) {
                                    harga = hargaSateKambing;
                                } else {
                                    System.out.println("Pilihan Tidak valid.");
                                    continue;
                                }

                                System.out.print("Masukkan Jumlah Tusuk Yang Dibeli: ");
                                jumlah = input.nextInt();
                                break;

                            case 2:
                                System.out.println("Pilih Lauk Pecel:");
                                System.out.println("1. Lauk Ayam (Rp. " + hargaPecelAyam + "/Porsi)");
                                System.out.println("2. Lauk Empal (Rp. " + hargaPecelEmpal + "/Porsi)");
                                System.out.print("Masukkan Nomor Pilihan: ");
                                int laukPecel = input.nextInt();

                                if (laukPecel == 1) {
                                    harga = hargaPecelAyam;
                                } else if (laukPecel == 2) {
                                    harga = hargaPecelEmpal;
                                } else {
                                    System.out.println("Pilihan Tidak valid.");
                                    continue;
                                }

                                System.out.print("Masukkan Jumlah Porsi Yang Dibeli: ");
                                jumlah = input.nextInt();
                                break;

                            case 3:
                                System.out.println("Pilih Lauk Penyetan:");
                                System.out.println("1. Tahu/Tempe (Rp. " + hargaPenyetanTahuTempe + "/Porsi)");
                                System.out.println("2. Telur (Rp. " + hargaPenyetanTelur + "/Porsi)");
                                System.out.println("3. Ayam (Rp. " + hargaPenyetanAyam + "/Porsi)");
                                System.out.print("Masukkan Nomor Pilihan: ");
                                int laukPenyetan = input.nextInt();

                                switch (laukPenyetan) {
                                    case 1:
                                        harga = hargaPenyetanTahuTempe;
                                        break;
                                    case 2:
                                        harga = hargaPenyetanTelur;
                                        break;
                                    case 3:
                                        harga = hargaPenyetanAyam;
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
                                totalPemasukan += totalPembelian;
                                totalPembelian = 0;
                                break;

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
                    break;

                case 2:
                    System.out.println("\n--- Menu Admin ---");
                    System.out.println("1. Ubah harga Sate Ayam");
                    System.out.println("2. Ubah harga Sate Kambing");
                    System.out.println("3. Ubah harga Pecel Ayam");
                    System.out.println("4. Ubah harga Pecel Empal");
                    System.out.println("5. Ubah harga Penyetan Tahu/Tempe");
                    System.out.println("6. Ubah harga Penyetan Telur");
                    System.out.println("7. Ubah harga Penyetan Ayam");
                    System.out.print("Pilih barang untuk ubah harga: ");
                    int pilihUbahHarga = input.nextInt();

                    switch (pilihUbahHarga) {
                        case 1:
                            System.out.print("Masukkan harga baru untuk Sate Ayam: ");
                            hargaSateAyam = input.nextDouble();
                            break;
                        case 2:
                            System.out.print("Masukkan harga baru untuk Sate Kambing: ");
                            hargaSateKambing = input.nextDouble();
                            break;
                        case 3:
                            System.out.print("Masukkan harga baru untuk Pecel Ayam: ");
                            hargaPecelAyam = input.nextDouble();
                            break;
                        case 4:
                            System.out.print("Masukkan harga baru untuk Pecel Empal: ");
                            hargaPecelEmpal = input.nextDouble();
                            break;
                        case 5:
                            System.out.print("Masukkan harga baru untuk Penyetan Tahu/Tempe: ");
                            hargaPenyetanTahuTempe = input.nextDouble();
                            break;
                        case 6:
                            System.out.print("Masukkan harga baru untuk Penyetan Telur: ");
                            hargaPenyetanTelur = input.nextDouble();
                            break;
                        case 7:
                            System.out.print("Masukkan harga baru untuk Penyetan Ayam: ");
                            hargaPenyetanAyam = input.nextDouble();
                            break;
                        default:
                            System.out.println("Pilihan Tidak Valid.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Menu Owner ---");
                    System.out.printf("Total pemasukan saat ini: Rp %.2f\n", totalPemasukan);
                    break;

                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid.");
            }
        } while (pilihMenuUtama != 4);

        input.close();
    }
}
