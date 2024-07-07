import java.util.Scanner;
public class LastDigit
{
 public static void main(String [] args)
    {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Your input Number :");
   int input = sc.nextInt();

   input = input % 10;
   System.out.println("Last digit of Your input is :"+ input);

    }
}