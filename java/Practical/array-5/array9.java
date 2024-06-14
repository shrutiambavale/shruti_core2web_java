import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		/*System.out.println("Enter elements of array : ");
		for(int i = 0 ; i < size ; i++){
			arr[i] = sc.nextInt();
		}*/
		System.out.println("Enter your number");
		int num = sc.nextInt();
		int count = 0;
		int temp[] = new int[size];
		for(int i = 0 ; num > 0  ; i++){
			temp[i] = (num % 10) + 1;
			count++;
		}
		int i = 0;
		while(count > 0){
			arr[i] = temp[i];
			i++;
			count--;
		}
		int rev[] = new int[size];
		for(i = 0 ; num > 0 ; i++){
			rev[i] = num%10;
			count++;
		}
		for(i = 0 ; count > 0 ; i++){
			System.out.print(rev[i]);
			count--;
		}
		System.out.println();
	}
}
