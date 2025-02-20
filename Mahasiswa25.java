import java.util.Scanner;

public class Mahasiswa25 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa25(String n, String ni, String k, double i) {
        nama = n;
        nim = ni;
        kelas = k;
        ipk = (i >= 0.0 && i <= 4.0) ? i : 0.0;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) return "Kinerja Sangat Baik";
        else if (ipk >= 3.0) return "Kinerja Baik";
        else if (ipk >= 2.0) return "Kinerja Cukup";
        else return "Kinerja Kurang";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Kelas: ");
        String kelas = scanner.nextLine();

        double ipk = -1; 
        System.out.print("Masukkan IPK: ");
        
        while (scanner.hasNext()) {
            String inputIpk = scanner.next().replace(",", "."); 
            if (inputIpk.matches("[0-9]+(\\.[0-9]*)?")) { 
                ipk = Double.parseDouble(inputIpk);
                if (ipk >= 0.0 && ipk <= 4.0) {
                    break; 
                }
            }
            System.out.print("IPK tidak valid! Masukkan angka antara 0.0 dan 4.0: ");
        }

        Mahasiswa25 mahasiswa = new Mahasiswa25(nama, nim, kelas, ipk);
        mahasiswa.tampilkanInformasi();
        System.out.println("Evaluasi Kinerja: " + mahasiswa.nilaiKinerja());

        scanner.close();
    }
}
