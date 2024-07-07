import java.util.Scanner;
public class OneDimestionalArray
{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
int marks [] = { 200, 4, 60 ,80 , 100,67,24};
//traversing of the array =
for( int traversing = 0; traversing < marks.length; traversing ++ )
{
if(marks [traversing] < 35)
{
System.out.println("your roll number is " + traversing);
break;
} 
else if(marks [traversing] > 35)
{
System.out.println("not found :"); 
break;
}
// else
// {
// System.out.println("couldn't find anyone student :");
// break;
// }
}

}
}