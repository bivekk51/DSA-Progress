import java.util.Scanner;
public class three{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        System.out.println(isEligible(age));
    }

    public static String isEligible(int age){
        String eligible=age>18?"Eligible":"Not Eligible";
        return eligible;
    }
    
}
