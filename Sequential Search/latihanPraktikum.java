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
public class latihanPraktikum {

  
    public static void main(String[] args) {
    
    Scanner ahh = new Scanner (System.in);    
        String cari;
        boolean found = false;
        String[] data = new String[]{"A", "B", "C" , "D", "E"};
        System.out.print("Masuukan huruf yang ingin dicari = ");
        cari = ahh.nextLine();
        for (int i = 0; i < data.length; i++) {
     if (cari.equalsIgnoreCase((data[i])) ){
                found = true;
                break;
            }
            
        }
        if (found == true){
            System.out.println("Data ditemukan");
    }else{
            System.out.println("Data gak ditemukan");
    }
}
}