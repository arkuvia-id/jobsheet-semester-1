import java.util.Scanner;

public class Tugas2Jobsheet3Absen01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        double jmlJamKerja, UpahJam, bonus = 0.1, pajak = 0.05;
        //input
        System.out.print("Masukkan jumlah jam kerja: ");
        jmlJamKerja = sc.nextInt();
        System.out.print("Masukkan upah per jam: ");
        UpahJam = sc.nextInt();
        //eksekusi
        double gajiBulanan = jmlJamKerja*UpahJam;
        double totalBonus = gajiBulanan*bonus;
        gajiBulanan += totalBonus;
        double totalPajak = gajiBulanan*pajak;
        gajiBulanan -= totalPajak;
        //output
        System.out.print("Total gaji karyawan setelah mendapatkan bonus dan dikurangi pajak: "+gajiBulanan);
    }
}
