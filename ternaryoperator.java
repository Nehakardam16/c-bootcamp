import java.util.*;
public class ternaryoperator{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        int num=(a>b?(a>c?a:c):(b>c?b:c));//nesting of ternery operator

        System.out.println("Greatest number is : " + num);


    }
}