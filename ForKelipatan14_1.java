import java.util.Scanner;

public class ForKelipatan14_1 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        int kelipatan;
        int total = 0;
        int counter = 0;
        double rataRata = 0.0;

        System.out.print("Masukkan bilanhgan kelipatan (1 - 9) : ");
        kelipatan =  input14.nextInt();

        for (int i = 1; i <= 50; i ++) {
            if (i % kelipatan == 0) {
                total += i;
                counter ++;
            } 
            i ++;
            rataRata = (double)
            total / counter;
            
         }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata dari kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    }

}
