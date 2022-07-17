import java.util.*;
class Reversestring{
public static void main(String arg[]){
	Scanner sc  = new Scanner(System.in);
	String s1 = " ";
	System.out.print("Enter the string =");
	String st = sc.nextLine();
	System.out.println("string before reversing = " + st);
	int l = st.length();
	for( int i = l-1 ; i >= 0 ; i--){
		char t = st.charAt(i);
		s1 =  s1 + t;
	}
System.out.println("String after the reversing = " + s1 );
} 
}

		