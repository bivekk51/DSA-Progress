import java.util.Arrays;
public class reverse{
    public static void main(String[] args){
        int[] arr={5,12,13,15,7};
        System.out.println(Arrays.toString(arr));
        calcReverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] calcReverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}