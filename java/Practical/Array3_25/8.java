import java.util.*;
class Arr8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
                
		for(int i=0;i<s;i++){
                int t=1;
		int c=0;
		while(t<arr[i]){
			if(arr[i]%t==0){
				c++;
			}t++;
		}
		//System.out.println("Element");
		if(c>=2){
		

		System.out.print(arr[i]+" ");
		}
	
		}	
		
	}
}
