package Assi_4;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(20,15,8,49,25,98,12,15,2,98);
		System.out.println(l);
		long c = l.stream().count();
		System.out.println("Total Element present in List is : "+c);
	}

}
