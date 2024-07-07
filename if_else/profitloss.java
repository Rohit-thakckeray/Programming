package if_else;
import java.util.Scanner;
public class profitloss
{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your cost price :");
int costprice = sc.nextInt();
System.out.println("Enter your sell price :");
int cellprice = sc.nextInt();
if(cellprice > costprice)
{
int result = (cellprice - costprice);
System.out.println(" the profit is :" + result );
}
else
{
System.out.println("the loss is :" + (costprice - cellprice));
}
}
}