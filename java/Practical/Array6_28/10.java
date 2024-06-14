import java.util.*;
class Arr10{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
		int max1=arr[0];
                for(int i=0;i<s;i++){
                        if(max1<arr[i]){
                                max1=arr[i];
			}
		}
		int max2=arr[0];
                for(int i=0;i<s;i++){
			if(arr[i]>=max2 && arr[i]<max1){
				max2=arr[i];
			}
		}
		int max3=arr[0];
                for(int i=0;i<s;i++){
			if(arr[i]>=max3 && arr[i]<max2){
				max3=arr[i];
				
			}
		}



                System.out.println("Third largest Element is "+max3);
	
}}

