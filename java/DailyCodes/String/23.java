
class Strin{
	public static void main(String[] S){
		
		String s1="s";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		String s2="s1";
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
		String s3=new String("s");
		System.out.println(s2);
		System.out.println(System.identityHashCode(s3));
		String s4=new String("s");
		System.out.println(s2);
		System.out.println(System.identityHashCode(s4));
		

		
	}
}
