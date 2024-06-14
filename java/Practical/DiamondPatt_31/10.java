import java.util.*;
class Diamond10{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		int col=0;
		int space=0;
	        System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		int n=1;
		int ch=64;
		for(int i=1;i<row*2;i++){
			if(i<=row){
				space=row-i;
				col=2*i-1;
				n=1;
				ch=64;
			}else{
				n=1;
				ch=64;
				space=i-row;
				col=col-2;
			}
			for(int sp=1;sp<=space;sp++){
				System.out.print("\t");
			}
			for(int j=1;j<=col;j++){
				if(j<=col/2){
					if(j%2==1){
						System.out.print(n+"\t");
						
					}else{
						System.out.print((char)ch+"\t");
					
				}
						n++;
						ch++;
				}else{
					if(j%2==1){
                                                System.out.print(n+"\t");
			
                                        }else{
                                                System.out.print((char)ch+"\t");
					}n--;
					ch--;

				}
			
			
			}
	System.out.println();
	}}
}
