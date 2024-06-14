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
		int start = arr[0];
		int end = arr[size - 1];
		int count = size/2;
		for(int i = 0 ; i < size/2 ; i++){
			int temp = arr[i];
			arr[i] = arr[size - i - 1];
			arr[size - i - 1] = temp;
			if(start == end){
				count++;
			}else{
				count--;
			}
		}
		if(count == size){
			System.out.println("array is palindrome");
		}else{
			System.out.println("array is not palindrome ");
		}
	}
}
