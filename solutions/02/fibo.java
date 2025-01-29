import java.util.Scanner;
public class fibo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int a=0,b=1,c;
        for(int i=1;i<=n;i++){
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;       
        }

    }
}