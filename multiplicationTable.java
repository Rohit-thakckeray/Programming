import java.util.Scanner;
public class multiplicationTable
{
public static void  main(String args [])
{
Scanner sc = new Scanner (System.in);
System.out.println("Welcome to multiplication calculator :");
System.out.print("Enter a table number :");
int inputNum = sc.nextInt();
printmultiplicationTable(inputNum);
}
public static void printmultiplicationTable(int a )
//using while  loop 
// {
// int i = 1;
// while(i<=10) {
// System.out.println(a + " x " + i + " = " + (a * i));
// i++;

// using for loop 

{
for(int i = 1; i<= 10; i++)
{
System.out.println(a + " x " + i + "  =  " + (a*i));
}
}
}