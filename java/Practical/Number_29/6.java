import java.util.*;
class Num6{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int c=10;
		int num3=1;
		for(int i=1;i<c;i++){
			num3=num1+num2;
			System.out.print(num3+" , ");
			num1=num2;
			num2=num3;
		}
	}
}

		
