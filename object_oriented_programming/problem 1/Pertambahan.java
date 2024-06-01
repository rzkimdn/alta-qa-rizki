public class Pertambahan extends Calculator{
    int angka1;
    int angka2;

    public Pertambahan(int angka1, int angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    @Override
    public int tambah() {
        int hasil = this.angka1 + this.angka2;
        return hasil;
    }
}
