import java.util.*;
public class Largest{
    public static int find_largest(int numbers[]){
        int largest_num = Integer.MIN_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest_num){
                largest_num=numbers[i];
            }

        }
        return largest_num;
    }
    public static void main(String[] args) {
        int numbers[]={45,22,85,64,35,84,12};
        //int num= largest_num;
        System.out.println("Largest number=" + find_largest(numbers));
    }
}