import java.util.Scanner;
public class convert{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary in NRS");
        int nrs=sc.nextInt();
        float usd=nrs/130;
        System.out.println("Salary in USD:"+usd+"$");

    }
}