/*
 * TEMPLATE Main.java
 * Students must replace this file with their exported Java code from Flowgorithm.
 * For testing, you can implement a simple echo or example solution.
 */


import java.util.*;
import java.lang.Math;

public class soal1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, jumlahRatingTinggi, max, min;
        double total, rataRata;

        n = Integer.parseInt(input.nextLine());
        int[] rating = new int[n];

        total = 0;
        jumlahRatingTinggi = 0;
        for (i = 0; i <= n - 1; i++) {
            rating[i] = Integer.parseInt(input.nextLine());
            if (rating[i] > 0 && rating[i] < 6) {
                max = rating[0];
                min = rating[0];
            } else {
                System.out.println("INVALID");
            }
        }
        System.out.print("Daftar rating: ");
        for (i = 0; i <= n - 1; i++) {
            System.out.print(Integer.toString(rating[i]) + " ");
            total = total + rating[i];
            if (rating[i] > max) {
                max = rating[i];
            }
            if (rating[i] < min) {
                min = rating[i];
            }
            if (rating[i] >= 4) {
                jumlahRatingTinggi = jumlahRatingTinggi + 1;
            }
        }
        System.out.println("");
        rataRata = total / n;
        System.out.println("Rata-rata: " + toFixed(rataRata,2));
        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah: " + min);
        System.out.println("Reviewer rating ≥ 4: " + jumlahRatingTinggi + " orang");
        System.out.println(output(rataRata));
    }
    
    public static String output(double rataRata) {
        String yh;

        if (rataRata >= 4) {
            yh = "Kondisi sangat baik!";
        } else {
            if (rataRata >= 3) {
                yh = "Kondisi cukup, masih perlu peningkatan.";
            } else {
                yh = "Kondisi kurang, perlu evaluasi mendalam.";
            }
        }
        
        return yh;
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
