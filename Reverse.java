public class Reverse {
    public static void Rev(int numbers[]) {
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int temp=end;
            numbers[end]=numbers[start];
            numbers[start]=numbers[temp];
            start++;
            end--;
        }
        
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Rev(numbers);
        for(int i=0;i<numbers.length-1;i++){
            System.out.print(numbers[i]+" ");

        }
    }
}
