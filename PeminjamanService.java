package service;

import model.Peminjaman;
import java.util.ArrayList;
import java.util.Scanner;

public class PeminjamanService {
    ArrayList<Peminjaman> daftar = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    private String inputString(String prompt) {
        String s;
        do {
            System.out.print(prompt);
            s = sc.nextLine().trim();
            if (s.isEmpty()) System.out.println("Tidak boleh kosong!");
        } while (s.isEmpty());
        return s;
    }

    private String inputNIM(String prompt) {
        String nim;
        do {
            System.out.print(prompt);
            nim = sc.nextLine().trim();
            if (!nim.matches("\\d{10}")) System.out.println("NIM harus 10 digit angka!");
        } while (!nim.matches("\\d{10}"));
        return nim;
    }

    private int inputJumlah(String prompt) {
        int j = 0;
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            if (line.isEmpty()) return -1; 
            try {
                j = Integer.parseInt(line);
                if (j < 1) System.out.println("Jumlah minimal 1!");
                else break;
            } catch (Exception e) { System.out.println("Harus angka!"); }
        }
        return j;
    }

    public void tambah() {
        String nama = inputString("Nama: ");
        String nim = inputNIM("NIM (10 digit): ");
        String dept = inputString("Departemen: ");
        String barang = inputString("Nama Barang: ");
        int jumlah = inputJumlah("Jumlah: ");
        daftar.add(new Peminjaman(nama, nim, dept, barang, jumlah));
        System.out.println("Data berhasil ditambah!");
    }

    public void lihat() {
        if (daftar.isEmpty()) { System.out.println("Belum ada data."); return; }
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println((i + 1) + ".");
            daftar.get(i).tampilkanInfo();
            System.out.println("-----------------");
        }
    }

public void ubah() {
    lihat();
    if (daftar.isEmpty()) return;

    System.out.print("Pilih nomor data yang akan diubah: ");
    int idx = inputJumlah("") - 1;
    if (idx < 0 || idx >= daftar.size()) {
        System.out.println("Nomor tidak valid!");
        return;
    }

    Peminjaman p = daftar.get(idx);

    System.out.print("Nama Baru: ");
    String namaBaru = sc.nextLine().trim();
    p.nama = namaBaru; 

   
    String nimBaru;
    while (true) {
        System.out.print("NIM Baru (10 digit angka): ");
        nimBaru = sc.nextLine().trim();
        if (nimBaru.matches("\\d{10}")) break;
        System.out.println("NIM harus 10 digit angka!");
    }
    p.nim = nimBaru;

    System.out.print("Departemen Baru: ");
    String deptBaru = sc.nextLine().trim();
    p.departemen = deptBaru;

    System.out.print("Barang Baru: ");
    String barangBaru = sc.nextLine().trim();
    p.barang = barangBaru;

    int jumlahBaru = inputJumlah("Jumlah Baru: ");
    p.jumlah = jumlahBaru;

    System.out.println("Data berhasil diubah!");
}


    public void hapus() {
        lihat();
        if (daftar.isEmpty()) return;
        System.out.print("Pilih nomor data: ");
        int idx = inputJumlah("") - 1;
        if (idx < 0 || idx >= daftar.size()) { System.out.println("Nomor tidak valid!"); return; }
        daftar.remove(idx);
        System.out.println("Data berhasil dihapus!");
    }
}
