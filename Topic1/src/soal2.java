public class soal2 {
    public static void main(String[] args){
        // buat object1
        Buku buku1 = new Buku("","", 0);
        Buku buku2 = new Buku("", "", 0);
        buku1.setJudul("Harry Potter");
        buku1.setPengarang("J.K. Rowling");
        buku1.setHarga(300000);
        buku1.print();

        buku2.setJudul("UML");
        buku2.setPengarang("Ivar Jacobson");
        buku2.setHarga(400000);
        buku2.print();
    }
}
