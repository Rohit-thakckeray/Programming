import java.util.Scanner;
public class functionAddition {

public static int add(int a, int b) {
int sum ;
sum = a + b;
return sum;
}
public static void main(String args [])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter first value :");
int a = sc.nextInt();
System.out.println("Enter second value :");
int b = sc.nextInt();
int sum = add(a,b);
System.out.println("the sum of two number is :"+  sum);
}
}