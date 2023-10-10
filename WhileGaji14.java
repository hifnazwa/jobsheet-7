import java.util.Scanner;

public class WhileGaji14 {
    public static void main(String[] args) {
        Scanner scan14 = new Scanner (System.in);
        int jumlahkaryawan, jumlahJamlembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahkaryawan = scan14.nextInt();

        int i = 0;
        while (i < jumlahkaryawan) {
            System.out.println("pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan14.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamlembur = scan14.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
             gajiLembur = jumlahJamlembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamlembur * 75000;
            } 

            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur: " + totalGajiLembur);
        }
    }
}
