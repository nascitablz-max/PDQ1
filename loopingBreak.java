import java.util.Scanner;
public class loopingBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double harga, totalPerBarang, totalBelanja = 0;
        int jumlahBeli;
        String namaBarang;
        char lanjut;

        for (int i = 1; i <= 5; i++) {
        System.out.println("\nBarang ke-" + i);

        System.out.print("Nama barang: ");
        namaBarang = scanner.nextLine();

        System.out.print("Harga: ");
        harga = scanner.nextDouble();

        System.out.print("Jumlah beli: ");
        jumlahBeli = scanner.nextInt();
        scanner.nextLine();

        totalPerBarang = harga * jumlahBeli;
        totalBelanja += totalPerBarang;

        System.out.println("Total " + namaBarang + " = " + totalPerBarang);

        System.out.print("Mau tambah barang lagi? (y/t): ");
            lanjut = scanner.next().charAt(0);
            scanner.nextLine();


        if (lanjut == 't' || lanjut == 'T') {
        break; // keluar dari loop sebelum 5

        }
         }
          System.out.println("\nTotal Belanja = " + totalBelanja);
        

            
        }}



