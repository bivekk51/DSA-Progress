import java.util.Scanner;
public class two{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println(isOddOrEven(a));

    }

    public static String isOddOrEven(int a){
        if(a%2==0)
            return "Even";
        else 
            return "Odd";
       

    }
    
}
