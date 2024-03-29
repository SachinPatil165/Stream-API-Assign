package assi_9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = Arrays.asList("Sachin", "Abhi", "Rohit");
		System.out.println(l);
		List<String> c = l.stream()
				.sorted((I1, I2) -> (I1.length() > I2.length()) ? 1 : (I1.length() < I2.length()) ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println("Given List Sorted By the Length : " + c);
	}

}
