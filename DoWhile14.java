import java.util.Scanner;

public class DoWhile14 {
     public static void main(String[] args) {
        Scanner sc14 = new Scanner (System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti : ");
        jatahCuti= sc14.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc14.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("jumlah hari : ");
                jumlahHari= sc14.nextInt();

                if(jumlahHari <= jatahCuti) {
                    jatahCuti-= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah anda tidak mencukupi");
                    break;
                }
            }
        } while (jatahCuti>0);
    }

}
