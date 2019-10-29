import java.util.function.Predicate;
import java.util.Arrays;
import java.util.*;

public class Filter {
	public static void main(String[] args){
		print(Arrays.asList(args), s -> s.length() > 3);
		print(Arrays.asList(args), s -> s.startsWith("a"));
	}
	
	public static void print(List<String> list, Predicate<String> predicate){
		for(String s : list){
			if(predicate.test(s)){
				System.out.println(s);
			}
		}
	
	}
	
}