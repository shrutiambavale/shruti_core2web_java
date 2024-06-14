import java.util.*;
class Num9{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int num=sc.nextInt();
		int sum=0;
		while(num !=0){
			sum+=num%10;
			num/=10;
		}boolean harshad=num%sum==0;
		if(harshad){
			System.out.println("No. is harshad");
		}else{
			System.out.println("No.is not harshad");
		}
	}
}	
