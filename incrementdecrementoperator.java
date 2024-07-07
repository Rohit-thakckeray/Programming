//increment and decrement operator 
public class incrementdecrementoperator
{
public static void main(String args[])
{
int x;
x=200;
System.out.println(x);
++x;//pre increment operator this is operator will use the value and after use will update the value
System.out.println(x); 
// x = x + 1;
--x;//pre decrement operator this operator will first use the value decrement and 
System.out.println(x);
// x = x -1;

//post  increment
x++;//post increment first use the last value and after update the value in post increment operator
System.out.println(x);
//x = x+1;
//post decrement 
x--;//last value will use first and updata the decrement value 
System.out.println(x);
//x = x -1;
}
}
