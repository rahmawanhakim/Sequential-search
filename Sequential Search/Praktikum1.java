package array;

import java.util.Scanner;

public class Praktikum1 {

    public static void main(String[] args) {
        Scanner ahh = new Scanner(System.in);
        int golek;
        int angka = 0;

        int data[] = new int[]{74, 98, 72, 74, 72, 90, 81, 72};
        System.out.println("Data Pada Array : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println("\n");
        System.out.println("Masukkann nilai yang akan dicari : ");
        golek = ahh.nextInt();
        for (int i = 0; i < data.length; i++) {
            if (golek == data[i]) {
                angka++;
            }

        }
        if (angka == 0) {
            System.out.println("Data tidak ditemukan");
        } else {
            System.out.println("data ditemukan sebanyak " + angka + " kali");
        }
    }
}
