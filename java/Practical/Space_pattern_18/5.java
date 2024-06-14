import java.util.*;
class Space5{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		int b=1;
			
		for(int i=1;i<=row;i++){
			b=i;
			for(int j=row;j>=i;j--){
				System.out.print("  ");
			}
	
			for(int j=1;j<=i;j++){
				System.out.print(b+"\t");
				b=b+i;
			}
	
				System.out.println();
		}
	}
}


