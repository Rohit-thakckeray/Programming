import java.util.Scanner;
public class logicaloperator {
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
//and && ->both condition should be true 
//or || ->atlest one condition should true 
//not !->make true to false

//if true && true == ture;
//if true || flase == true 
//if true && false == flase

System.out.print("Enter you age : ");
int age = sc.nextInt();
System.out.print("Are you female ? (true / false):");
boolean isfemale = sc.nextBoolean();

if(age<5)
{
System.out.println("you got 75 % disscount :");
}
else if(isfemale)
{
System.out.println("you got 50 % discound :");
}
else if(age>65 && !isfemale )
{
System.out.println("you got 25 % discound :");
}
else
{
System.out.println("you got nothing :");
}

}
    
}
