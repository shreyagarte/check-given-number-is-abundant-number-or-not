// Check Given Number Is Abundant Number Or Not//
import java.io.*;
import java.util.*;
public class abundant
{
 public static void main(String args[])
{
int n,i,sum=0;
System.out.println("Enter Number");
Scanner s= new Scanner(System.in);
n=s.nextInt();

for(i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(sum>n)
{
System.out.println(" it is abundant number");
}
else
{
System.out.println("it is not abundant number");
}
}
}
/* input-Enter Number 
  output-20
         it is abundant number*/  