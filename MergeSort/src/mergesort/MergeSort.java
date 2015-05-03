/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sinarik
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diziElamanSayisi;
        int dizi[];
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Kaç elemanlı dizi istiyorsunuz?");
        diziElamanSayisi = scan.nextInt();

        dizi = new int[diziElamanSayisi];
        System.out.println("Diziniz:");

        for (int i = 0; i < diziElamanSayisi; i++) {
            dizi[i] = rnd.nextInt(100);
            System.out.print(dizi[i] + " ");
        }
        
        Merge nesne = new Merge();
        nesne.sort(dizi);
        System.out.println("\nSıralı Diziniz:");
        for(int i:dizi){
            System.out.print(i);
            System.out.print(" ");
        }

    }

}
