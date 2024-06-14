import java.util.*;
class Squa4{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j%2==0 && i%2==0){
					System.out.print("$ ");
				}else{
					System.out.print("& ");
				}
			}System.out.println();
		}
	}
}

