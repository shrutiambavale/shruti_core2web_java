import java.util.*;
class S_Patt5{
        public static void main(String[] S){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Row : ");
                int row=sc.nextInt();
		int col=0;
		int num=row+65;
                for(int i=0;i<row*2;i++){
                        if(i<=row){
				col=i;
			}else{
				col--;
			}
			for(int j=1;j<=col;j++){
				System.out.print((char)num+"\t");
			}if(i<row){
				num--;
			}else{
				num++;
			}
			System.out.println();


                }

        }
}
