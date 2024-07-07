import java.util.Scanner;
public class oddsum
{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to odd sum calculator :");
System.out.println("Enter a number :");
int numinput = sc.nextInt();
int sum = oddsumcalculator(numinput);
System.out.println("odd sum calculator is till "+ numinput + " is " + sum);
}
public static int oddsumcalculator(int num)
{
int sum = 0;
int i = 1;
while(i<=num)
{
sum = sum + i;
i = i + 2;
}
return sum;
}
}
