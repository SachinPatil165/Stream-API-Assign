package Assi_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>l=Arrays.asList(20,15,8,49,25,98,12,15,2,98);
		System.out.println(l);
		List<Integer> c = l.stream().sorted((I1,I2)->I1.compareTo(I2)).collect(Collectors.toList());
	
		System.out.println("Given List Sorted by Accending order : "+c);
	}

}
