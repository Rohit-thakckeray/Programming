import java.util.Scanner;
public class table_print
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter which table want to print");
int table = sc.nextInt();
for(int count = 1; count <=10; count++)
{
System.out.println(count*table);
}
}
}