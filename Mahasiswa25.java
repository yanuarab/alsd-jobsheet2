public class Mahasiswa25 {
    String nama;
    String nim;
    String kelas;
    Double ipk;

  void tampilkanInformasi(){
    System.out.println("Nama: " + nama);
  }
  void ubahKelas (String kelasBaru){
    kelas = kelasBaru;
  }
  void updateIpk (Double ipkBaru){
    ipk = ipkBaru;
  }
  String nilaiKinerja(){
    if(ipk >= 3.5){
        return "Kinerja Sangat Baik";
    }else if (ipk >= 3.0){
        return "Kinerja Baik";
    }else if (ipk >= 2.0){
        return "Kinerja Cukup";
    }else{
        return "Kinerja Kurang";
    }
  }
}