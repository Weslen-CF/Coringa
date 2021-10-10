package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<?> coringa = Arrays.asList(5, 4, 3);
		printList(coringa);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
