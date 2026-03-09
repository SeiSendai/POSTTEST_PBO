import java.util.ArrayList;
import java.util.Scanner;

void main() {
    ArrayList<produkAIC> listProduk = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int menu = 0;

    while (menu != 5) {
        System.out.println("\n=== SISTEM MANAJEMEN PRODUK AIC ===");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan Produk");
        System.out.println("3. Ubah Detail Produk");
        System.out.println("4. Hapus Produk");
        System.out.println("5. Hentikan Program");
        System.out.print("Pilih Menu: ");
        menu = input.nextInt();
        input.nextLine();

        if (menu == 1) {
            System.out.print("Nama Produk: "); String nama = input.nextLine();
            System.out.print("Usage (Material/Consumable): "); String kegunaan = input.nextLine();
            System.out.print("Amount: "); int jumlah = input.nextInt();

            listProduk.add(new produkAIC(nama, kegunaan, jumlah));
            System.out.println("Produk berhasil ditambahkan!");
        }
        else if (menu == 2) {
            if (listProduk.isEmpty()) {
                System.out.println("Data produk masih kosong.");
            } else {
                System.out.println("\n DAFTAR PRODUK AIC ");
                for (int i = 0; i < listProduk.size(); i++) {
                    produkAIC p = listProduk.get(i);
                    System.out.println((i + 1) + ". " + p.productName +
                            " | " + p.usage +
                            " | " + p.amount + "Qty");
                }
            }
            System.out.println("\nTekan Enter untuk kembali...");
            input.nextLine();
        }
        else if (menu == 3) {
            if (listProduk.isEmpty()) {
                System.out.println("Tidak ada data untuk diubah.");
            } else {
                System.out.print("Nomor urut produk: ");
                int idx = input.nextInt() - 1;
                if (idx >= 0 && idx < listProduk.size()) {
                    System.out.println("\n--- Pilih Bagian yang Ingin Diubah ---");
                    System.out.println("1. Nama Produk");
                    System.out.println("2. Usage");
                    System.out.println("3. Amount");
                    System.out.print("Pilihan: ");
                    int subMenu = input.nextInt();
                    input.nextLine();

                    if (subMenu == 1) {
                        System.out.print("Nama Baru: ");
                        listProduk.get(idx).productName = input.nextLine();
                    } else if (subMenu == 2) {
                        System.out.print("Usage Baru: ");
                        listProduk.get(idx).usage = input.nextLine();
                    } else if (subMenu == 3) {
                        System.out.print("Amount Baru: ");
                        listProduk.get(idx).amount = input.nextInt();
                    } else {
                        System.out.println("Pilihan sub-menu salah.");
                    }
                    System.out.println("Data produk berhasil diperbarui.");
                } else {
                    System.out.println("Nomor tidak valid.");
                }
            }
        }
        else if (menu == 4) {
            System.out.print("Nomor urut produk yang akan dihapus: ");
            int idHapus = input.nextInt() - 1;
            if (idHapus >= 0 && idHapus < listProduk.size()) {
                listProduk.remove(idHapus);
                System.out.println("Produk telah dihapus dari sistem.");
            } else {
                System.out.println("Nomor tidak ditemukan.");
            }
        }
        else if (menu == 5) {
            System.out.println("Program Deactivated.");
        }
        else {
            System.out.println("Input salah, silakan pilih menu 1-5.");
        }
    }
}