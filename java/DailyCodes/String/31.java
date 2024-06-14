
class Strin{
	public static void main(String[] S){
		
		String s1="Rohit";

		String s2=s1;
		String s3=new String("virat");
		
		
		String s4=s3;
		String s5=new String(s1);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		

		
	}
}
