public class MVCPatternDemo {
    public static void main(String[] args) {
        // Data Barang
        Kasir kasir = new Kasir("GeForce GTX 1060Ti", 3000, 10);

        // Menampilkan Data dan Input
        KasirView view = new KasirView();

        // Menghubungkan Model dan View
        KasirController controller = new KasirController(kasir, view);

        // Menjalankan Aplikasi
        controller.tampilkanBarang();
        controller.prosesTransaksi();
    }
}
