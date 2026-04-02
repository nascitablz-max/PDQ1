import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEM AKADEMIK PENENTUAN BEBAN SKS");
        
        // Input Data
        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan IP Semester (IPS): ");
        double ip = scanner.nextDouble();

        int maksSks;

        //logika percabangan berdasarkan tabel
        if (ip >= 3.50) {
            maksSks = 24;
        } else if (ip >= 3.00) {
            maksSks = 22;
        } else if (ip >= 2.00) {
            maksSks = 20;
        } else {
            maksSks = 18;
        }

        //output hasil
        System.out.println("\nHASIL");
        System.out.println("Nama Mahasiswa     : " + nama);
        System.out.println("IP Semester Anda   : " + ip);
        System.out.println("Beban SKS Maksimal : " + maksSks + " SKS");
        
        if (ip >= 3.00) {
            System.out.println("Keterangan         : Pertahankan prestasimu!");
        } else {
            System.out.println("Keterangan         : Tingkatkan lagi belajar kamu.");
        }
        System.out.println("----------------------");
    }
}
    
