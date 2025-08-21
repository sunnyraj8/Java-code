import java.util.Scanner;
class Average
{
    public static void main(String[] args) {

        Scanner a=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1=a.nextInt();
        int num2=a.nextInt();
        int num3=a.nextInt();
        float avg=(num1+num2+num3)/3.0f;
        System.out.println("Average of three number="+avg);
        
    }
}