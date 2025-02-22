public class DosenMain25 {
    public static void main(String[] args) {
        Dosen25 dosen1 = new Dosen25();

        Dosen25 dosen2 = new Dosen25("D001", "Dr. Andi Suryanto", true, 2010, "Pemrograman");

        System.out.println("Informasi Dosen 1:");
        dosen1.tampilInformasi();

        System.out.println("\nInformasi Dosen 2:");
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Machine Learning");

        System.out.println("\nMasa kerja Dosen 2: " + dosen2.hitungMasaKerja(2024) + " tahun");

        System.out.println("\nInformasi Dosen 2 setelah perubahan:");
        dosen2.tampilInformasi();
    }
}
