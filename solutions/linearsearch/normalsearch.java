public class normalsearch{
    public static void main(String[] args){
        int arr[]={2,9,10,12,15,17};
        int target=12;
        System.out.println(linearSearch(arr,target));
    }
    static int linearSearch(int [] arr,int target){
        //search garney
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                //target bhetyo vaney index return garney
                return i;
        }
        //yo vanda agaadi return vayena i.e target vetiyena vaney -1 pathaidiney
        return -1;
    }
}