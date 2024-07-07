import java.util.Scanner;
public class SumOFDigit
{
public static void  main(String args [])
{
Scanner sc = new Scanner(System.in);
System.out.println("WElcome to sum digit calculator :");
System.out.println("Enter your onces Number :");
int InputSumDigit = sc.nextInt();
int PrintSumOddResult = SumOddCalculator(InputSumDigit);
System.out.println("the sum of digit is :"+PrintSumOddResult);
}
public static int SumOddCalculator(int num)
{
int sum = 0;
while(num > 0)
{
sum = sum + (num % 10);
num = num / 10;
}
return sum;
}
}