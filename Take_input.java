//Write a Java program that takes two numbers as input and displays the product of two numbers.
//Test Data:
//Input first number: 25
//Input second number: 5
import java.util.Scanner;
class Take_input
{
    public static void main(String[] args) 
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1=a.nextInt();
        int num2=a.nextInt();
        
        System.out.println(num1*num2);
    }
}