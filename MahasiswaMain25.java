public class MahasiswaMain25 {  
    // Atribut Mahasiswa  
    String nama;  
    String nim;  
    String kelas;  
    double ipk;  

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
    void updateIPK(double ipkBaru) {  
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {  
            ipk = ipkBaru;  
        } else {  
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");  
        }  
    }  

    // Method untuk mengevaluasi kinerja  
    String nilaiKinerja() {  
        if (ipk >= 3.5) {  
            return "Kinerja sangat baik";  
        } else if (ipk >= 3.0) {  
            return "Kinerja baik";  
        } else if (ipk >= 2.0) {  
            return "Kinerja cukup";  
        } else {  
            return "Kinerja kurang";  
        }  
    }  

    public static void main(String[] args) {  
         
        MahasiswaMain25 mhs1 = new MahasiswaMain25();  
        mhs1.nama = "Muhammad Ali Farhan";  
        mhs1.nim = "2241720117";  
        mhs1.kelas = "SI 2J";  
        mhs1.ipk = 3.55;  
 
        mhs1.tampilkanInformasi();  
        mhs1.ubahKelas("SI 2K");  
        mhs1.updateIPK(3.60);  
        mhs1.tampilkanInformasi();  
         
    }  
}