import java.util.*;
class Arr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int s=sc.nextInt();
		char arr[]=new char[s];
		System.out.println("Enter Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.next().charAt(0);
		}

		for(int i=0;i<s;i++){
			if(arr[i]=='a' || arr[i]=='e'  || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){

			}else{
			System.out.print(arr[i]+" ");
		}
		}
	}
}
