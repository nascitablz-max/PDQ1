import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka (minimal 5): ");
        int n = scanner.nextInt();

        if (n < 5) {
        System.out.println("Jumlah data harus minimal 5!");
        return;
        }


        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        System.out.print("Angka yang dimasukkan: ");
        for (int j = 0; j < angka.length; j++) {
            System.out.print(angka[j] + " ");
        }
        System.out.println();

        int max = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }
        System.out.println("Nilai tertinggi: " + max);

        int indeks = 0;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == max) {
                indeks = i;
                break;
            }
        }
        System.out.println("Indeks nilai tertinggi: " + indeks);
    }
}