import java.util.*;
class Space6{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		
			int a=row;
		for(int i=row;i>=1;i--){
			
			for(int j=row;j>=i;j--){
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--){
				System.out.print(i+" ");
			}a--;
				System.out.println();
		}
	}
}


