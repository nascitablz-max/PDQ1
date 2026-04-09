import java.util.Scanner;
public class looping2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1, jumlahBarang;
        double harga, totalPerBarang, totalBelanja = 0;
        int jumlahBeli;
        String namaBarang;
        char lanjut; 

        System.out.print("Masukkan jumlah barang: ");
        jumlahBarang = input.nextInt();
        input.nextLine();

        if (jumlahBarang <= 0) {
            System.out.println("Jumlah barang harus lebih dari 0!");
            return;
        }

        do {
            System.out.println("\nBarang ke-" + i);

            System.out.print("Nama barang: ");
            namaBarang = input.nextLine();

            System.out.print("Harga: ");
            harga = input.nextDouble();

            System.out.print("Jumlah beli: ");
            jumlahBeli = input.nextInt();
            input.nextLine(); // penting!

            totalPerBarang = harga * jumlahBeli;
            totalBelanja += totalPerBarang;

            System.out.println("Total " + namaBarang + " = " + totalPerBarang);

            i++;

        } while (i <= jumlahBarang);

        System.out.println("\nTotal Belanja = " + totalBelanja);
    }
}
