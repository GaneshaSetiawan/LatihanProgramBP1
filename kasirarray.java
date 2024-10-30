import java.util.Scanner;
public class kasirarray {
    public static void main(String[] args) {
        String belanja[] = new String[5];
        int harga[] = new int[5];
        int pilih = 0;
        Scanner input = new Scanner(System.in);
        int item = 0;
        int total = 0; 
        int jumlah = 0;
        do {
            System.out.println("Kasir Toko");
            System.out.println("1. Tas (Rp. 400.000)");
            System.out.println("2. Sepatu (Rp. 500.000)");
            System.out.println("3. Sandal (Rp. 50.000)");
            System.out.println("4. Kaos (Rp. 75.000)");
            System.out.println("5. Jaket (Rp. 300.000)");
            System.out.println("6. Keluar");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    if (item >= 5) {
                        System.out.println("Daftar Belanjaan sudah penuh");
                        break; }
                    System.out.print("Masukkan jumlah Tas yang dibeli: ");
                    int jumlahTas = input.nextInt();
                    belanja[item] = "Tas (" + jumlahTas + " )";
                    harga[item] = 400000 * jumlahTas;
                    total += harga[item];
                    jumlah += jumlahTas;
                    item++; 
                    break;
                case 2:
                    if (item >= 5) {
                        System.out.println("Daftar Belanjaan sudah penuh");
                        break; }
                    System.out.print("Masukkan jumlah Sepatu yang dibeli: ");
                    int jumlahSepatu = input.nextInt();
                    belanja[item] = "Sepatu (" + jumlahSepatu + " )";
                    harga[item] = 500000 * jumlahSepatu;
                    total += harga[item];
                    jumlah += jumlahSepatu;
                    item++;
                    break;
                case 3:
                    if (item >= 5) {
                        System.out.println("Daftar Belanjaan sudah penuh");
                        break; }
                    System.out.print("Masukkan jumlah Sandal yang dibeli: ");
                    int jumlahSandal = input.nextInt();
                    belanja[item] = "Sandal (" + jumlahSandal + " )";
                    harga[item] = 50000 * jumlahSandal;
                    total += harga[item];
                    jumlah += jumlahSandal;
                    item++;
                    break;
                case 4:
                    if (item >= 5) {
                        System.out.println("Daftar Belanjaan sudah penuh");
                        break; }
                    System.out.print("Masukkan jumlah Kaos yang dibeli: ");
                    int jumlahKaos = input.nextInt();
                    belanja[item] = "Kaos (" + jumlahKaos + " )";
                    harga[item] = 75000 * jumlahKaos;
                    total += harga[item];
                    jumlah += jumlahKaos; 
                    item++;
                    break;
                case 5:
                    if (item >= 5) {
                        System.out.println("Daftar Belanjaan sudah penuh");
                        break; }
                    System.out.print("Masukkan jumlah Jaket yang dibeli: ");
                    int jumlahJaket = input.nextInt();
                    belanja[item] = "Jaket (" + jumlahJaket + " )";
                    harga[item] = 300000 * jumlahJaket;
                    total += harga[item];
                    jumlah += jumlahJaket;
                    item++;
                    break;
                case 6:
                    System.out.println("Daftar Belanja : ");
                    for (int i = 0; i < item; i++) { 
                        System.out.println((i+1) + ". " + belanja[i] + " - Rp. " + harga[i]);
                    }
                    System.out.println("Grand Total : Rp. " + total);
                    break;
            }
            
            if (item >= 5) 
                item = 5;
            System.out.println("Total Semua Barang: " + jumlah + " "); 
        } while (pilih != 6);
    }
}
