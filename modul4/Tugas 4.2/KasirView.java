import java.util.Scanner;

public class KasirView {
    public void tampilkanInfoBarang(String nama, int harga, int stok) {
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga Barang : " + harga);
        System.out.println("Stok Barang : " + stok);
    }

    public int masukkanJumlahBarang() {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah barang : ");
        return in.nextInt();
    }

    public void tampilkanTotalBayar(int totalBayar) {
        System.out.println("Jumlah Bayar : " + totalBayar);
    }

    public void tampilkanPesan(String pesan) {
        System.out.println(pesan);
    }
}
