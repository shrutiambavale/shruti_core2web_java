class While2{
	public static void main(String[] s){
		int n=2569185;
		int t=n;
		int r=1;
		int sq=0;
		System.out.print("");
		while(t>0){
			r=t%10;
			if(r%2==1){
				sq=r*r;
				System.out.print(sq+" ");
			}t=t/10;
		}
	}
}
