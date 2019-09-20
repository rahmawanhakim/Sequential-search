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
public class Praktikum4 {
     public static void main(String[] args) {
        Scanner bocill = new Scanner (System.in);
        System.out.println("masukkan kata : ");
        String nama = bocill.nextLine();
        int a=0;
        int i=0;
        int u=0;
        int e=0;
        int o=0;
        for (int x=0;x<nama.length();x++){
            switch (nama.charAt(x)) {
                case 'a':
                    a++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'u':
                    u++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'o':
                    o++;
                    break;
                default:
                    break;
            }
}
        
       System.out.println("huruf a ada : "+a);
       System.out.println("huruf i ada : "+i);
       System.out.println("huruf u ada : "+u);
       System.out.println("huruf e ada : "+e);
       System.out.println("huruf o ada : "+o);
       int total = a+i+u+e+o;
       System.out.println("total huruf vokal ada : "+total);
    }
}
