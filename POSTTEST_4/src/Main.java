import java.util.ArrayList;
import java.util.Scanner;

void main() {
    ArrayList<produkAIC> listProduk = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int menu = 0;

    while (menu != 5) {
        System.out.println("\n=== SISTEM PRODUK AIC ===");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan Produk");
        System.out.println("3. Update/Restock");
        System.out.println("4. Hapus Produk");
        System.out.println("5. Keluar");
        System.out.print("Pilih: ");
        menu = input.nextInt(); input.nextLine();

        if (menu == 1) {
            System.out.print("Jenis (1:Mat, 2:Cons, 3:Rarity): ");
            int j = input.nextInt(); input.nextLine();
            System.out.print("Nama: "); String n = input.nextLine();
            System.out.print("Jumlah: "); int a = input.nextInt(); input.nextLine();

            if (j == 1) {
                System.out.print("Tipe: "); String t = input.nextLine();
                listProduk.add(new Material(n, a, t));
            } else if (j == 2) {
                System.out.print("Exp: "); String e = input.nextLine();
                listProduk.add(new Consumable(n, a, e));
            } else if (j == 3) {
                System.out.print("Rarity: "); String r = input.nextLine();
                listProduk.add(new Rarity(n, a, r));
            }
        }
        else if (menu == 2) {
            for (int i = 0; i < listProduk.size(); i++) {
                System.out.print((i + 1) + ". ");
                listProduk.get(i).displayInfo();
            }
        }
        else if (menu == 3) {
            System.out.print("Nomor urut: ");
            int idx = input.nextInt() - 1; input.nextLine();
            if (idx >= 0 && idx < listProduk.size()) {
                System.out.println("1. Tambah Stok Saja");
                System.out.println("2. Tambah Stok & Ubah Status");
                int pil = input.nextInt(); input.nextLine();

                System.out.print("Jumlah Tambahan: ");
                int tamb = input.nextInt(); input.nextLine();

                if (pil == 1) {
                    listProduk.get(idx).restock(tamb);
                } else {
                    System.out.print("Status Baru: ");
                    String stat = input.nextLine();
                    listProduk.get(idx).restock(tamb, stat);
                }
            }
        }
        else if (menu == 4) {
            System.out.print("Hapus nomor: ");
            int h = input.nextInt() - 1;
            if (h >= 0 && h < listProduk.size()) {
                listProduk.remove(h);
                System.out.println("Berhasil dihapus.");
            }
        }
        else if (menu == 5) {
            System.out.println("Sistem Deactivated.");
        }
    }
}