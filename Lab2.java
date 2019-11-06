import java.util.ArrayList;
import java.util.List;

public class Lab2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 50000; i++) {
			list.add((int) (i * Math.random()));
		}

		long startTime = System.currentTimeMillis();

		/*
		 * for (Integer num : list) { if (num >= 15000 && num <= 18000)
		 * System.out.println(num); }
		 */

		list.stream().filter(num -> num >= 15000 && num <= 18000).forEach(System.out::println);

		long endTime = System.currentTimeMillis();
		System.out.println("Time Taken for execution = " + (endTime - startTime));
	}

}
