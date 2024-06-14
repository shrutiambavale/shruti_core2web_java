import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of rows : - ");
		int row = sc.nextInt();
	//	int num = row;
	//	int ch = 96 + row;
		for(int i = 0 ; i < row ; i++){
			int num = row - i;
			int ch = 64 + row - i;
			for(int j = 1 ; j < row - i + 1; j++){
				if(i % 2 == 0){
					System.out.print(num + " ");
					ch--;
					num--;
				}else{
					System.out.print((char)ch + " ");
					ch--;
					num--;
				}
			}
			System.out.println();
		}
	}
}
