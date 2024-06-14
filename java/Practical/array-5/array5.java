import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i = 0 ; i < size ; i++){
			System.out.println("Enter"+i+"(th) elements of array : ");
			arr[i] = sc.nextInt();
		}
		//int count = 0;
		for(int i = 0 ; i < size ; i++){
			int temp = arr[i];
			int num=temp%10;
			int count = 0;
			while(num> 0){
				count+=1;
				num=num/10;
			}
		
			System.out.println("count of digits in " + arr[i] + " is : " + count);
		}
		/*if(count == size - 1){
			System.out.println("array is in ascending order ");
		}else{
			System.out.println("array is not in ascending order ");
		}*/
			//System.out.println("reversed array : ");
	}
}
