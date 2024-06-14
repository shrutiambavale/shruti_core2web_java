import java.util.*;
class Num3{
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
		if(num<sum){
			System.out.println("Difficient No");
		}else{
			System.out.println("Not Difficient No");
		}
	}
}
