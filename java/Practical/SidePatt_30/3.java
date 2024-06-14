import java.util.*;
class S_Patt3{
        public static void main(String[] S){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Row : ");
                int row=sc.nextInt();
		int col=0;
	        int n=1;
		int p=0;
                for(int i=0;i<row*2;i++){
	        	p=row;
                        if(i<=row){
				n=i;
				col=i;
			}else{
				n=col-1;
				col--;
			}
			for(int j=1;j<=col;j++){
				if(i<=row){
					System.out.print(n+"\t");
					n--;
				}else{
					System.out.print(n+"\t");
						n--;
				}
			}
			System.out.println();
		}

        }
}
