import java.util.Scanner;
import java.lang.Math;

public class Armstrong_Numbers {
    public static void CheckArmstrong(int num){
        int count=0;
        double arm=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        while(num!=0){
            int rem=num%10;
            arm=arm+(Math.pow(arm,count)) ;
            num=num/10;
        }
        System.out.println(arm+" is Armstrong number");
        //System.out.println(count+" no of digits");
    }
    public static void main(String[] args) {
        int num;
        Scanner sct=new Scanner(System.in);
        System.out.println("Enter a number! ");
        num=sct.nextInt(); 
        CheckArmstrong(num);
    }
}
