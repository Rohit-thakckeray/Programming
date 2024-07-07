import java.util.Scanner;
public class SpyNumber
{
public static void main(String [] args )
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your Input :  " );
int input = sc.nextInt();
int reminder = 0;
int additon = 0;
int multiplication = 1;
while(input > 9)
{
reminder = input / 10;
input = input % 10;
additon = input + reminder; // adition of each digit 
multiplication = input *  reminder; // multiplication of each digit 
}
if(additon == multiplication)
{
System.out.println("Its Spy number :");
}
else 
{
System.out.println("not spy number :");
}

}
}
