import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan jumlah nilai = ");
        int nilai = scan.nextInt();
        
        int sum = 0;
        for (int i = 0; i <=nilai; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int number = scan.nextInt();
            sum += number;
        }
    }
    private static void mean(int nilai, int sum){
        double mean = (double) sum/nilai;
        System.out.println("Mean: " + mean);
    }
}