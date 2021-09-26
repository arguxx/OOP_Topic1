// Buat nama Class
public class Barang{
    // Deklarsikan tipe data
    String idProduk, nama;
    double harga;
    // Buat Konstruktor 3 parameter
    Barang(String idProduk,String nama, double harga){
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }
    // Buat Konstruktor 2 parameter
    Barang(String idProduk,String nama){
        this.idProduk = idProduk;
        this.nama = nama;
    }
    // buat set dan get untuk mempermudah perubahan value
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
    public String getIdProduk() {
        return idProduk;
    }
    // buat method untuk memudahkan pencetakan berulang
    public void print(){
        System.out.println(getIdProduk()+", "+getNama()+", "+getHarga());
    }

}