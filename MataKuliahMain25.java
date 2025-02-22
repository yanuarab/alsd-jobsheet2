public class MataKuliahMain25 {
    public static void main(String[] args) {

        MataKuliah25 mk1 = new MataKuliah25();

        MataKuliah25 mk2 = new MataKuliah25("IF101", "Algoritma & Struktur Data", 3, 6);

        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInformasi();

        System.out.println("\nInformasi Mata Kuliah 2:");
        mk2.tampilInformasi();

        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangiJam(3);

        System.out.println("\nInformasi Mata Kuliah 2 setelah perubahan:");
        mk2.tampilInformasi();
    }
}