package com.taskjava;
import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numb = {2,8,12,22,25,34,46};
        System.out.print("masukkan data : ");
        int key = input.nextInt();
        int index = numb.length/2;
        boolean find = false;

        if (key == numb[index]) {
            System.out.println("Data ditemukan pada index ke- " + index);
            find = true;
        }else{
            if (key<numb[index]){
                for (int i = index-1;i>=0;i--){
                    if (key == numb[i]){
                        System.out.println("Data ditemukan pada index ke- "+i);
                        find = true;
                        break;
                    }
                }
            }else{
                for (int i = index+1;i< numb.length;i++){
                    if (key == numb[i]){
                        System.out.println("Data ditemukan pada index ke- "+i);
                        find = true;
                        break;
                    }
                }
            }
        }
        if (!find){
            System.out.println("Data tidak ditemukan");
        }
    }
}