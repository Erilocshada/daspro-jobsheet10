import java.util.Scanner;

public class Percobaan4Pertanyaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai untuk mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai Matkul ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n==================================");
        for (int i = 0; i < jumlahSiswa; i++) {
            double totalPerSiswa = 0;
            System.out.println("Nilai untuk mahasiswa ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.println("Nilai Matkul ke-" + (j + 1) + ": " + nilai[i][j]);
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + (totalPerSiswa / jumlahMatkul));
        }

        System.out.println("\n==================================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalMatkul = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                totalMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + (totalMatkul / jumlahSiswa));
        }
        sc.close();
    }
}