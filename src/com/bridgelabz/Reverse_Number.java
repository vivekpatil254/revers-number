package com.bridgelabz;
import java.util.Scanner;
public class Reverse_Number {

    public static void main(String[] args) {
	int number,reverse=0,remainder;
    Scanner scanner=new Scanner(System.in);
            System.out.println("Enter integer number : ");
            number=scanner.nextInt();
            while(number!=0)
            {
                remainder=number%10;
                reverse=reverse*10+remainder;
                number=number/10;
            }
            System.out.println("The reverse number is : "+reverse);
    }
}
