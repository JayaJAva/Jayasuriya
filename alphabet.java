package jaya;

import java.util.Scanner;

public class alphabet {
	public static void main(String[] args){
	Scanner jaya=new Scanner(System.in);
	char c=jaya.next().toUpperCase().charAt(0);
	if(c>64&&c<91) System.out.println("Alphabet");
	else System.out.println("No");
	}
}
