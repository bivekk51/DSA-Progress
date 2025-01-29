import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int rev=0,num,rem;
        num=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(num==rev)
            System.out.println("palindrome");

    }
}