import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of rows : - ");
		int row = sc.nextInt();
		for(int i = 0 ; i < row ; i++){
			char ch1 = 'A';
			char ch2 = 'a';
			for(int j = 1 ; j < row - i + 1; j++){
				if(i % 2 == 0)
					System.out.print(ch1++ + " ");
				else
					System.out.print(ch2++ + " ");
			}
			System.out.println();
		}
	}
}
