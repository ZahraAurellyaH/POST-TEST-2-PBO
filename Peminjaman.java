package model;

public class Peminjaman {
    public String nama, nim, departemen, barang;
    public int jumlah;

    public Peminjaman(String nama, String nim, String departemen, String barang, int jumlah) {
        this.nama = nama;
        this.nim = nim;
        this.departemen = departemen;
        this.barang = barang;
        this.jumlah = jumlah;
    }

    public void tampilkanInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Departemen  : " + departemen);
        System.out.println("Nama Barang : " + barang);
        System.out.println("Jumlah      : " + jumlah);
    }
}
