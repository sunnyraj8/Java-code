
public class Binarysearch {
    public static int binarySearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    return -1;    

    }
    public static void main(String[] args) {
        int numbers[]={40,56,52,62,68,70,88,90,92,94};
        int key=62;
        int abc=binarySearch(numbers, key);
        if (abc==-1) {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+abc);
        }
    }
    
} 