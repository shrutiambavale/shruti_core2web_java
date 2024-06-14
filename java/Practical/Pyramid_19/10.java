import java.util.*;

class Pyra10{
        public static void main(String[] s){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter No of rows:");
                int row=sc.nextInt();
                int n=1;
                int p=row;

                for(int i=1;i<=row;i++){
                int ch=row+64-i+1;
                        for(int j=row;j>i;j--){
                                System.out.print("\t");
                        }
                        for(int j=1;j<=i*2-1;j++){
				if(j<row-p+1){
					System.out.print((char)ch+"\t");
					ch++;
				}else{
					System.out.print((char)ch+"\t");
					ch--;
				}

                        }p--;

                                System.out.println();
                }
        }
}
