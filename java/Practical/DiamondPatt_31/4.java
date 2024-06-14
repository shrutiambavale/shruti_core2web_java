import java.util.*;
class Diamond4{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		int col=0;
		int space=0;
	        System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		int n=1;
		int p=row;
		for(int i=1;i<row*2;i++){
			if(i<=row){
				space=row-i;
				col=2*i-1;
				n=1;
			}else{
				n=1;
				space=i-row;
				col=col-2;
			}
			for(int sp=1;sp<=space;sp++){
				System.out.print("\t");
			}
			for(int j=1;j<=col;j++){
				if(j<=col/2)
				System.out.print(n+++"\t");
				else
				System.out.print(n--+"\t");
			}
	System.out.println();
	}}
}
