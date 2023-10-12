import java.util.Scanner;

public class JumlahDeret14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = 0;

        for (int i = 25; i>=1; i++) {
            hasil += 1;
        }
        System.out.println("Hasil penjumlahan deret bilangan 25 sampai dengan 1 adalah: " + hasil);
    }

}
