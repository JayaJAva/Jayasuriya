package jaya;
import java.util.*;
public class S2{
	public static void main(String args[]){
		int c,d;
		String a,b;
		System.out.println("Enter the string");
		Scanner scan=new Scanner(System.in);
		a=scan.next().toLowerCase();
		b=scan.next().toLowerCase();
		c=a.length();
		d=b.length();
		if(c==d){
			char []i=a.toCharArray();
			char []j=b.toCharArray();
			Arrays.sort(i);
			Arrays.sort(j);
			if(Arrays.equals(i,j)){
				System.out.println("true");
			}
		}
			else{
				System.out.println("false");
			}
	}
}