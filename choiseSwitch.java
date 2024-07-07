//enter positive number between 1 to 5 and print will their word  using switch_case //
import java.util.Scanner;
public class choiseSwitch
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter positive number between 1 to 5 ");
int value = sc.nextInt();
//switch case 
if(value>5 && value<=90)
{
System.out.println("you can not enter more number above the 5 ");
}
else
{
switch(value)
{
case 0:System.out.println("zero");
      break;
case 1:System.out.println("one");
      break;
case 2:System.out.println("two");
      break;
case 3:System.out.println("three");
      break;
case 4:System.out.println("four");
      break;
case 5:System.out.println("five");
       break;
default:System.out.println("invalid choise ");
}
}
}
}