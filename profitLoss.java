import java.util.Scanner;
public class profitLoss
{
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter cost price :");
int costprice = sc.nextInt();
System.out.println("Enter selling price :");
int sellprice = sc.nextInt();
if(sellprice>costprice)
{
System.out.println("i have profit :");
int ans = costprice - sellprice;
ans = ans * (-1);
System.out.println("profit is :Rs"+ans);
}
if(sellprice<costprice)
{
System.out.println("i have loss :");
int ans = sellprice - costprice;
System.out.println("loss is  :rs");
ans = ans * (-1);
System.out.println(ans);
}
//comparision of cost price and sell price 
if(costprice==sellprice)
{
System.out.println("cost price and sell price are same :");
System.out.println("you have nothing either profit or loss :");
}
}
}
