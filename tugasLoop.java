import java.util.Scanner;
public class tugasLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double harga, totalPerBarang, totalBelanja = 0;
        int jumlahBeli, jumlahItem;
        String namaBarang;

        System.out.println("Masukkan jumlah item:");
        jumlahItem = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= jumlahItem; i++) {
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

            switch (i) {
                case 1:
                    System.out.println("Nama barang pertama adalah: " + namaBarang);
                    break;
                case 2:
                    System.out.println("Nama barang kedua adalah: " + namaBarang);
                    break;
                case 3:
                    System.out.println("Nama barang ketiga adalah: " + namaBarang) ;
                default:
                    System.out.println("Anda masukkan barang ke-" + i);
            }
        }

        System.out.println("\nTotal Belanja = " + totalBelanja);


        
    }
}
