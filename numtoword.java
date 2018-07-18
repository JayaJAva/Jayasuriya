import java.util.Scanner;

public class numtoword {
	public static void main(String[] args){
		String b[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineten"};
		String c[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		Scanner jaya=new Scanner(System.in);
		String a=String.valueOf(jaya.nextInt()),s1="";
		for(int i=0;a.length()!=0;i=0){
			switch(a.length()){
				case 5:{
					if(a.charAt(i)=='1'){
						s1=s1+b[Integer.parseInt(a.substring(0, 2))]+" thousand ";
						i=i+1;
						break;
					}
					s1=s1+c[Integer.parseInt(String.valueOf(a.charAt(i)))];
					i++;
				}
				case 4:{
					s1=s1+b[Integer.parseInt(String.valueOf(a.charAt(i)))]+" Thousand ";
					break;
				}
				case 3:{
					if(a.charAt(i)>'0')
					s1=s1+b[Integer.parseInt(String.valueOf(a.charAt(i)))]+" hundred ";
					if(a.charAt(i+1)!='0') s1=s1+"and ";
					break;
				}
				case 2:{
					if(a.charAt(i)>'0') if(a.charAt(i)=='1'){s1=s1+b[Integer.parseInt(a.substring(0,2))];
					i++;
					break;
					}
					else{
						s1=s1+c[Integer.parseInt(String.valueOf(a.charAt(i)))];
						i++;
					}
				}
				case 1:
					s1=s1+b[Integer.parseInt(String.valueOf(a.charAt(i)))];
					break;
			}
			a=a.substring(i+1);
		}
		System.out.println(s1);
		
		
	}

}
