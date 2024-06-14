import java.util.*;
class Arr4{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		int arr1[]=new int[s];
		int a=0;
		System.out.println("Enter Arr "+a++);
		for(int j=0;j<s;j++){
			
			arr[j]=sc.nextInt();
		}
	
		System.out.println("Enter Arr "+a++);
		for(int i=0;i<s;i++){
			
			arr1[i]=sc.nextInt();
		}
	
		for(int i=0;i<s;i++){
	
		for(int j=0;j<s;j++){
			if(arr[j]==arr1[i]){
			
				System.out.print(arr[j]+"    ");
		}
		}
	}
}
}

