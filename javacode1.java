import java.util.*;
public class javacode1{
static void addnum(int a,int b){
System.out.println(a+b);}
public static void main(String [] args){
System.out.println("Enter your number one: ");
Scanner sc=new Scanner(System.in);
Integer a=sc.nextInt();
System.out.println("Enter your number two: ");
Integer b=sc.nextInt(); 
addnum(a,b);
}
}