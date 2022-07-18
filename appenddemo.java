class appenddemo{
public static void main(String arg[]){
	StringBuffer s1 = new StringBuffer("BCA");
	StringBuffer s2 = new StringBuffer("MCA");
	StringBuffer s3;
	s3 = s1.append(s2);
	System.out.println( " "+s3);
}
}

