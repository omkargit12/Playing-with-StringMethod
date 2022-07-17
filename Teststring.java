import java.util.*;
class Teststring{
public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string = ");
	String s = sc.nextLine();
	System.out.println(s);
	int l = s.length();
	int count = 0;
	for(int i = 0 ; i<l ; i++){
		char str = s.charAt(i);
		if(str=='A' || str=='a' || str=='E' || str=='e' || str=='I' || str=='i' || str=='O' || str=='o' || str=='U' || str=='u'){
		count++;}}
	System.out.println(count);
}
}

