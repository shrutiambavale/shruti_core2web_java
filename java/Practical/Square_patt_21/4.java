import java.util.*;
class Sq4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows:");
		int row=sc.nextInt();
		int num=row;
		int ch=64+row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j==1){
				System.out.print((char)ch+" ");
				}else{
				System.out.print(num+" ");
				}num++;
				ch++;
			}System.out.println();
		}
	}

}
