public class Pengurangan extends Calculator{
    int angka1;
    int angka2;

    public Pengurangan(int angka1, int angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    @Override
    public int kurang() {
        int hasil = this.angka1 - this.angka2;
        return hasil;
    }
}
