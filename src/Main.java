import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=6;
        int b=8;
        System.out.println("Before swapping");
        System.out.println(a);
        System.out.println(b);
        Scanner scanner=new Scanner(System.in);
       // a=scanner.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping");
        System.out.println(a);
        System.out.println(b);
    }
}