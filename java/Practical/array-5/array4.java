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
		for(int i = 0 ; i < size -1 ; i++){
			for(int j = i + 1 ; j < size ; j++){
				if(arr[i] == arr[j]){
					System.out.println("first duplicate element at index : " + i);
					break;
				}
			}
		}
		/*if(count == size - 1){
			System.out.println("array is in ascending order ");
		}else{
			System.out.println("array is not in ascending order ");
		}*/
	}
}
