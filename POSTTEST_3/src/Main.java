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
        System.out.println("3. Ubah Produk");
        System.out.println("4. Hapus Produk");
        System.out.println("5. Keluar");
        System.out.print("Pilih Menu: ");
        menu = input.nextInt(); input.nextLine();

        if (menu == 1) {
            System.out.println("Jenis Produk: 1. Material | 2. Consumable | 3. Rarity Item");
            int jenis = input.nextInt(); input.nextLine();

            System.out.print("Nama Produk: "); String nama = input.nextLine();
            System.out.print("Amount: "); int jumlah = input.nextInt(); input.nextLine();

            if (jenis == 1) {
                System.out.print("Tipe Material (e.g. Besi): "); String tipe = input.nextLine();
                listProduk.add(new Material(nama, jumlah, tipe));
            } else if (jenis == 2) {
                System.out.print("Expired Date: "); String exp = input.nextLine();
                listProduk.add(new Consumable(nama, jumlah, exp));
            } else if (jenis == 3) {
                System.out.print("Tingkat Rarity (Rare/Epic/Legendary): "); String rar = input.nextLine();
                listProduk.add(new Rarity(nama, jumlah, rar));
            }
            System.out.println("Produk berhasil ditambahkan!");
        }
        else if (menu == 2) {
            if (listProduk.isEmpty()) {
                System.out.println("Belum ada data.");
            } else {
                System.out.println("\n--- DATABASE PRODUK AIC ---");
                for (int i = 0; i < listProduk.size(); i++) {
                    System.out.print((i + 1) + ". ");
                    listProduk.get(i).displayInfo();
                }
            }
        }
        else if (menu == 3) {
            if (listProduk.isEmpty()) {
                System.out.println("Data kosong, tidak ada yang bisa diubah.");
            } else {
                System.out.print("Masukkan nomor urut produk yang ingin diubah: ");
                int idx = input.nextInt() - 1;
                input.nextLine();

                if (idx >= 0 && idx < listProduk.size()) {
                    System.out.println("Data lama: ");
                    listProduk.get(idx).displayInfo();

                    System.out.print("\nMasukkan Nama Baru: ");
                    String namaBaru = input.nextLine();
                    System.out.print("Masukkan Jumlah Baru: ");
                    int jumlahBaru = input.nextInt();
                    input.nextLine();

                    listProduk.get(idx).setProductName(namaBaru);
                    listProduk.get(idx).setAmount(jumlahBaru);

                    System.out.println("Data berhasil diperbarui!");
                } else {
                    System.out.println("Error: Nomor urut tidak ditemukan!");
                }
            }
        }
        else if (menu == 4) {
            if (listProduk.isEmpty()) {
                System.out.println("Data sudah kosong.");
            } else {
                System.out.print("Masukkan nomor urut produk yang akan dihapus: ");
                int idHapus = input.nextInt() - 1;
                input.nextLine();

                if (idHapus >= 0 && idHapus < listProduk.size()) {
                    String namaTerhapus = listProduk.get(idHapus).getProductName();
                    listProduk.remove(idHapus);
                    System.out.println("Produk '" + namaTerhapus + "' berhasil dihapus dari sistem.");
                } else {
                    System.out.println("Error: Nomor urut " + (idHapus + 1) + " tidak valid!");
                }
            }
        }
        else if (menu == 5) {
            System.out.println("Sistem Deactivated.");
        }
    }
}