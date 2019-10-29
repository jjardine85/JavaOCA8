public class Primitive {
public static void main(String[] args){
	byte b = 127;
	short s = 32000;
	int i = 9000000;
	long l = 9000000000000000000L;
	String ss = "S\u00ED Se\u00F1or";
	b = (byte) (b+5);
	System.out.println(b);
	System.out.println(s * 411);
	System.out.println(i);
	System.out.println(l);
	System.out.println(ss);
}
}