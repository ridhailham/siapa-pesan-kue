public class KueJadi extends Kue{
    private double jumlah;

    KueJadi(String nama, double harga, double jumlah) {
        setNama(nama);
        setHarga(harga);
        this.jumlah = jumlah;
    }

    public double hitungHarga() {
        return getHarga() * this.jumlah * 2;
        
    }

    public String toString() {
        return "nama : " + getNama() + "\nharga : " + getHarga() + "\njumlah" + this.jumlah + "\n";
    }

}