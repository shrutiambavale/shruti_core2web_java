import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of rows : - ");
		int row = sc.nextInt();
		for(int i = 1 ; i <= row ; i++){
			int num = i;
			for(int j = 1 ; j <= row - i + 1; j++){
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}
