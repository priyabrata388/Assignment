package main.java.dayone;

//Write a program to find all pairs of elements in an array whose sum is equal to a specified number.


public class problemTwo {
    public static void pairs_value (int inputArray[],int inputNumber) {
        System.out.println("pairs of element and their sum");

        for (int i = 0; i<inputArray.length;i++)
        {
            for (int j = i+1; j<inputArray.length;j++)
            {
                if(inputArray[i] + inputArray[j]==inputNumber)
                {
                    System.out.println(inputArray[i]+ "+ " +inputArray[j]+ " =="+inputNumber);
                }
            }
        }
    }
    public static void main(String args[])
    {
        pairs_value(new int[]{3,6,4,-5,11,5,20},9);
        pairs_value(new int[]{14,-15,9,16,25,45,12,8},30);
    }

}
