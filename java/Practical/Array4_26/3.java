import java.util.*;
class Arr3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}int max=arr[0];
		int max2=arr[0];
		for(int i=0;i<s;i++){
			if(max<arr[i]){
				max2=max;
				max=arr[i];
			
			}else if(arr[i]>max2){
				max2=arr[i];
		}
		}
		System.out.println("second largest numbers:"+max2);
	}
}
