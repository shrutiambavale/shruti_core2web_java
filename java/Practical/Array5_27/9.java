import java.util.*;
class Arr9{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num=sc.nextInt();

		int arr[]=new int[9];
		int rem[]=new int[9];
		for(int i=0;i<arr.length;i++){
			while(num>0){
				rem[i]=num%10;
				rem[i]++;
				num=num/10;
			System.out.print(rem[i]+" ");
			}
		}

	}
}

