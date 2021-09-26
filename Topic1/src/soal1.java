public class soal1 {
    public static void main(String[] args) {
        // Membuat objek barang pertama (menggunakan 2 parameter)
        Barang barang1 = new Barang("BRG-001", "Tas Gucci");
        barang1.setHarga(1200);
        barang1.print();
        // Membuat objek barang kedua (menggunakan 2 parameter)
        Barang barang2 = new Barang("BRG-002","Printer Epson L355");
        barang2.setHarga(200);
        barang2.print();
        // Membuat objek barang kedua (menggunakan 3 parameter)
        Barang barang3 = new Barang("BRG-003","Koper",150);
        barang3.print();

        // Membuat objek barang kedua (menggunakan 3 parameter)
        Barang barang4 = new Barang("BRG-004","Helm",20);
        barang4.print();

        // tampilan total harga 4
        double total = barang1.getHarga()+ barang3.getHarga()+barang4.getHarga();
        // casst tipe data ke integer
        int totalHarga = (int) total;
        System.out.println("Total Harga dari BRG-001, BRG-003, BRG-004: " + totalHarga);

    }
}
