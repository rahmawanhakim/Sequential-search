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
public class latihanPraktikum4 {
    public static void main(String[] args) {
        Scanner ahh = new Scanner(System.in);
        String cari;
        System.out.print("masukkan sebuah kata = ");
        cari = ahh.nextLine();
        int a= 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i)== 'a'){
                a++;
            }
            
        }
        System.out.println("Jumlah huruf a pada kalimat di atas adalah " +a);
    }
}
