import java.util.*;
class Str4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1:");
		String s1=sc.next();
		System.out.println("Enter String2:");
		String s2=sc.next();
		if(s1.equals(s2)){
			System.out.println("Output: 0");
		}else{
			System.out.println("Output:"+s1.compareTo(s2));
		}

	}
}
