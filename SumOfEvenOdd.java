// all digit even number present the sum 
// all odd number sum 

import java.util.Scanner;
public class SumOfEvenOdd
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your User Input: ");
int input = sc.nextInt();
int EvenSum = 0;
int OddSum = 0;

while(input > 0)
{
//int reminder varible 
int rem = input % 10;
if(rem % 2 == 0)
{
EvenSum = EvenSum + rem;
}
else
{
OddSum = OddSum + rem;
}
}
System.out.println("Even number sum is Input digit is a  :" + EvenSum);
System.out.println();
System.out.println("Odd Number sum is in Input digit is a :"  + OddSum);
}
}