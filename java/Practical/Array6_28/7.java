import java.util.*;

class Arr7{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<s;i++){
			if(arr[i]>64 && arr[i]<91){
				System.out.print((char)arr[i]+"   ");
			}else{
				System.out.print(arr[i]+"   ");


		}
	}
	}}

