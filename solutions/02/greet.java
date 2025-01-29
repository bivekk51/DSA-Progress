import java.util.Scanner;
public class greet{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Input your name ");
        name=sc.nextLine();
        System.out.println("Hello "+name);
    }
}