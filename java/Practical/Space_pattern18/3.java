import java.util.*;
class Space{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=row;j>=i;j--){
				System.out.print("  ");
			}
			int a=65;
			for(int j=1;j<=i;j++){
				System.out.print((char)a+" ");
				a++;
			}
				System.out.println();
		}
	}
}


