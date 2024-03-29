package assig_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = Arrays.asList(20, 15, 8, 49, 25, 98, 12, 15, 2, 98, 20);
		System.out.println(l);
	List<Integer> c = l.stream().filter(I->I.equals(I)).distinct().collect(Collectors.toList());
		System.out.println("Given List Duplicate Element is : "+c );
	}

}
