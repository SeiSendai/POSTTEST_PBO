Muhammad Fathir Rahman  
NIM: 2409106075  
B2'24

## Deskripsi Program
dengan memanfaatkanProgram Sistem Item AIC (Automated Industry Complex) ini menerapkan sistem list produk berbasis **Java** yang dibuat menggunakan **INTELLIJ IDE**  struktur data **Arraylist**.

Disini kita membuat program CRUD (Create, Read, Update, Delete)
yang berfungsi untuk menyimpan data produk yang ada di AIC ini.
Setelah inheritance, kita sekarang berada ditahap polymorphism yang dimana kita akan melakukan interaksi dengan teknik overloading dan override.

## Konsep Pemrograman
### Inheritance
Program ini sendiri menerapkan Hierarchical Inheritance, yang dimana sebuah superclass diwarisi oleh lebih dari satu subclass.

- Superclass: `produkAIC` yang merupakan produk utama itu sendiri.
- subclass: `Material` merupakan produk yang bertipe material seperti besi.
- subclass: `Consumable` merupakan prduk yang bisa dikonsumsi yang dimana dia memiliki kadaluarsa.
- subclass: `Rarity` merupakan produk yang memiliki rarity yang menunjukkan dia adalah produk langka.

### Polymorphism
Polymorphism sendiri memiliki 2 metode yaitu overloading dan override
- overloading sendiri berfungsi untuk fleksibilitas input.
contoh: Jika barang yang datang adalah kiriman rutin, cukup gunakan `restock(int)`. Jika barang tersebut mengalami perubahan fungsi setelah restok, gunakan `restock(int, String)`.
- override sendiri berfungsi untuk kesesuaian data. Misal, hanya dengan menggunakan `ArrayList<produkAIC>`, kita bisa menyimpan berbagai macam objek (Material, Consumable, Rarity) dalam satu list yang sama. Saat kita memanggil `displayInfo()`
## Contoh Output Tampil
`--- DATABASE PRODUK AIC ---
1. Sendal | Material | 2 Qty | Type: Karet
2. Nasi Goreng | Consumable | 10 Qty | Exp: 10-12-2099
3. Sendal Jokowi | Special Item | 1 Qty | Rarity: [LEGENDARY]`

