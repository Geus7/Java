import java.util.*;
public class javacode2{
public static void main(String [] args){
System.out.println("Enter the number to find its factorial: ");
Scanner sc=new Scanner(System.in);
Integer n=sc.nextInt();
int r=fact(n);
System.out.println("The factorial of "+n+" is "+r);
}
static int fact(int n){
if(n==0 || n==1){
return 1;
}else{
return n * fact(n-1);
}
}
}