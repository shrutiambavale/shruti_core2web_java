
class Strin{
	public static void main(String[] S){
		
		String s1="Badhe";

		String s2="Rahul";
		String s3=new String("BadheRahul");
		
		
		String s4=s1+s2;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		

		
	}
}
