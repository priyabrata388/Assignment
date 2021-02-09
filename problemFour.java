package main.java.dayone;
//Write a program to check if the given number is Armstrong number or not.


public class problemFour {
    public static void main(String[] args) {
        int c=0,a,temp;
        int n=158;
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}

