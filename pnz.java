package jaya;
import java.util.Scanner;
public class pnz {
	public static void main(String[] args){
		Scanner jaya=new Scanner(System.in);
		int n=jaya.nextInt();
		if(n!=0){
			if(n>0) System.out.println("Positive");
			else System.out.println("Negative");
		}
		else System.out.println("Zero");
	}

}
