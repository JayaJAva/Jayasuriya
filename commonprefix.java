package jaya;
import java.util.Scanner;
public class commonprefix {
	public static void main(String[] args){
		int b=50,j,a;
		Scanner jaya=new Scanner(System.in);
		a=jaya.nextInt();
		String s[]=new String[a],s1="";
		for(int i=0;i<a;i++){
			s[i]=jaya.next();
			if(s[i].length()<b) b=s[i].length();
		}
		for(int i=1;i<=b;i++){
			for(j=0;j<s.length-1;j++){
				if(!(s[j].substring(0,i).equalsIgnoreCase(s[j+1].substring(0, i)))) break;
			}
			if(j!=(s.length-1))break;
			else s1=s[0].substring(0,i);
		}
		System.out.println(s1);
	}

}


