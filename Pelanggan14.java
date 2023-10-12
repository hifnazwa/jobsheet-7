import java.util.Scanner;

public class Pelanggan14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nama;
        char jawab;
        int jml = 0;
        do{
            System.out.print("Masukkan Nama Pelanggan: ");
            nama = sc.nextLine();
            jml ++;
            System.out.print("Apakah Anda Ingin Memasukkan Nama Pelanggan Baru( Y/T)?");
            jawab = sc.nextLine(). charAt(0);
        } while (jawab == 'y'|| jawab == 'Y');
        System.out.println("Jumlah Pelanggan Yang Anda Masukkan = " + jml);

}
}
