import java.util.*;
class Num1{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No :");
		int num=sc.nextInt();
		System.out.println("Num :"+num);
		int i=1;
		int sum=0;
		while(num>i){
			if(num%i==0){
				sum=sum+i;
			}i++;
		}if(sum==num){
			System.out.println(num+" is perfect number");
		}else{
			System.out.println(num+" is not perfect number");
		}
	}
}

