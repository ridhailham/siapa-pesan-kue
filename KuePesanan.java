public class KuePesanan extends Kue{
    private double berat;

    KuePesanan(String nama, double harga, double berat){
        setNama(nama);
        setHarga(harga);
        this.berat = berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public double hitungHarga() {
        return getHarga() * this.berat;
    }

    public String toString() {
        return "nama : " + getNama() + "\nharga : " + getHarga() + "\njumlah : " + this.berat +"\n";
    }
}