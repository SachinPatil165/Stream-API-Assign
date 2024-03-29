package assi_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = Arrays.asList(20, 15, 8, 49, 25, 98, 12, 2, 130);
		System.out.println(l);
		List<Integer> c = l.stream().filter(I -> I.toString().startsWith("1")).collect(Collectors.toList());
		System.out.println("Given List Starting 1 Element is : " + c);
	}

}
