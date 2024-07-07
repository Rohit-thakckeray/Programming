import java.util.Scanner;
public class Switch_month
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter month number ");
int inputmonthnumber = sc.nextInt();
//switch case
switch(inputmonthnumber)
{
case 0:System.out.println("month name not found ");
       break;
case 1:System.out.println("janevary");
       break;
case 2:System.out.println("februvary");
      break;
case 3:System.out.println("march");
      break;
case 4:System.out.println("april");
      break;
case 5:System.out.println("may");
      break;
case 6:System.out.println("june");
       break;
case 7:System.out.println("jully");
    break;
case 8:System.out.println("august ");
       break;
case 9:System.out.println("september");
      break;
case 10:System.out.println("octomber");
      break;
case 11:System.out.println("november");
       break;
case 12:System.out.println("december");
       break;
default:System.out.println("please enter valid month number  for the output  ");
}
}
}