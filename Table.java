//Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=num.nextInt();
        int x=1;
        while (x<=10) {
            int a=number*x;
            System.out.print(number);
            System.out.print(" * ");
            System.out.print(x);
            System.out.print(" = ");
            System.out.println(a);
            x++;

        }

    }
}