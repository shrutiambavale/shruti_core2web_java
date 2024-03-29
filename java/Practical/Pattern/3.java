
import java.io.*;
class ISR{
	public static void main(String[] s)throws IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No of Rows :");
		int row=Integer.parseInt(b.readLine());
		char a='A';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(a+" ");
				a++;
			}
				System.out.println();
		}
	}
}



