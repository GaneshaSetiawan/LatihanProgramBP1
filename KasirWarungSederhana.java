import java.util.Scanner;

public class KasirWarungSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang Di Warung Sederhana");
        System.out.println("Pilih Menu Makananan: ");
        System.out.println("1. Sate");
        System.out.println("2. Pecel");
        System.out.println("3. Penyetan");

        System.out.print("Masukkan Nomor Menu Pilihan Anda: ");
        int menuUtama = input.nextInt();
        double Harga = 0;
        int Jumlah = 0;

        switch (menuUtama) {
            case 1:
                System.out.println("Pilih Jenis Sate:");
                System.out.println("1. Sate Ayam (Rp. 1.500/Tusuk)");
                System.out.println("2. Sate Kambing (Rp. 3.000/Tusuk)");
                System.out.print("Masukkan Nomor Pilihan: ");
                int JenisSate = input.nextInt();

                if (JenisSate == 1) {
                    Harga = 1500;
                } else if (JenisSate == 2) {
                    Harga = 3000;
                } else {
                    System.out.println("Pilihan Tidak valid.");
                    return;
                }

                System.out.print("Masukkan Jumlah Tusuk Yang Dibeli: ");
                Jumlah = input.nextInt();
                break;

            case 2:
                System.out.println("Pilih Lauk Pecel:");
                System.out.println("1. Lauk Ayam (Rp. 13.000/Porsi)");
                System.out.println("2. Lauk Empal (Rp. 15.000/Porsi)");
                System.out.print("Masukkan Nomor Pilihan: ");
                int LaukPecel = input.nextInt();

                if (LaukPecel == 1) {
                    Harga = 13000;
                } else if (LaukPecel == 2) {
                    Harga = 15000;
                } else {
                    System.out.println("Pilihan Tidak valid.");
                    return;
                }

                System.out.print("Masukkan Jumlah Porsi Yang Dibeli: ");
                Jumlah = input.nextInt();
                break;

            case 3:
                System.out.println("Pilih Lauk Penyetan:");
                System.out.println("1. Tahu/Tempe (Rp. 5.000/Porsi)");
                System.out.println("2. Telur (Rp. 7.000/Porsi)");
                System.out.println("3. Ayam (Rp. 10.000/Porsi)");
                System.out.print("Masukkan Nomor Pilihan: ");
                int LaukPenyetan = input.nextInt();

                switch (LaukPenyetan) {
                    case 1:
                        Harga = 5000;
                        break;
                    case 2:
                        Harga = 7000;
                        break;
                    case 3:
                        Harga = 10000;
                        break;
                    default:
                        System.out.println("Pilihan Tidak valid.");
                        return;
                }

                System.out.print("Masukkan Jumlah Porsi Yang Dibeli: ");
                Jumlah = input.nextInt();
                break;

            default:
                System.out.println("Menu Tidak Valid.");
                return;
        }

        double Total = Harga * Jumlah;

        System.out.print("Apakah Anda Memiliki Kartu Member? (Y/N): ");
        char isMember = input.next().charAt(0);

        if (isMember == 'y' || isMember == 'Y') {
            Total *= 0.95;
            System.out.println("Anda mendapatkan diskon 5%.");
        }

        System.out.printf("Total biaya yang harus dibayarkan: Rp %.2f\n", Total);
    }
}
