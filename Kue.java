public abstract class Kue {
    private String nama;
    private double harga;

    public abstract double hitungHarga();

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public String toString(){
        return "nama : " + this.nama +"\n harga : " + this.harga;
    }

}
