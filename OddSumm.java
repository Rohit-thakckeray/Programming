import java.util.Scanner;
public class OddSumm
{
public static void mian(String args [])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter number :");
int NumSummOdd = sc.nextInt();
OddSumCalculator(NumSummOdd);
}
public static int OddSumCalculator(int num)
{
int i = 1;
int sum = 0;
while(i <= num)
{
sum = sum + i;
i = i + 2;
}
return sum;
}
}