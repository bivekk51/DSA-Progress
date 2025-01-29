import java.util.Scanner;
public class infinite{
    public static void main(String[] args){
        int n,larger=0;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Input number(to display sum and terminate pres 0)");
            n=sc.nextInt();
            if(n==0)
                break;
            if(n>larger)
                larger=n;
            
        }
        System.out.println(larger);
    }
}