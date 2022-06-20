package com.logicalseries;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String args[]){
        int reverse=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scanner.nextInt();
        while(num!=0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println("reverse number is :"+reverse);
    }
}
