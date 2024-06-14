import java.util.*;
class Num5{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int num=sc.nextInt();
		int digit=0;
		int temp=num;
		int va=0;
		int rem=1;
		int rev=0;
		int sq=0;
		while(num>0){
			num/=10;
			digit++;
		}
		sq=temp*temp;
		while(digit>0){
			rem=sq%10;
			va=rem+va*10;
			sq/=10;
			digit--;
			while(va>0){
				rem=va%10;
				va/=10;
				rev=rem+rev*10;
			}}
			if(rev==temp){
				System.out.println("Automorphic Number");
			}else{
				System.out.print("Not Automrphic number");
			}
		
	}
}
		
