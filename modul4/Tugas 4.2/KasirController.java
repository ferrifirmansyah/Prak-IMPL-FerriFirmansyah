public class KasirController {
    private Kasir model;
    private KasirView view;

    public KasirController(Kasir model, KasirView view) {
        this.model = model;
        this.view = view;
    }

    public void tampilkanBarang() {
        view.tampilkanInfoBarang(model.getNama(), model.getHarga(), model.getStok());
    }

    public void prosesTransaksi() {
        tampilkanBarang();
        view.tampilkanPesan("Transaksi Pembelian");
        int jumlah = view.masukkanJumlahBarang();

        if (jumlah <= model.getStok()) {
            int totalBayar = jumlah * model.getHarga();
            model.setStok(model.getStok() - jumlah);
            view.tampilkanTotalBayar(totalBayar);
        } else {
            view.tampilkanPesan("Stok tidak mencukupi.");
        }

        tampilkanBarang(); 
    }
}
