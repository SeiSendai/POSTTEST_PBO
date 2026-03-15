Muhammad Fathir Rahman  
NIM: 2409106075  
B2'24

## Deskripsi Program
dengan memanfaatkanProgram Sistem Item AIC (Automated Industry Complex) ini menerapkan sistem list produk berbasis **Java** yang dibuat menggunakan **INTELLIJ IDE**  struktur data **Arraylist**.

Disini kita membuat program CRUD (Create, Read, Update, Delete)
yang berfungsi untuk menyimpan data produk yang ada di AIC ini.
Program sendiri akan berjalan secara **loop** sampai pengguna memilih untuk mengehentikan program.

## Konsep Pemrograman
Disini kita menerapkan program dengan konsep OOP (Object Oriented Programming) yang terdiri dari
1. **Encapsulation**
2. **Acces  Modifier**

### Encapsulation
Encapsulation sendiri merupakan metode/teknik yang berfungsi untuk menyembungikan data pada class dengan membuat class tersebut menjadi private.

### Acces Modifier
Acces modifier sendiri terdiri dari Private, Public, Protected dan Default
yang dimana contoh:
1. `Private`Diterapkan pada Nama, Usage dan Jumlah/Amount.
2. `Public` Meliputi Constructor, Getter dan Setter. Begitu pula dengan Method.
3. `Protected` Sesuai namanya, Protected sendiri diterapkan pada method yang berfungsi untuk mengambil kategori produk.
4. `Default` Standart, terdiri dari atribut Produk.

## Struktur Program 
 Struktur Program sendiri terdiri dari 2 class, yakni
1. Class ProdukAIC
2. Class Main

### Class ProdukAIC
Class ini sendiri digunakan untuk mereprentasikan ProdukAIC itu sendiri.
Terdapat beberapa atribut didalamnya.

contoh dari kode:

`protected String productName;`

`private String usage;`

`private int amount;`

Didalamnya juga sudah memiliki Getter dan Setter.

### Class Main
Class main yang merupakan class utama ini sendiri berisi:
1. CRUD
2. Menu Program
3. Loop
4. Arraylist

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