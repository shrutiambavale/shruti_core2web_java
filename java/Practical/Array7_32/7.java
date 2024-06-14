import java.util.*;
class Arr7{
        public static void main(String[] S){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Rows: ");
                int s=sc.nextInt();
                System.out.println("Enter Columns: ");
                int s1=sc.nextInt();
                int arr[][]=new int[s][s1];
                System.out.println("Enter Elements: ");
                for(int i=0;i<s;i++){
			for(int j=0;j<s1;j++){
                        arr[i][j]=sc.nextInt();
                }
		}
        	int a=0;
        	int b=1;
                for(int i=0;i<s;i++){
			for(int j=0;j<s1;j++){
				if(i==j){
					b=b*arr[i][j];
				}
      		}
      
		}System.out.println("Product of Primary diagonal:"+b);
	}

}
