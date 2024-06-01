import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ongkir kir = new Ongkir();
        hitungOngkir hitung = new hitungOngkir();

        System.out.println("Masukan Panjang: ");
        float p = scan.nextFloat();
        System.out.println("Masukan Lebar: ");
        float l = scan.nextFloat();
        System.out.println("Masukan Tinggi: ");
        float t = scan.nextFloat();
        System.out.println("Masukan Berat: ");
        float b = scan.nextFloat();


        hitung.setPanjang(p);
        hitung.setTinggi(t);
        hitung.setLebar(l);
        hitung.setBerat(b);

        System.out.println("Harga Ongkirnya adalah = " + hitung.hitung());


    }
}