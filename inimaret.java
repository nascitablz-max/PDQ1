import java.util.Scanner; 

public class inimaret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEM KASIR INIMARET ===");
        
        // Input Data Pelanggan
        System.out.print("Masukkan Nama Pelanggan: ");
        String nama = scanner.nextLine();
        
        System.out.print("Apakah pelanggan Member? (y/n): ");
        String memberStatus = scanner.nextLine();
        
        System.out.print("Masukkan Total Belanja: Rp");
        double belanja = scanner.nextDouble();

        double persenDiskonBelanja = 0;
        double persenDiskonMember = 0;

        // Logika Percabangan Diskon Belanja
        if (belanja > 300000) {
            persenDiskonBelanja = 0.10; // 10%
        } else if (belanja > 100000) {
            persenDiskonBelanja = 0.05; // 5%
        }

        // Logika Percabangan Diskon Member
        if (memberStatus.equalsIgnoreCase("y")) {
            persenDiskonMember = 0.02; // 2%
        }

        // Penghitungan
        double potonganBelanja = belanja * persenDiskonBelanja;
        double potonganMember = belanja * persenDiskonMember;
        double totalPotongan = potonganBelanja + potonganMember;
        double totalBayar = belanja - totalPotongan;

        // Output Struk Sederhana
        System.out.println("\n--- STRUK PEMBAYARAN ---");
        System.out.println("Nama Pelanggan  : " + nama);
        System.out.println("Total Belanja   : Rp" + belanja);
        System.out.println("Diskon Belanja  : Rp" + potonganBelanja + " (" + (persenDiskonBelanja * 100) + "%)");
        System.out.println("Diskon Member   : Rp" + potonganMember + " (" + (persenDiskonMember * 100) + "%)");
        System.out.println("Total Potongan  : Rp" + totalPotongan);
        System.out.println("TOTAL BAYAR     : Rp" + totalBayar);
        System.out.println("-------------------------");
    }
}
    
