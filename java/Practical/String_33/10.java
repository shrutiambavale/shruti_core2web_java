import java.util.*;
class Str10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int b=s.length();
		int c=b-2;
		if(s.isEmpty()){
			System.out.println("String is empty");
		}else{
			System.out.print(s.charAt(c));
	}}
}
