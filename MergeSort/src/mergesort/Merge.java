/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author Sinarik
 */
public class Merge {

    private int[] dizi;
    private int uzunluk;
    private int[] tempDizi;

    public void sort(int inputArr[]) {
        this.dizi = inputArr;
        this.uzunluk = inputArr.length;
        this.tempDizi = new int[uzunluk];
        doMergeSort(0, uzunluk - 1);
    }

    public void doMergeSort(int baslangic, int bitis) {

        if (baslangic < bitis) {
            int orta = baslangic + (bitis - baslangic) / 2;
            //Dizinin sol tarafı için işlem
            doMergeSort(baslangic, orta);
            // Dizinin sağ tarafı için işlem
            doMergeSort(orta + 1, bitis);
            // her iki tarafı birleştirme
            ParcalariBirlestir(baslangic, orta, bitis);
        }

    }

    public void ParcalariBirlestir(int baslangic, int orta, int bitis) {

        for (int i = baslangic; i <= bitis; i++) {
            tempDizi[i] = dizi[i];
        }
        int i = baslangic;
        int j = orta + 1;
        int k = baslangic;
        while (i <= orta && j <= bitis) {

            if (tempDizi[i] <= tempDizi[j]) {
                dizi[k] = tempDizi[i];
                i++;
            } else {
                dizi[k] = tempDizi[j];
                j++;
            }
            k++;
        }

        while (i <= orta) {
            dizi[k] = tempDizi[i];
            k++;
            i++;
        }

    }
}
