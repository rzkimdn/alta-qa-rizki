public class hitungOngkir extends Ongkir {
    float panjang;
    float lebar;
    float tinggi;
    float berat;

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getBerat() {
        return berat;
    }

    public void setBerat(float berat) {
        this.berat = berat;
    }

    @Override
    public float hitung() {

        double volume = getPanjang() * getTinggi() * getLebar();
//        double volumeBulat = Math.ceil(volume);

        float harga;
        if (volume <= 50 && getBerat() > 1) {
            harga = 2500 * getBerat();
        } else {
            harga = 5000 * getBerat();
        }
        return harga;
    }
}
