package main.java.dayone;


/*
   Write a program to find the second smallest element in an array.


 */
public class ProblemOne {
    public static int getSecondSmallest(int[]a,int total) {
        int temp;
        for (int i = 0; i<total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i]=a[j];
                    a[j] = temp;

                }
            }
        }
        return a[1];
    }

    public static void main(String[] args) {
        int a[] = {20, 4, 16, 8, 17, 12};
        int b[] = {44,66,99,33,44,22,99,55};
        System.out.println("second Smallest " +getSecondSmallest(a,6));
        System.out.println("second Smallest " +getSecondSmallest(b,7));
    }
}