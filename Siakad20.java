
import java.util.Scanner;

public class Siakad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] nilai = new int[4][3];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-"+(i+1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Nilai Matkul ke-"+ (j+1)+": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-"+(i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Nilai Matkul ke-"+(j+1)+": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata rata: " + totalPerSiswa/3);
        }
        System.out.println("\n==================================");
        System.out.println("Rata Rata nilai setiap Mata Kuliah :");
        for (int j = 0; j < 3; j++) {
            double totalMatkul = 0;
            for (int i = 0; i < 4; i++) {
                totalMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah "+ (j+1)+": " + totalMatkul/4);
        }
        sc.close();
    }
}