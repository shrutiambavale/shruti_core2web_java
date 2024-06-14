import java.util.*;

class Pyra7{
        public static void main(String[] s){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter No of rows:");
                int row=sc.nextInt();
                int n=1;
		char g=65;
                for(int i=1;i<=row;i++){
                        for(int j=row;j>i;j--){
                                System.out.print("\t");
                        }
                        for(int j=1;j<=i*2-1;j++){
				if(i%2==0)
                                System.out.print(g+"\t");
				else
                                System.out.print(n+"\t");

                        }
			n++;
			g++;

                                System.out.println();
                }
        }
}
