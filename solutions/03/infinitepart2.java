import java.util.Scanner;
public class infinitepart2{
    public static void main(String[] args){
        int n,nsum=0,evensum=0,oddsum=0;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Input number(to display sum and terminate pres 0)");
            n=sc.nextInt();
            if(n==0)
                break;
            if(n<0){
                nsum+=n;
            }
            else{
                if(n%2==0)
                    evensum+=n;
                else 
                    oddsum+=n;
            }
            
        }
        System.out.println("Negative sum:"+nsum+"Even sum +ve"+evensum+"Odd sum +ve"+oddsum);
    }
}