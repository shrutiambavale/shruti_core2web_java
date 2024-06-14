import java.util.*;
class Arr8{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		char arr[]=new char[s];
		System.out.println("Enter Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.next().charAt(0);
		}
		System.out.println("After Reverse:");
		for(int i=s-1;i>=0;i--){
			
			System.out.print("\t"+arr[i]);
		}
	}
}

