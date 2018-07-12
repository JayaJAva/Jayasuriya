package jaya;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class collecog {
	ArrayList<Integer> A2=new ArrayList<Integer>();
	ArrayList<Integer> A=new ArrayList<Integer>();
	public static void main(String[] args){
		int n;
		Scanner jaya=new Scanner(System.in);
		n=jaya.nextInt();
		collecog jaya1=new collecog();
		
		System.out.println(jaya1.saveEvenNumbers(n)+"       "+jaya1.printEvenNumbers(n));
	}
	public ArrayList<Integer> saveEvenNumbers(int n){
		int i=2;
		while(i<=n){
			A.add(i);
			i=i+2;
		}
		return A;
	}
	public int[] printEvenNumbers(ArrayList<Integer> j){
		Iterator<Integer> jaya=j.iterator();
		while(jaya.hasNext())	A2.add((int)jaya.next()*2);
		int a[]=new int[A2.size()];
		for(int i=0;i<a.length;i++){
			a[i]=A2.get(i);
		}
		return a;
	}
	public int printEvenNumbers(int n){
		if(A.contains(n)) return n;
		else return 0;
		
	}
}
