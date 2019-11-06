import java.util.List;
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		List<Emp> list = EmpCreate.getData();
		list.forEach(System.out::println);

		int limitint = 10;
		int skipint = 0;

		while (true) {
			list.stream().skip(skipint).limit(limitint).forEach(System.out::println);
			Scanner sc = new Scanner(System.in);
			System.out.println("Press N to Next, P to Prevous and X to Exit");
			String s = sc.nextLine();
			if (s.equalsIgnoreCase("n"))
				skipint += limitint;
			if (s.equalsIgnoreCase("p"))
				skipint -= limitint;
			if (s.equalsIgnoreCase("x"))
				break;

		}

	}

}
