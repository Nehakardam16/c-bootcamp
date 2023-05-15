import java.util.*;
public class Calculator{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        char operator;
        System.out.println("Enter operator what you want to do");
        operator=sc.next().charAt(0);
        System.out.println("Enter two numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        switch(operator)
        {
            case '+':System.out.println(num1+num2);
             break;
             
            case '-':System.out.println(num1-num2);
             break;
             
            case '*':System.out.println(num1*num2);
             break;
             
            case '/':System.out.println(num1/num2);
             break;
             
            case '%':System.out.println(num1%num2);
             break;

             default : System.out.println("you are enter wrong character");
        }

    }
}