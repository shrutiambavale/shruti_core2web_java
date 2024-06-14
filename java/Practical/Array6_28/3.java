import java.util.*;
class Arr3{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
	}
		System.out.println("Enter Key:");
		
		int key=sc.nextInt();
		int c=0;

		for(int i=0;i<s;i++){
			if(key==arr[i]){
				c++;
			}
		}
		if(c>2){
			for(int i=0;i<s;i++){
				if(key==arr[i]){
					arr[i]=arr[i]*arr[i]*arr[i];
				}
				System.out.println(arr[i]);
			}}else{
			System.out.println("Element Not Found");
		
		}
}
}
