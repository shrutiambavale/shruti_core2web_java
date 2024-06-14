import java.util.*;
class Str2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1:");
		String s1=sc.next();
		System.out.println("Enter String2:");
		String s2=sc.next();
		String s3=s1+s2;
		System.out.println("Concated String:"+s3);
		System.out.println("Length is:"+s3.length());
	}
}
