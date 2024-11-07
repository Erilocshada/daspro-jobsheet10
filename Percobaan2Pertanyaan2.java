import java.util.Scanner;

public class Percobaan2Pertanyaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];
        
        while (true) {
            System.out.println("Masukkan nama:");
            nama = sc.nextLine();
            while (true) {
                System.out.println("Masukkan baris:");
                baris = sc.nextInt();
                System.out.println("Masukkan kolom:");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                        break;
                    } else {
                        System.out.println("Kursi pada baris " + baris + ", kolom " + kolom + " sudah terisi oleh penonton lain.");
                        System.out.println("Silakan pilih baris dan kolom yang lain.");
                    }
                } else {
                    System.out.println("Nomor baris atau kolom tidak tersedia. Silakan masukkan kembali.");
                }
            }

            System.out.println("Input Penonton Lainnya (y/n):");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        for (int i = 0; i < penonton.length; i++) {
            System.out.print("Daftar Penonton ke-" + (i + 1) + ": ");
            
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] == null) {
                    System.out.print("***");
                } else {
                    System.out.print(penonton[i][j]);
                }
                if (j < penonton[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}