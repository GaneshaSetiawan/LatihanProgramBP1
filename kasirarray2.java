import java.util.Scanner;
public class kasirarray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String barang [] = new String[5];
        int nota [][] = new int[5][3];
        int pilih = 0, jumlah = 0, total = 0, baris = 0, kolom = 0;

        do {
            System.out.println("\nAplikasi Kasir");
            System.out.println("1.Tas\n2.Sepatu\n3.Sandal");
            System.out.println("4. Akhiri Transaksi");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1: 
                    System.out.println("Tas [100.000]");
                    if (baris < 5) {
                        barang[baris] = "Tas";
                        nota[baris][0] = 100000;
                        System.out.print("Jumlah : ");
                        jumlah = sc.nextInt();
                        nota[baris][1] = jumlah;
                        nota[baris][2] = nota[baris][0] * nota[baris][1];
                        total += nota[baris][2];

                        for (int i = 0; i <= baris; i++) {
                            System.out.print((i+1) + ". ");
                            System.out.print(barang[i] + " ");
                            System.out.print(nota[i][0] + " ");
                            System.out.print(nota[i][1] + " ");
                            System.out.println(nota[i][2]);
                        }
                        baris++;
                    }
                    else {
                        System.out.println("Maaf, Keranjang sudah penuh");
                    }
                    break;
                case 2:
                    System.out.println("Sepatu [200.000]");
                    if (baris < 5) {
                        barang[baris] = "Sepatu";
                        nota[baris][0] = 200000;
                        System.out.print("Jumlah : ");
                        jumlah = sc.nextInt();
                        nota[baris][1] = jumlah;
                        nota[baris][2] = nota[baris][0] * nota[baris][1];
                        total += nota[baris][2];

                        for (int i = 0; i <= baris; i++) {
                            System.out.print((i+1) + ". ");
                            System.out.print(barang[i] + " ");
                            System.out.print(nota[i][0] + " ");
                            System.out.print(nota[i][1] + " ");
                            System.out.println(nota[i][2]);
                        }
                        baris++;
                    }
                    else {
                        System.out.println("Maaf, Keranjang sudah penuh");
                    }
                    break;
                case 3:
                    System.out.println("Sandal [50.000]");
                    if (baris < 5) {
                        barang[baris] = "Sandal";
                        nota[baris][0] = 50000;
                        System.out.print("Jumlah : ");
                        jumlah = sc.nextInt();
                        nota[baris][1] = jumlah;
                        nota[baris][2] = nota[baris][0] * nota[baris][1];
                        total += nota[baris][2];

                        for (int i = 0; i <= baris; i++) {
                            System.out.print((i+1) + ". ");
                            System.out.print(barang[i] + " ");
                            System.out.print(nota[i][0] + " ");
                            System.out.print(nota[i][1] + " ");
                            System.out.println(nota[i][2]);
                        }
                        baris++;
                    }
                    else {
                        System.out.println("Maaf, Keranjang sudah penuh");
                    }
                    break;
                case 4:
                    System.out.println("\n=== NOTA PEMBELIAN ===");
                    System.out.println("No. Barang    Harga    Jumlah    Total");
                    System.out.println("=====================================");
                    for (int i = 0; i < baris; i++) {
                        System.out.printf("%d.  %-8s  %d   %d      %d%n", 
                            (i+1), barang[i], nota[i][0], nota[i][1], nota[i][2]);
                    }
                    System.out.println("=====================================");
                    System.out.printf("Grand Total: Rp %,d%n", total);
                    System.out.println("Terima Kasih Telah Berbelanja!");
                    break;
            }
        } while (pilih != 4);
    }

}
// membuat loop untuk mengakomodasi pembeli baru dengan mereset barang, harga, kuantitas, total, dan grandtotal.