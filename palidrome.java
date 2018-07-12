package palindrome;
import java.util.Scanner;
public class palidrome {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String a=s.next();
	StringBuffer b=new StringBuffer(a) ;
	StringBuffer reverse =b.reverse();
	if(a.equals(reverse.toString()))
	{
		System.out.println("it is an palindrome");
	}
	else
	{
		System.out.println("it is not  an palindrome");

	}
}
}
