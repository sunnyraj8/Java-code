import java.util.*;

class Prime {
    public static void main(String[] args) {
        int num,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is even or odd ");
        num=sc.nextInt();
        for(int i=1;i<num+1;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2) {
            System.out.println(num+" is prime");
        }
        else{
            System.out.println(num+" is not prime");
        }
        
    }
}