import java.util.*;
class Num7{
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
			 int digit=n%10;
			 sum+=digit*digit;
			 n/=10;
		}boolean happy=false;
		while(sum!=1 && sum!=4){
			sum=0;
			while(sum>0){
				int digit=sum%10;
				sum+=digit*digit;
				sum/=10;
			}
		}
		if(sum==1){
			happy=true;
		}if(happy){
			System.out.println("Happy  No");
		}else{
			System.out.println("Not Happy No");
		}
	}
}
