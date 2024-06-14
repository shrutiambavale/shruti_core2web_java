import java.util.*;

class Mix9{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows:");
		int row=sc.nextInt();
		int n=row;
		for(int i=1;i<=row;i++){
			n=row+i-1;
			for(int j=row;j>i;j--){
				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(n+"\t");
				n--;
			}
			
				System.out.println();
		}
	}
}
