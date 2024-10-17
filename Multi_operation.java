//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24

import java.util.Scanner;

class Multi_operation
{
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner abc= new Scanner(System.in);
        int num1=abc.nextInt();
        int num2=abc.nextInt();
        System.out.println("Addition="+(num1+num2));
        System.out.println("Subtraction="+(num1-num2));
        System.out.println("Multiplication="+(num1*num2));
        System.out.println("Division="+(num1/num2));
        System.out.println("remainder="+(num1%num2));
    }
}