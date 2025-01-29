import java.util.Arrays;
public class max{
    public static void main(String[] args){
        int[] arr={5,12,13,15,7};
        System.out.println(printMax(arr));
        

    }
    public static int printMax(int[] arr){
        int max=0;
        for(int num:arr){
            if(num>max)
                max=num;
        }
        return max;
    }
}