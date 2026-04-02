//1. import class 
import java.util.Scanner;
public class percobaan {
    public static void main(String[] args) {
        //2. deklarasi scanner
        Scanner sc = new Scanner(System.in); 

        //3. input (deklarasi variabel) 
        //value dlm variabel harus diberikan nilai default/awal
        String namaBarang = ""; 
        int harga = 0, jumlahBeli = 0, total=0;
        //string pake petik 2, int make 0

        //teks input
        System.out.println("Nama barang");
        namaBarang = sc.nextLine(); //nextLine utk string
        System.out.println("Harga : ");
        harga = sc.nextInt();
        System.out.println("Jumlah Beli : ");
        jumlahBeli = sc.nextInt();
        
        System.out.println();

        //4. output 
        total = harga * jumlahBeli;
        System.out.println("Total : " + total);


        //5. close scanner 
        sc.close(); 
    }
}
