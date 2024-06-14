import java.util.*;
class Arr6{
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
				if(arr[i]%key==0){
				
				System.out.println("multiple of "+key+"is found at index"+i);
			}/*}else{
			System.out.println("Element Not Found");
		*/
		}
}

}
