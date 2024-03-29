package assi_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = Arrays.asList("one", "two", "three", "four", "five", "six");
		System.out.println(l);
		List<String> c = l.stream().map(I -> I.toUpperCase()).collect(Collectors.toList());
		System.out.println("Given String After Convert UpperCase : " + c);
	}

}
