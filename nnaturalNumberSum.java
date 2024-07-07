import java.util.Scanner;
public class nnaturalNumberSum
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter number ");
int inputnumber = sc.nextInt();
int sum = 0;
for(int i = 0; i<=inputnumber; i = i + 1)
{
sum = i + sum;
}
System.out.println(sum);
}
}
