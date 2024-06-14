import java.util.*;
class Num4{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int num=sc.nextInt();
		int i=1;
	 	int sum=0;
		i=num-1;
		while(i>0){
			if(num%i==0){
				sum=sum+i;
			}i--;
		}
		if(num>sum){
			System.out.println("Abundant No");
		}else{
			System.out.println("Not Abundant No");
		}
	}
}
