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
public class Praktikum2 {
    public static void main(String[] args) {
        int angka = 0;
        int [] data = new int[] {83,76,45,90,85,80,78,74};
        System.out.println("Data pada array : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] +"\t");}
            double rata = 0;
            for (int j = 0; j < data.length; j++)rata+=data[j];
            rata/=data.length;
            System.out.println("\nRata-rata nilai array : " + rata);
               System.out.println("\n");
               System.out.println("Nilai yang diatas rata rata : ");
               for (int k = 0; k < data.length; k++){if (data[k]>rata) {
                    
                System.out.print(data[k]+"\t");}}
               System.out.println("\n");
                       
                
            
                
            }
        }
    

