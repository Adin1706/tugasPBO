package com.taskjava;
import java.util.ArrayList;

public class Soal2 {

    public static void main(String[] args) {
        String[] arr={"1","2","3","123124235","43641235436236","2634645856295803463","138246093486289507235",
                "32894702358729356237598275","928309127482365834759870",
                "10927389015678329650198364076302576","109749283652093786523","5","1","7","4",
                "2390975189365823765","2839572803652780356","9840912370928365726","0983407629365028765",
                "23870592863508726","38267502983640187365","8974309857239857235","238970918635280375235",
                "283657235689236502365","325896209867203765023523","2385720698270498732535",
                "2835720938572093857209835726","235872098375209385723985235"};

        int[] arr1 = new int[arr.length];
        ArrayList<Integer> numb=new ArrayList<>();

        for (int i=0;i<arr.length;i++) {
            arr1[i] = Integer.parseInt(arr[i].substring(arr[i].length() - 1));
            }
            for (int j=0;j<arr.length;j++) {
                if (arr1[j] % 2 != 0) {
                    numb.add(arr1[j]);
                    System.out.println(arr[j] + " adalah bilangan ganjil");
                }
                if (arr1[j] % 2 == 0) {
                    numb.add(arr1[j]);
                    System.out.println(arr[j] + " adalah bilangan genap");
                }
            }
    }
}
