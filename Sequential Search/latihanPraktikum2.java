/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class latihanPraktikum2 {

   

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cari;
        boolean found = false;
        int[] data = new int[]{8,9,1,2,3,5,6,7,4};

        System.out.print("Masukkan angka yang akan anda cari =");
        cari = scan.nextInt();
        for (int i = 0; i < data.length; i++) {
            if (cari==data[1]){
                found= true;
                System.out.println("Data ditemukan pada indeks ke-" +i);
        }   
        }
        if (found != true){
            System.out.println("Data is ganok");
        }
    }
}
