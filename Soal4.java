package com.taskjava;

import java.util.Arrays;
import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //jumlah naga
        System.out.print("Input the Dragon : ");
        int jml1 = input.nextInt();
        System.out.println("========================");
        int[] dragon = new int[jml1];
        for (int i = 0;i<dragon.length;i++) {
            System.out.print("Input the " + (i + 1) + " Dragon : ");
            dragon[i] = input.nextInt();
        }

        System.out.print("\nInput your Knight : ");
        int jml = input.nextInt();
        System.out.println("========================");
        //jumlah ksatria
        int[] knight = new int[jml];
        for (int i = 0;i<knight.length;i++){
            System.out.print("Input your "+(i+1)+" Knight : ");
            knight[i]=input.nextInt();
        }

        Arrays.sort(knight);
        Arrays.sort(dragon);

        int indexDragon = 0;
        int height = 0;
        for (int j : knight){
            if (indexDragon < dragon.length){
                if (j >= dragon[indexDragon]){
                    height += j;
                    indexDragon++;
                }
            }
        }
        if (indexDragon == dragon.length){
            System.out.println("\nMinimum Height : " + height);
        } else {
            System.out.println("\nKnight Fall");
        }
    }

}