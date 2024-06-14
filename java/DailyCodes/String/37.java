
class Strin{
	public static void main(String[] S){
		
		String s1="Kanha";

		String s2="Aahish";
		
		String s3=new String("Kanha");
		
		String s4="KanhaAshish";
	
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		

		
	}
}
