import java.util.*;
class Arr10{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter element: ");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Output:");
		for(int i=0;i<s;i++){
		int f=1;	
		int j=1;
		while(j<=arr[i]){
			f=f*j;
			j++;
		}
		System.out.print(f+" ");
	}
			
	}
}

