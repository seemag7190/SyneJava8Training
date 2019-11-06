import java.util.ArrayList;
import java.util.List;

public class Lab3 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 50; i++) {
			list.add("Str" + i);
		}

		System.out.println("Find First = " + list.stream().findFirst().get());

		list.stream().filter(x -> x.length() >= 5).peek(System.out::println).findAny().get();
		list.stream().filter(x -> x.length() >= 5).peek(x -> System.out.println("in find any peek " + x)).findAny()
				.get();

		System.out.println("\n\n");
		list.stream().filter(x -> x.length() >= 5).peek(System.out::println)
				.forEach(x -> System.out.println("in foreach " + x));
	}
}
