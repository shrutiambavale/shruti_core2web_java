import java.util.*;
class Arr9{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		} int p=1;
                int v=0;
		 int c=0;
		 int rem=1;
                for(int i=0;i<s;i++){
                        int t=arr[i];
			p=arr[i];
			v=0;
			while(t>0){
				rem=t%10;
				v=v*10+rem;
				t=t/10;
			}
                if(p==v){
                        c++;
                }
		}System.out.println("Count of palindrome number is: "+c);
	}
}


