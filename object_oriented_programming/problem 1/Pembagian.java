public class Pembagian extends Calculator{
    int angka1;
    int angka2;

    public int getAngka1() {
        return angka1;
    }

    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }

    public int getAngka2() {
        return angka2;
    }

    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }

    @Override
    public float bagi() {
        float hasil = getAngka1()/getAngka2();
        return hasil;
    }
}
