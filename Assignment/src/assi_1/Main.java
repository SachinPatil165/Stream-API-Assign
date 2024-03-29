package assi_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 2, 30);
		System.out.println(l);
		List<Integer> c = l.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println("Given List Even element is : " + c);

	}

}
