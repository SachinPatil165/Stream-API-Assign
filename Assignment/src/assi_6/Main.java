package assi_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = Arrays.asList(20, 15, 8, 49, 25, 98, 12, 15, 2, 98);
		System.out.println(l);
		List<Integer> c = l.stream().sorted((I1, I2) -> I2.compareTo(I1)).collect(Collectors.toList());
		System.out.println("Given list Sorted by desending Order : " + c);
	}

}
