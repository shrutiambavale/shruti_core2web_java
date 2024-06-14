import java.util.*;
class Num2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No :");
		int n=sc.nextInt();
		int t=n;
		System.out.println("Num "+n);
		int sum=0;
		int rem=1;

		int fact=1;
		while(n>0){
			 rem=n%10;
			 sum+=fact1(rem);
			 n/=10;
		}if(sum==t){
			System.out.println("Strong No");
		}else{
			System.out.println("Not Strong No");}
		}
		public static int fact1(int n){
			int fact=1;
			while(n!=0){
				fact*=n;
				n--;
			}return fact;
		}
	}

