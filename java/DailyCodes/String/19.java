
class Strin{
	public static void main(String[] S){
		
		String s1="Shruti";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		String s2=new String("Shruti");
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));

		
	}
}
