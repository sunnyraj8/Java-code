import java.util.*;
public class Dell
{   public static int LinearSearch(int marks[],int key) {
        for(int i=0;i<=marks.length; i++){
            if (marks[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int marks[]={92,80,98,95,86,75,84,90};
        int key=90;
        int index=LinearSearch(marks,key);
        if (index==-1) {
            System.out.println("number not found");
        }
        else{
            System.out.println(index);
        }

     }
}