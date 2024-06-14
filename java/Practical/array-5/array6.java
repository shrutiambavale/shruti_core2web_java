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
		int i;
		for(i = 0 ; i < size ; i++){
			if(arr[i] % 2 == 0 && arr[i] % arr[i] == 0){
				break;
			}
		}
		/*if(count == size - 1){
			System.out.println("array is in ascending order ");
		}else{
			System.out.println("array is not in ascending order ");
		}*/
		System.out.println("first prime number found at index : " + i);
	}
}
