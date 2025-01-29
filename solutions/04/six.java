import java.util.Scanner;
public class six{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        int r=sc.nextInt();
        printResult(r);
    }

    public static void printResult(int r){
        double c=2*3.14*r;
        double a=3.14*r*r;
        System.out.println("C "+c+"A "+a);
    }
    
}
