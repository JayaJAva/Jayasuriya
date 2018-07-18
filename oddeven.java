package jaya;

import java.util.Scanner;

public class oddeven {
	public static void main(String[] args){
		Scanner jaya=new Scanner(System.in);
		int a=jaya.nextInt();
		if(a>0){
			if(a%2==0) System.out.println("Even");
			else System.out.println("Odd");
		}
		else System.out.println("Invalid");
	}

}
