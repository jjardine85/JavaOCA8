import java.util.Arrays;

public class ArrayDemo{
	public static void main(String[] args){
		System.out.println(args);
		System.out.println(Arrays.toString(args));
		Arrays.sort(args);
		System.out.println(args);
		System.out.println(Arrays.binarySearch(args, "jest"));
	}
}