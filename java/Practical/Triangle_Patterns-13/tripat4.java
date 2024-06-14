import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of rows : - ");
		int row = sc.nextInt();
		int ch = 64 + (row * (row + 1))/2 ;
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1 ; j <= row - i + 1; j++){
				System.out.print((char)ch + " ");
				ch --;
			}
			System.out.println();
		}
	}
}
