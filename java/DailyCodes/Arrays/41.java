
import java.util.*;
class Jagg{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arr size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter arr Elements:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
}
