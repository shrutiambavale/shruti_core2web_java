
import java.io.*;

class IO{
	public static void main(String[] s)throws IOException{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i);
		System.out.println("Enter company  Name :");
		String x=b.readLine();
		System.out.println("company  Name :"+x);
		System.out.println("Enter Employee Name:");
		String y=b.readLine();
		System.out.println("Employee Name:"+y);
		System.out.println("Enter emp ID :");
		int a=Integer.parseInt(b.readLine());


	}
}
