public class linear_search {

    public static int linear(int num[],int key){
        int ans = -1;
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                ans = i;
            }
            

        }
        return ans; 
    }
    public static void main(String[] args) {
        //int num[]=new int[50];
        int num[]={90,80,84,92,94,88,82,78,75};
        int key=92;
        int ans=linear(num,key);
        if(ans==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index:"+ans);
        }
    }
}
