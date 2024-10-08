import java.util.Scanner;

public class DoWhileCuti01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        //input
        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();
        //eksekusi + output
        do { 
            System.out.print("Ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } 
                else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    break;
                }               
            }
        } while (jatahCuti > 0);
    }
}
