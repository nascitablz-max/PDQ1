import java.util.Scanner;
public class looping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahBarang;
        double harga, totalPerBarang, totalBelanja = 0;
        int jumlahBeli;
        String namaBarang;

        System.out.print("Masukkan jumlah barang: ");
        jumlahBarang = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= jumlahBarang; i++) {
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
        }

        System.out.println("\nTotal Belanja = " + totalBelanja);

    }
}
