[import java.util.Scanner;
public class TernoryOperator
{
public static void main(String args [])
{
Scanner sc  = new Scanner(System.in);
System.out.println("Enter Your Number :");
int inputNumber = sc.nextInt();
String  ans = ((inputNumber & 1 )==0) ? "Even" : "Odd"; // string because we stored many        
//  character in varible
System.out.println(ans);
}
}

]