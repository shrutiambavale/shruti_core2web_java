

class IntegerCache{
	public static void main(String[] S){
		int x=10;
		
		int y=10;
	//	System.out.println(System.identityHashCode(ch2));
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		y=20;	
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}
