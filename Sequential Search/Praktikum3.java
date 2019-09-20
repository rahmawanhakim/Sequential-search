/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author ASUS
 */
public class Praktikum3 {

    public static void main(String[] args) {
        int angka = 0;
        int[] data = new int[]{92, 98, 76, 72, 84, 101, 39};
        System.out.print("nilai pada array : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

        System.out.println("\n");
        System.out.print("Nilai kelipatan 3 : ");
        System.out.println("\n");
        for (int a = 0; a < data.length; a++)
        {if (data[a] % 3 == 0) {

                System.out.println("==>"+data[a] + " ");
            }
               
        }
    }
}
