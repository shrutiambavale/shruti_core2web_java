import java.util.*;
class Num10{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int num=sc.nextInt();
		int n=num;
		int sum=0;
		while(num > 0){
			int digit= num%10;
			sum+=digit*digit*digit;
			num/=10;
		}if(sum==n){
			System.out.println("Number is Armstrong");
		}else{
			System.out.println("Number is not Armstrong");
		}
	}
}
