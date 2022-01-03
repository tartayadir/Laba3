package ua.kr.borovyk.yaroslav;

import javax.swing.*;
import java.lang.reflect.Array;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class FirstStep {
///*
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество элементов : ");
        int kolElement = in.nextInt();
        System.out.print("Введите элементы : ");
        int[] arr = new int[kolElement];

        arr[0] = in.nextInt();
        arr[1] = in.nextInt();
        String[] arrOfNumber = new String[kolElement];
        String sMax = Integer.toString(arr[0]);
        String sMin = Integer.toString(arr[1]);
        arrOfNumber[0] = sMax;
        arrOfNumber[1] = sMin;
        int [][] arrOfRazryadi = new int[kolElement][10];
        int minKolOfFigure =0;
        int minKolOfFigureII =0;

        for (int i = 0; i < kolElement; i++) {

            arrOfRazryadi[i][Math.abs(arr[i]/1000000000)]++;
            arrOfRazryadi[i][Math.abs(arr[i]%1000000000/100000000)]++;
            arrOfRazryadi[i][Math.abs(arr[i]%1000000000%100000000/10000000)]++ ;
            arrOfRazryadi[i][Math.abs(arr[i]%1000000000%100000000%10000000/1000000)]++;
            arrOfRazryadi[i][Math.abs(arr[i]%1000000000%100000000%10000000%1000000/100000)]++;
            arrOfRazryadi[i][Math.abs(arr[i]%1000000000%100000000%10000000%1000000%100000/10000)]++;
            arrOfRazryadi[i][Math.abs(arr[i]%1000000000%100000000%10000000%1000000%100000%10000/1000)]++;
            arrOfRazryadi[i][Math.abs(arr[i]%1000000000%100000000%10000000%1000000%100000%10000%1000/100)]++;
            arrOfRazryadi[i][Math.abs(arr[i]%1000000000%100000000%10000000%1000000%100000%10000%1000%100/10)]++;
            arrOfRazryadi[i][Math.abs(arr[i]%1000000000%100000000%10000000%1000000%100000%10000%1000%100%10/1)]++;
            int k=0;
            for (int j=0;j<10;j++){

                if (arrOfRazryadi[i][j]!=0)
                    k++;
            }

            if (minKolOfFigure>k || k==0){
                minKolOfFigureII = i;
                k=minKolOfFigure;
            }
            if (i >= 2) {
                arr[i] = in.nextInt();
                arrOfNumber[i] = Integer.toString(arr[i]);
            }
            if (arrOfNumber[i].length() > sMax.length()) {

                sMax = arrOfNumber[i];
            }
            if (arrOfNumber[i].length() < sMin.length()) {

                sMin = arrOfNumber[i];
            }
        }

        int midlValue=(sMax.length()+sMin.length())/2;

        System.out.println("Самое длиное число : " + sMax);
        System.out.println("Его длинна : " + sMax.length());

        System.out.println("Самое короткое число : " + sMin);
        System.out.println("Его длинна : " + sMin.length());

        FirstStep.sorterovka(arr, 0, kolElement - 1);
        System.out.println(Arrays.toString(arr));

        System.out.print("Элементы размер которых меньше среднего : ");
        for (int i=0;i<kolElement;i++){

            if (arrOfNumber[i].length()<midlValue){
                System.out.print(arrOfNumber[i] + " ");
            }
        }
        System.out.println("");

        System.out.println("Число с минимальным количеством цифр : " + arr[minKolOfFigureII]);

    }

    public static void sorterovka(int[] arr, int begin, int end) {

        int p = arr[(end + begin) / 2];
        int i = begin, j = end;

            while (i <= j) {

                while (arr[i] < p)
                    i++;
                while (arr[j] > p)
                    j--;
                if (i<=j) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
            if (j>begin)
                FirstStep.sorterovka(arr, begin, j);
            if (i<end)
                FirstStep.sorterovka(arr,i,end);
    }
}
//}