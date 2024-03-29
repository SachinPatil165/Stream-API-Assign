package assi_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = Arrays.asList(2, 5, 6, 4, 8, 3, 1, 7);
		System.out.println(l);
		List<Integer> c = l.stream().filter((I -> (I * I * I) > 50)).collect(Collectors.toList());
		System.out.println("Given List After cube Grether then 50 element are : " + c);
	}

}
