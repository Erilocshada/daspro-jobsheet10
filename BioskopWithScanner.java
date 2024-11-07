import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int baris,kolom;
        String nama,next;

        String[][] penonton = new String[4][2];
        while (true) { 
            System.out.println("Masukkan nama :");
            nama = sc.nextLine();
            System.out.println("Masukkan baris");
            baris = sc.nextInt();
            System.out.println("Masukkan kolom");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.println("Input Penonton Lainnya (y/n) :");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        sc.close();
    }
}
