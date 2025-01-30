public class minimum{
    public static void main(String[] args){
        int arr[]={2,9,10,12,15,17};
        
        System.out.println(findMinimum(arr));
    }
    static int findMinimum(int [] arr){
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minimum)
                minimum=arr[i];
        }
        return minimum;
    }
}