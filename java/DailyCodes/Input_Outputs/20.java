
import java.io.*;

class IO{
	public static void main(String[] s)throws IOException{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i);
		String x=b.readLine();
		System.out.println("Name :"+x);
		String y=b.readLine();
		System.out.println("Collage Name:"+y);
	}
}
