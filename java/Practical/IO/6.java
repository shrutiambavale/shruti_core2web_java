import java.util.*;
class SC{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n1=sc.nextInt();
		System.out.println("Num1="+ n1);
		int n2=sc.nextInt();
		System.out.println("Num2="+ n2);
		for(int i=n1;i<=n2;i++){
			System.out.print(i+ ",");
		}

	}
}
