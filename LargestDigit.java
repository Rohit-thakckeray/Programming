import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class LargestDigit
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number :");
int num = sc.nextInt();
int rem = 0;
int digit =0;
while(num>0)
{
rem=num%10;
if(digit<rem)
digit=rem;
num=num/10;
}
System.out.println("Largest number is a :" + digit);
}
}
