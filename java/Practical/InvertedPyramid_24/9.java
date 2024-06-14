import java.util.*;
class InvertedPyra9{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No of rows");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<i;j++){
				System.out.print("\t");
			}
			for(int j=1;j<=(row-i)*2+1;j++){
				if(j%2==0){
				System.out.print("0\t");
			}else{
				System.out.print("1\t");
			}
			}
				System.out.println();
	}
}}
