import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemKasir {
    static class Pesanan {
        private String nama;
        private int jumlah;
        private double harga;
        private double total;

        Pesanan(String nama, int jumlah, double harga, double total) {
            this.nama = nama;
            this.jumlah = jumlah;
            this.harga = harga;
            this.total = total;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalPemasukan = 0;
        ArrayList<Pesanan> daftarPesanan = new ArrayList<>();

        double hargaAyamGeprekLvl1 = 11000;
        double hargaAyamGeprekLvl11 = 12000;
        double hargaAyamGeprekLvl21 = 13000;
        double hargaAyamGeprekKeju = 12000;
        double hargaAyamGeprekMayonaise = 12000;
        double hargaAyamGeprekKejuMayonaise = 14000;
        double hargaMinumanBiasa = 5000;
        double hargaMinumanJumbo = 7000;

        while (true) {
            try {
                System.out.println("\n=== SISTEM KASIR AYAM GEPREK ===");
                System.out.println("1. Kasir");
                System.out.println("2. Admin");
                System.out.println("3. Owner");
                System.out.println("4. Exit");
                System.out.print("Pilih Mode: ");
                int pilihMenuUtama = input.nextInt();

                switch (pilihMenuUtama) {
                    case 1:
                        daftarPesanan.clear();
                        double totalPembelian = 0;
                        char lanjutkan = 'Y';

                        do {
                            System.out.println("\nMenu Makanan:");
                            System.out.println("1. Ayam Geprek Level");
                            System.out.println("2. Ayam Geprek Keju/Mayonaise");
                            System.out.println("3. Minuman");
                            System.out.println("4. Selesai dan Hitung Total");

                            System.out.print("Pilihan: ");
                            int menuUtama = input.nextInt();

                            if (menuUtama == 4) {
                                if (totalPembelian == 0) {
                                    System.out.println("Belum ada pesanan!");
                                    continue;
                                }
                                System.out.println("\n=== PEMBAYARAN ===");
                                System.out.printf("Total: Rp %.2f\n", totalPembelian);
                                
                                System.out.print("Uang yang dibayarkan: Rp ");
                                double pembayaran = input.nextDouble();
                                
                                while (pembayaran < totalPembelian) {
                                    System.out.println("Pembayaran kurang!");
                                    System.out.print("Uang yang dibayarkan: Rp ");
                                    pembayaran = input.nextDouble();
                                }

                                double kembalian = pembayaran - totalPembelian;
                                cetakStruk(daftarPesanan, totalPembelian, pembayaran, kembalian);
                                
                                totalPemasukan += totalPembelian;
                                break;
                            }

                            String namaProduk = "";
                            double harga = 0;
                            int jumlah = 0;

                            switch (menuUtama) {
                                case 1:
                                    System.out.println("\nPilih Level: ");
                                    System.out.println("1. Level 1-10 (Rp " + hargaAyamGeprekLvl1 + ")");
                                    System.out.println("2. Level 11-20 (Rp " + hargaAyamGeprekLvl11 + ")");
                                    System.out.println("3. Level 21-30 (Rp " + hargaAyamGeprekLvl21 + ")");
                                    System.out.print("Pilih Level: ");
                                    int level = input.nextInt();
                                    while (level < 1 || level > 3) {
                                        System.out.println("Level tidak valid!");
                                        System.out.print("Pilih level: ");
                                        level = input.nextInt();
                                    }

                                    switch (level) {
                                        case 1:
                                            harga = hargaAyamGeprekLvl1;
                                            namaProduk = "Ayam Geprek Level 1-10";
                                            break;
                                        case 2:
                                            harga = hargaAyamGeprekLvl11;
                                            namaProduk = "Ayam Geprek Level 11-20";
                                            break;
                                        case 3:
                                            harga = hargaAyamGeprekLvl21;
                                            namaProduk = "Ayam Geprek Level 21-30";
                                            break;
                                    }
                                    break;

                                case 2:
                                    System.out.println("\nPilih Varian:");
                                    System.out.println("1. Keju (Rp " + hargaAyamGeprekKeju + ")");
                                    System.out.println("2. Mayonaise (Rp " + hargaAyamGeprekMayonaise + ")");
                                    System.out.println("3. Keju + Mayonaise (Rp " + hargaAyamGeprekKejuMayonaise + ")");
                                    System.out.print("Pilih Varian: ");
                                    int varian = input.nextInt();
                                    while (varian < 1 || varian > 3) {
                                        System.out.println("Varian tidak valid!");
                                        System.out.print("Pilih varian : ");
                                        varian = input.nextInt();
                                    }

                                    switch (varian) {
                                        case 1:
                                            harga = hargaAyamGeprekKeju;
                                            namaProduk = "Ayam Geprek Keju";
                                            break;
                                        case 2:
                                            harga = hargaAyamGeprekMayonaise;
                                            namaProduk = "Ayam Geprek Mayonaise";
                                            break;
                                        case 3:
                                            harga = hargaAyamGeprekKejuMayonaise;
                                            namaProduk = "Ayam Geprek Keju Mayonaise";
                                            break;
                                    }
                                    break;

                                case 3:
                                    System.out.println("\nPilih Minuman:");
                                    System.out.println("1. Teh Es/Hangat Biasa (Rp " + hargaMinumanBiasa + ")");
                                    System.out.println("2. Teh Es/Hangat Jumbo (Rp " + hargaMinumanJumbo + ")");
                                    System.out.println("3. Milo Es/Hangat Biasa (Rp " + hargaMinumanBiasa + ")");
                                    System.out.println("4. Milo Es/Hangat Jumbo (Rp " + hargaMinumanJumbo + ")");
                                    System.out.print("Pilih Minuman : ");
                                    int minuman = input.nextInt();
                                    while (minuman < 1 || minuman > 4) {
                                        System.out.println("Pilihan tidak valid!");
                                        System.out.print("Pilih minuman (1-4): ");
                                        minuman = input.nextInt();
                                    }

                                    switch (minuman) {
                                        case 1:
                                            harga = hargaMinumanBiasa;
                                            namaProduk = "Teh Es/Hangat Biasa";
                                            break;
                                        case 2:
                                            harga = hargaMinumanJumbo;
                                            namaProduk = "Teh Es/Hangat Jumbo";
                                            break;
                                        case 3:
                                            harga = hargaMinumanBiasa;
                                            namaProduk = "Milo Es/Hangat Biasa";
                                            break;
                                        case 4:
                                            harga = hargaMinumanJumbo;
                                            namaProduk = "Milo Es/Hangat Jumbo";
                                            break;
                                    }
                                    break;
                            }
                            System.out.print("Jumlah: ");
                            jumlah = input.nextInt();
                            while (jumlah <= 0) {
                                System.out.println("Jumlah harus lebih dari 0!");
                                System.out.print("Jumlah: ");
                                jumlah = input.nextInt();
                            }

                            double total = harga * jumlah;

                            System.out.print("Member? (Y/N): ");
                            char isMember = input.next().charAt(0);
                            
                            if (isMember == 'Y' || isMember == 'y') {
                                total *= 0.95; // Diskon 5%
                                System.out.println("Diskon member 5% diterapkan");
                            }

                            daftarPesanan.add(new Pesanan(namaProduk, jumlah, harga, total));
                            totalPembelian += total;

                            System.out.printf("Subtotal: Rp %.2f\n", total);
                            System.out.print("Pesan lagi? (Y/N): ");
                            lanjutkan = input.next().charAt(0);
                        } while ( lanjutkan == 'Y' || lanjutkan == 'y');
                        break;

                    case 2:
                        System.out.println("\n=== MENU ADMIN ===");
                        System.out.println("1. Ubah harga Ayam Geprek Level 1-10");
                        System.out.println("2. Ubah harga Ayam Geprek Level 11-20");
                        System.out.println("3. Ubah harga Ayam Geprek Level 21-30");
                        System.out.println("4. Ubah harga Ayam Geprek Keju");
                        System.out.println("5. Ubah harga Ayam Geprek Mayonaise");
                        System.out.println("6. Ubah harga Ayam Geprek Keju Mayonaise");
                        System.out.println("7. Ubah harga Minuman Biasa");
                        System.out.println("8. Ubah harga Minuman Jumbo");
                        
                        System.out.print("Pilihan: ");
                        int pilihUbahHarga = input.nextInt();
                        
                        if (pilihUbahHarga >= 1 && pilihUbahHarga <= 8) {
                            System.out.print("Masukkan harga baru: Rp ");
                            double hargaBaru = input.nextDouble();
                            while (hargaBaru <= 0) {
                                System.out.println("Harga tidak valid!");
                                System.out.print("Masukkan harga baru: Rp ");
                                hargaBaru = input.nextDouble();
                            }

                            switch (pilihUbahHarga) {
                                case 1: hargaAyamGeprekLvl1 = hargaBaru; break;
                                case 2: hargaAyamGeprekLvl11 = hargaBaru; break;
                                case 3: hargaAyamGeprekLvl21 = hargaBaru; break;
                                case 4: hargaAyamGeprekKeju = hargaBaru; break;
                                case 5: hargaAyamGeprekMayonaise = hargaBaru; break;
                                case 6: hargaAyamGeprekKejuMayonaise = hargaBaru; break;
                                case 7: hargaMinumanBiasa = hargaBaru; break;
                                case 8: hargaMinumanJumbo = hargaBaru; break;
                            }
                            System.out.println("Harga berhasil diubah!");
                        } else {
                            System.out.println("Pilihan tidak valid!");
                        }
                        break;

                    case 3:
                        System.out.println("\n=== LAPORAN OWNER ===");
                        System.out.printf("Total Pemasukan: Rp %.2f\n", totalPemasukan);
                        break;

                    case 4:
                        System.out.println("Terima kasih telah menggunakan program ini!");
                        return;

                    default:
                        System.out.println("Menu tidak valid!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                input.nextLine(); // Clear input buffer
            }
        }
    }

    private static void cetakStruk(ArrayList<Pesanan> pesanan, double total, double pembayaran, double kembalian) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        
        System.out.println("\n====================================");
        System.out.println("           AYAM GEPREK              ");
        System.out.println("====================================");
        System.out.println("Tanggal: " + dtf.format(now));
        System.out.println("------------------------------------");
        
        for (Pesanan p : pesanan) {
            System.out.printf("%s\n", p.nama);
            System.out.printf("%d x Rp %.2f = Rp %.2f\n", 
                p.jumlah, p.harga, p.total);
        }
        
        System.out.println("------------------------------------");
        System.out.printf("Total     : Rp %.2f\n", total);
        System.out.printf("Bayar     : Rp %.2f\n", pembayaran);
        System.out.printf("Kembalian : Rp %.2f\n", kembalian);
    }
}