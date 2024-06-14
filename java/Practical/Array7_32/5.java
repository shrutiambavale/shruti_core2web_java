import java.util.*;
class Arr5{
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
        	int c=0;
        	int d=0;
                for(int i=0;i<s;i++){
			for(int j=0;j<s1;j++){
				if(j==0){
				a=a+arr[i][j];
				}else if(j==1){
					c=c+arr[i][j];
				}else if(j==2){
					d=d+arr[i][j];
				}
			}b++;
		}
			System.out.println("sum of col"+1+"="+a);
               		System.out.println("sum of col"+2+"="+c);
               		System.out.println("sum of col"+3+"="+d);
			
      	
      
	}

}
