//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Calculator call = new Calculator();
//    call.tambah();
//    call.kurang();
//    call.kali();
//    call.bagi();

    Pertambahan pertambahan = new Pertambahan(10,20);
        System.out.println("Hasil Pertambahan adalah " + pertambahan.tambah());
    Pengurangan pengurangan = new Pengurangan(20,10);
        System.out.println("Hasil Pengurangan adalah " + pengurangan.kurang());
    Perkalian perkalian = new Perkalian();
    perkalian.setAngka1(10);
    perkalian.setAngka2(5);
        System.out.println("Hasil Perkalian adalah " + perkalian.kali());
    Pembagian pembagian = new Pembagian();
    pembagian.setAngka1(10);
    pembagian.setAngka2(2);
        System.out.println("Hasil Pembagian adalah " + pembagian.bagi());
    }
}