import java.util.*;
class Space4{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		int n=3;
		for(int i=1;i<=row;i++){
			for(int j=row;j>=i;j--){
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(row*j+"\t");
			}
				System.out.println();
		}
	}
}


