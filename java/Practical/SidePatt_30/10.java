import java.util.*;
class S_Patt10{
        public static void main(String[] S){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Row : ");
                int row=sc.nextInt();
		int col=0;
		int n=65;
		int ns=row;
                for(int i=0;i<row*2;i++){
                        if(i<=row){
				n=row+65-i;
				col=row-i;
			
			}else
			{
				n=row-ns+1+65;
				col=i-row;
				ns--;
			}
			for(int sp=1;sp<=col;sp++){
				System.out.print("\t");
			}
			if(i<=row){
				col=i;
			}else{
				col=row*2-i;
			}
			for(int j=1;j<=col;j++){
			
				System.out.print((char)n+"\t");
			
					n++;
			
			}System.out.println();


                }

        }
}
