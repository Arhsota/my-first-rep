/**
 * Andrey, author 9/10/2016 homework for lesson2, Java 1
 */
import java.util.*;
public class Lesson2 {
    public static void main(String[] args) {
        //**********************************
        // int[] arr = {1,0,1,0,1,1,1,1};     the same as given below
        int[] arr1 = new int[8];              //homework, point 1
        arr1[0] = 1;
        arr1[1] = 0;
        arr1[2] = 1;
        arr1[3] = 0;
        arr1[4] = 1;
        arr1[5] = 1;
        arr1[6] = 1;
        arr1[7] = 1;
        System.out.print("Original array: ");
        for (int i = 0; i <= 7; i++) {
            System.out.print(arr1[i]);
        }
        //*********************************
        System.out.print(" Invert array: ");
        for (int j = 0; j <= 7; j++) {           //homework, point 2
            if (arr1[j] == 0) {
                arr1[j] = 1;
            } else {
                arr1[j] = 0;
            }
            System.out.print(arr1[j]);
        }
        //*****************************************
        System.out.print(" Homework, point 3:  ");  // homework, point 3
        int valArr2 = 1;
        int[] arr2 = new int[8];
        for (int k = 0; k <= 7; k++) {
            arr2[k] = valArr2;
            valArr2 = valArr2 + 3;
            System.out.print(arr2[k]);
        }
        //******************************************// homework, point 4
        int[] mas = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.print(" Homework, point 4:  ");
        for (int n = 0; n < mas.length; n++) {
            if (mas[n] < 6) {
                mas[n] = mas[n] * 2;
            }
            System.out.print(mas[n]);
        }
        //******************************************// homework, point 5
        int[] minmax = {1,5,3,2,11,4,5,2,4,8,9,1};
        int maxIndex = 0;
        for (int l = 0; l < minmax.length; l++) {
            if (minmax[maxIndex] < minmax[l]) {
                maxIndex = l;
            }
        }
        System.out.println();
        System.out.print("Homework, point 5: Max element in array is:  ");
        System.out.println (minmax[maxIndex]);

        //********************************************** homework, point 6. Console calculator
        int MyResult;
        char[] buf = new char [4];
        Scanner sc = new Scanner(System.in);
        System.out.println ("Please, Enter your string: ");
        String myStr = sc.nextLine();
        myStr.getChars (0,3,buf,0);
    //    myStr = String.format ("%d",myStr);
        switch (buf[1]) {
            case  '+': {
                MyResult = (int) (buf[0] - 48) + (int) (buf[2] - 48);
                System.out.println(MyResult);
                break;
            }
            case  '-': {
                MyResult = (int) (buf[0] - 48) - (int) (buf[2] - 48);
                System.out.println(MyResult);
                break;
            }
            case  '*': {
                MyResult = (int) (buf[0] - 48) * (int) (buf[2] - 48);
                System.out.println(MyResult);
                break;
            }
        }
    }
}
