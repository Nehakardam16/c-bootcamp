import java.util.*;
public class JavaBasic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius");
        float rad=sc.nextFloat();
        float area= 3.14f*rad*rad;
        System.out.println(area);


    }
}