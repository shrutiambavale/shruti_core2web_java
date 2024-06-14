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
			int j = 1;
			while(j <= arr[i]){
				if(arr[i] % j == 0){
					count++;
					j++;
				}
			}if(count > 2){
				System.out.println("composite numbers in array : ");
				System.out.println(arr[i] + " ");
			}
		}
		/*if(count == size - 1){
			System.out.println("array is in ascending order ");
		}else{
			System.out.println("array is not in ascending order ");
		}*/
	}
}
