package org.Praktikum;
import java.util.Scanner;

public class Praktikum {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Sistem Login Library ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih jenis user: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                loginAdmin();
                break;
            case 2:
                loginMahasiswa();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
    }

    private static void loginAdmin() {
        System.out.print("Masukkan username: ");
        String username = scanner.next();
        System.out.print("Masukkan password: ");
        String password = scanner.next();

        if (username.equals("admin") && password.equals("password")) {
            System.out.println("Login sebagai Admin berhasil!");
            // Tampilkan menu admin
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    private static void loginMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();

        if (nim.length() != 15) {
            System.out.println("Panjang NIM harus 15 karakter!");
            return;
        }

        // Memproses login mahasiswa
        // ...

        // Tampilkan menu mahasiswa
    }
}