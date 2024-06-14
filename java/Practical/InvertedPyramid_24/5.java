import java.util.*;
class InvertedPyra5{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No of rows");
		int row=sc.nextInt();
		char ch=65;
		for(int i=1;i<=row;i++){
			for(int j=1;j<i;j++){
				System.out.print("\t");
			}
			for(int j=1;j<=(row-i)*2+1;j++){
				System.out.print(ch+"\t");
			}ch++;
				System.out.println();
		}
	}
}
