import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Dates {
public static void main(String[] args) {
	LocalDate ld = LocalDate.of(2019, 3, 12);
	System.out.println(ld.plusDays(4));
	System.out.println(ld);
	ArrayList<String> al = new ArrayList <> ();
	System.out.println(al.size());
	al.add("2");
	System.out.println(al.size());
	ArrayList<String> al1 = new ArrayList <>(Arrays.asList("1", "test"));
	System.out.println(al1.size());
	al1.toArray(new String[5]);
	System.out.println(al1);
	System.out.println(al1.toString());
	System.out.println(al1.isEmpty());
/*	if (al1.isEmpty()) {
		System.out.println("first"); } else {
			System.out.println("second");
	}*/
	String s1 = "java";
	StringBuilder s2 = new StringBuilder("java");
	
	if (s1.equals(s2))
		System.out.print("2");
	}
}