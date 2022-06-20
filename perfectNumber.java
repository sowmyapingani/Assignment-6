package com.logicalseries;
import java.util.Scanner;
public class perfectNumber {public static void main(String args[])
{
    long n, Sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
    n=sc.nextLong();
    int i=1;
    while(i <= n/2)
    {
        if(n % i == 0)
            Sum = Sum + i;
        i++;
    }
    if(Sum==n)
    {
        System.out.println(n+" is a perfect number.");
    }
    else
        System.out.println(n+" is not a perfect number.");
}
}



