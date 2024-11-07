
import java.util.Scanner;

public class BioskopWIthScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        while (true) { 
            System.out.println("Masukkan Nama :");
            String nama = sc.nextLine();
            System.out.println("Masukkan baris :");
            int baris = sc.nextInt();
            System.out.println("Masukkan Kolom :");
            int kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.println("Input penonton lainnya? (y/n): ");
            String next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        sc.close();
    }
}
