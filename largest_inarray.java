public class largest_inarray {
    public static int larg(int num[]){
        int lag=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){

            if(num[i]>lag){
                lag=num[i];
            }
        }
        return lag;
    }
    public static void main(String[] args){
        int num[]={87,85,64,94,85,45,50,86};
        int abc=larg(num);
        System.out.println("Largest number is :"+abc);

    }
}
