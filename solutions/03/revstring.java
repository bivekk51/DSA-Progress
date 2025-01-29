import java.util.Scanner;
public class revstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sring");
        String inp=sc.nextLine();
        String reverse="";
        for(int i=inp.length()-1;i>=0;i--){
            reverse+=inp.charAt(i);
        }
        System.out.println(reverse);

    }
}