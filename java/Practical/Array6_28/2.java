import java.util.*;
class Arr2{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		int sum=0;
                System.out.println( );
                for(int i=0;i<s;i++){
                int t=1;
                int c=0;
                        while(arr[i]>=t){
                                if(arr[i]%t==0){
                                c++;

                                }
                        t++;


                }if(c<=2){
			sum=sum+arr[i];
			count++;
                        System.out.println(arr[i]+",");

                }
		}
				System.out.println("Sum of prime No:"+sum);
				System.out.println("Count of prime No:"+count);

	}
}

