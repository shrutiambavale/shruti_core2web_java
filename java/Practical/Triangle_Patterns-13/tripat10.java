import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of rows : - ");
		int row = sc.nextInt();
		for(int i = 0 ; i < row ; i++){
			int ch1 = 64 + row - i;
			int ch2 = 96 + row - i;
			for(int j = 1 ; j <= row - i ; j++){
				if(row % 2 == 0){
					if(i % 2 == 0){
						System.out.print((char)ch1-- + " ");
					}else{
						System.out.print((char)ch2-- + " ");
					}
				}
				if(row % 2 == 1){
					if(i % 2 == 0){
						System.out.print((char)ch2-- + " ");
					}else{
						System.out.print((char)ch1-- + " ");
					}
				}
			}
			/*if(i % 2 == 1)
				ch2--;
			else
				ch1--;*/
			System.out.println();
		}
	}
}
