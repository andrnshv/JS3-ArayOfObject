import java.util.Scanner;

public class MataKuliahDemo06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MataKuliah06[] arrayOfMataKuliah06 = new MataKuliah06[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------");

            arrayOfMataKuliah06[i] = new MataKuliah06(kode, nama, sks, jumlahJam);
        }
    }
}
