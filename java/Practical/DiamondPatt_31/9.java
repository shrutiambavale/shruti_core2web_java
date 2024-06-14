import java.util.*;
class Diamond9{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		int col=0;
		int space=0;
	        System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		int n=row+64;
		for(int i=1;i<row*2;i++){
			if(i<=row){
				space=row-i;
				col=2*i-1;
			}else{
				space=i-row;
				col=col-2;
			}
			for(int sp=1;sp<=space;sp++){
				System.out.print("\t");
			}
			for(int j=1;j<=col;j++){
				System.out.print((char)n+"\t");
			}
				if(i>=row)
					n++;
				else
					n--;
			
	System.out.println();
	}}
}
