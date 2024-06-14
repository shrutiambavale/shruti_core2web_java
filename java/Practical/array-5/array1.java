import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements of array : ");
		for(int i = 0 ; i < size ; i++){
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0 ; i < size -1 ; i++){
			if(arr[i] <= arr[i + 1]){
				count++;
			}
		}
		if(count == size - 1){
			System.out.println("array is in ascending order ");
		}else{
			System.out.println("array is not in ascending order ");
		}
	}
}
