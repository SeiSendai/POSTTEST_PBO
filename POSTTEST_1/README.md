Muhammad Fathir Rahman  
NIM: 2409106075  
B2'24

## Deskripsi Program
dengan memanfaatkanProgram Sistem Item AIC (Automated Industry Complex) ini menerapkan sistem list produk berbasis **Java** yang dibuat menggunakan **INTELLIJ IDE**  struktur data **Arraylist**.

Disini kita membuat program CRUD (Create, Read, Update, Delete)
yang berfungsi untuk menyimpan data produk yang ada di AIC ini.
Program sendiri akan berjalan secara **loop** sampai pengguna memilih untuk mengehentikan program.

## Stuktur Program
### class produkAIC
Class ini berguna untuk mendefinisikan objek yang dimana didalamnya terdapat atribut.

code:

    class produkAIC {
    String productName;
    String usage;
    int amount;

### ArrayList
ArrayList sendiri berfungsi untuk menyimpan seluruh objek yang dimasukkan oleh pengguna.

code:

    ArrayList<produkAIC> listProduk = new ArrayList<>();

### Program CRUD
Di programnya sendiri terdapat beberapa menu yang bisa dipilih seperti tambah,lihat,ubah,hapus dan keluar.

code:

    System.out.println("1. Tambah Produk");
    System.out.println("2. Tampilkan Produk");
    System.out.println("3. Ubah Detail Produk");
    System.out.println("4. Hapus Produk");
    System.out.println("5. Hentikan Program");

## Implementasi CRUD
### Tambah
Disini nanti kita disuruh untuk memasukkan
- Nama Produk
- Usage (Material/Consumable)
- Amount (Jumlah)

yang kemudan datanya akan disimpan pada ArrayList

### Lihat
Disini dia akan menampilkan data/produk yang sudah kita masukkan

contoh:

`Ferrium | Material | 1000 Qty`

### Ubah
Disini nanti terdapat 3 pilihan untuk kita ubah, yakni
- Nama
- Usage
- Amount

Ketika selesai diubah maka kita bisa melihat hasilnya di menu lihat.

### Hapus
Disini kita disuruh memilih index produk yang akan kita hapus.
Misal kita akan menghapus produk nomor 1 maka produk tersebut akan hilang dari Arraylist.