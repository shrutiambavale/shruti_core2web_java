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
		for(int i = 0 ; i < size ; i++){
			int fact = 1;
			int j = 1;
			while(j <= arr[i]){
				fact *= j;
				j++;
			}
			System.out.print(fact + " ");
		}
	}
}
