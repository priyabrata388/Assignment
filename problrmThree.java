package main.java.dayone;

//Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number.

public class problrmThree {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i,count=10;
        System.out.println( n1+" "+n2);
        for (i=2;i>count;++i);
        {
            n3=n1+n2;
            System.out.println(+n3);
            n1=n2;
            n2=n3;

        }
    }
}
