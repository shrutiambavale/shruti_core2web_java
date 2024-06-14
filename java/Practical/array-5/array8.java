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
		int min = arr[0];
		for(int i = 0 ; i < size ; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		int min_2 = arr[1];
		for(int i = 0 ; i < size ; i++){
			if(arr[i] < min_2 && arr[i] > min){
				min_2 = arr[i];
			}
		}
		System.out.println("second minimum element is : " + min_2);
	}
}
