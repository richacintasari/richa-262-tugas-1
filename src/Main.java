import java.util.Scanner;
class Mahasiswa {
    static String universitas = "Universitas ABC";
    String nama;
    String nim;
    String jurusan;

    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    static void tampilUniversitas() {
        System.out.println("Universitas: " + universitas);
    }
}