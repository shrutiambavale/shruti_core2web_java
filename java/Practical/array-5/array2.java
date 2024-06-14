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
		int odd_sum = 0;
		int even_sum = 0;
		for(int i = 0 ; i < size ; i++){
			if(arr[i] % 2 == 0){
				even_sum += arr[i];
			}else{
				odd_sum += arr[i];
			}
		}
		System.out.println("odd sum = " + odd_sum);
		System.out.println("even sum = " + even_sum);
	}
}
