import java.util.*;
class S_Patt8{
        public static void main(String[] S){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Row : ");
                int row=sc.nextInt();
		int col=0;
                for(int i=0;i<row*2;i++){
                        if(i<=row){
				col=row-i;
			}else{
				col=i-row;
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
				System.out.print(i+"\t");
			}System.out.println();


                }

        }
}
