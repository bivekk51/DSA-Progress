import java.util.Arrays;
public class twodimsearch{
    public static void main(String[] args){
        int arr[][]={
            {8,12,17},
            {9,13,21},
            {15,20,69}
        };
        int target=130;
        System.out.println(Arrays.toString(linearSearch(arr,target)));
    }
    static int[] linearSearch(int [][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                  
                    return new int[]{i,j};
                   
                }
            }
        }
        return new int[]{-1,-1};
    }
}