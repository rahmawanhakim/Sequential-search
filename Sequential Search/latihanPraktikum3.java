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
public class latihanPraktikum3 {
    public static void main(String[] args) {
      int max = 0;
      int[] data = new int [] {1,2,3,4,5,6};
        System.out.println("Data pada array");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] +"\t");
        if (data[i] > max){
            max = data[i];
        }
            
        }
        System.out.print("\n Bilangan terkecil adalah = "+max);
    }
}
