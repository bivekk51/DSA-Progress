import java.util.Arrays;
public class swap{
    public static void main(String[] args){
        int[] arr={5,12,13,15,7};
        System.out.println(Arrays.toString(arr));
        swapArray(arr,1,4);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] swapArray(int[] arr,int ind1,int ind2){
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
        return arr;
    }
}