import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int arm=0,num,rem;
        num=n;
        while(n>0){
            rem=n%10;
            arm=arm+rem*rem*rem;
            n/=10;
        }
        if(num==arm)
            System.out.println("armstrong");

    }
}