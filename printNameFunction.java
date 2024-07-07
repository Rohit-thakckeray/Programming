import java.util.Scanner;
public class printNameFunction {
public static void PrintName(String name) {
System.out.println("Your name is :" +name);
return ;
}
public static void main() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name :");
String name = sc.next();
printName(name);
}
}