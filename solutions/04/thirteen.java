import java.util.Scanner;
public class thirteen{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println(calcSum(a));
    }

    public static int calcSum(int a){
        int sum=0;
        for(int i=1;i<=a;i++)
        {
            sum+=i;
        }
        return sum;
    }
    
}
