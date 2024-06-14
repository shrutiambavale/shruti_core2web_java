import java.util.*;
class Num8{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int rem=1;
		int num=sc.nextInt();
		boolean duck=false;
		int count=0;
	 	while(num>0){
			if(num%10==0){
				count++;
			}num/=10;
		}
		if(count>0 && num!=0){
			duck=true;
		}
		if(duck){
				System.out.println("Duck No");
		}else{
				System.out.println("Not Duck Number");


		}
	}
}

