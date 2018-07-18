import java.util.Scanner;

public class divido {
	public static void main(String[] arg){
		Scanner jaya=new Scanner(System.in);
		int d=jaya.nextInt(),h=0,i=0;
		double e=Math.pow(10, -1),f,g;
		while(d>0){
			f=d*e;
			g=f-(int)f;
			h=(int)(h*10)+(int)(g*10);
			d=(int)(d*e);
		}
		System.out.println(h);
	}

}
