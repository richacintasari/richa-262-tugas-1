import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] data_mahasiswa = new Mahasiswa[100]; // Kapasitas maksimum 100 mahasiswa
        int jumlah_mahasiswa = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline character dari input sebelumnya

            if (pilihan == 1) {
                System.out.println("\nMasukkan data mahasiswa ke-" + (jumlah_mahasiswa + 1));
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                while (nim.length() != 15) {
                    System.out.println("Panjang NIM harus 15 angka. Silakan coba lagi.");
                    System.out.print("NIM: ");
                    nim = scanner.nextLine();
                }
                System.out.print("Jurusan: ");
                String jurusan = scanner.nextLine();

                data_mahasiswa[jumlah_mahasiswa] = new Mahasiswa(nama, nim, jurusan);
                jumlah_mahasiswa++;
            } else if (pilihan == 2) {
                System.out.println("\nDaftar Mahasiswa:");
                for (int i = 0; i < jumlah_mahasiswa; i++) {
                    System.out.println("\nData Mahasiswa ke-" + (i + 1) + ":");
                    data_mahasiswa[i].tampilDataMahasiswa();
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}