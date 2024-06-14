import java.util.*;
class Arr7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		char arr[]=new char[s];
		System.out.println("Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i<s;i++){
			if(arr[i]<123 && arr[i]>96){
				arr[i]-=32;
			}System.out.print(arr[i]+" ");
		}System.out.println();

	}
}
