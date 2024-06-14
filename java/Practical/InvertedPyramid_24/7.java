import java.util.*;
class InvertedPyra7{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No of rows");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
				int ch=65;
			for(int sp=1;sp<i;sp++){
				
				System.out.print("\t");
			}
			for(int j=1;j<=(row-i)*2+1;j++){
				if(j<row-i+1){
				System.out.print((char)ch+"\t");
				ch++;
				}else{
				System.out.print((char)ch+"\t");
				ch--;
			}
			}
				System.out.println();
		}
	}
}
