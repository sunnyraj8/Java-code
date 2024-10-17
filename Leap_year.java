import java.util.Scanner;

public class Leap_year {
    public static void Checkleap(int year){
        if(year%100==0){
            if(year%400==0){
                System.out.println(year+" is a leap year.");
            }
            else{
                System.out.println(year+" is a non leap year.");
            }
        }else if(year%4==0){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" is a non leap year.");
        }
    }
    public static void main(String[] args) {
        int year;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year!");
        year=sc.nextInt();
        Checkleap(year);

    }
}
