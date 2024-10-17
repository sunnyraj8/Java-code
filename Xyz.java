import java.util.Scanner;
public class Xyz{
     public static void main(String args[]){
           System.out.println("Choose your option\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
     Scanner sc= new Scanner(System.in);
     int num=sc.nextInt();
     switch (num){
           case 1:
                 System.out.println("Enter two numbers");
                 int x=sc.nextInt();
                 int y=sc.nextInt();
                 int sum;
                 sum=x+y;
                 System.out.println(sum);
                 break;
           case 2:
                 System.out.println("Enter two numbers");
                 int a=sc.nextInt();
                 int b=sc.nextInt();
                 int sub;
                 sub=a-b;
                 System.out.println(sub);
                 break;
           case 3:
                 System.out.println("Enter two numbers");
                 int c=sc.nextInt();
                 int d=sc.nextInt();
                 int multi;
                 multi=c*d;
                 System.out.println(multi);
                 break;
           case 4:
                 System.out.println("Enter two numbers");
                 int e=sc.nextInt();
                 int f=sc.nextInt();
                 int Div;
                 Div=e/f;
                 System.out.println(Div);
                 break;
           }
      }
}