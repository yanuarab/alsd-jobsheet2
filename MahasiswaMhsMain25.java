import java.util.Scanner;

public class MahasiswaMhsMain25 {
    // Atribut Mahasiswa
    String nama;
    String nim;
    String kelas;
    double ipk;

    // Konstruktor Default
    public MahasiswaMhsMain25() {
        nama = "";
        nim = "";
        kelas = "";
        ipk = 0.0;
    }

    // Konstruktor Berparameter
    public MahasiswaMhsMain25(String n, String ni, String k, double i) {
        nama = n;
        nim = ni;
        kelas = k;
        ipk = i;
    }

    // Method untuk menampilkan informasi mahasiswa
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    // Method untuk mengubah kelas
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    // Method untuk memperbarui IPK
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    // Method utama (main)
    public static void main(String[] args) {
        // Objek pertama menggunakan konstruktor default
        MahasiswaMhsMain25 mhs1 = new MahasiswaMhsMain25();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        MahasiswaMhsMain25 mhs2 = new MahasiswaMhsMain25("Annisa Nabila", "2141720160", "TI 2L", 3.25);
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}
