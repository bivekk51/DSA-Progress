import java.util.Scanner;
public class seven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println(isPrime(a));
    }

    public static boolean isPrime(int a){
        int count=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                count++;
        }
        return count==2;
    }
    
}
