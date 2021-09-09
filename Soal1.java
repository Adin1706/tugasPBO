package com.taskjava;
import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka : ");
        int numb = input.nextInt();
        int numb2;

        if (numb < 2){
            System.out.println(numb + " bukan bilangan prima");
        }else{
            numb2 = 2;
            while (numb%numb2 != 0) {
                numb2++;
            }
                if (numb2 == numb){
                    System.out.println(numb + " adalah bilangan prima");

                }else{
                    System.out.println(numb + " bukan bilangan prima");
                    System.out.println(numb2 + " dikali " + numb/numb2 + " = " + numb);
                }
        }
    }
}
