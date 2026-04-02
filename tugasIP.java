
    import java.util.Scanner;
public class tugasIP {
public static void main(String[] args) {
    Scanner scanner  = new Scanner (System.in);

    System.out.println("SISTEM PENENTUAN SKS");
 
    int jumlahMatkul;
    double totalBobot = 0;
    int totalSKS = 0;

    System.out.print("Masukkan nama mahasiswa : "); 
    String nama = scanner.nextLine(); 

    System.out.print("Masukkan jumlah mata kuliah : ");
    jumlahMatkul = scanner.nextInt();

    for (int i = 1; i <= jumlahMatkul; i++) {
    System.out.println("\nMata kuliah ke-" + i);

    System.out.print("Masukkan nilai (A/B/C/D): ");
    char nilai = scanner.next().toUpperCase().charAt(0);

    System.out.print("Masukkan jumlah SKS : ");
    int sks = scanner.nextInt();
    double bobot = 0;

    switch (nilai) {
    case 'A': bobot = 4.0; break;
    case 'B': bobot = 3.0; break;
    case 'C': bobot = 2.0; break;
    case 'D': bobot = 1.0; break;
    default:
    System.out.println("Nilai tidak valid!");
    i--;
    continue; }

    totalBobot += bobot * sks;
    totalSKS += sks; 

    }

    double IP = totalBobot / totalSKS;

    int maksSKS;
    String status;

    if (IP >= 3.50) { 
        maksSKS = 24;
        status = "sangat memuaskan";
    } else if (IP >= 3.00) {
        maksSKS = 22;
        status = "memuaskan";
    } else if (IP >= 2.00) {
        maksSKS = 20;
        status = "cukup";
    } else {
        maksSKS = 18;
        status = "kurang"; 
        }
  
  
    System.out.printf("\nIP Semester : %.2f\n", IP);
    System.out.println("Maksimal SKS yang bisa diambil : " + maksSKS);
    System.out.print("Status IP : " + status); 
  
  
  
    }


} 


