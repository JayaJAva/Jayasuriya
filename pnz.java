package jaya;
import java.util.Scanner;
public class pnz {
	public static void main(String[] args){
		int N=0;
		Scanner jaya=new Scanner(System.in);
		try{
		 N=jaya.nextInt();
		}catch(Exception e){
			System.out.println("Invalid Input");
			return;
		}
		if(N!=0){
			if(N>0) System.out.println("Positive");
			else System.out.println("Negative");
		}
		else System.out.println("Zero");
	}

}
