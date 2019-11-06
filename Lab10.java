import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Lab10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press int to continue");
		sc.nextInt();
		List<Emp> list = EmpCreate.getData();
		System.out.println("\n\n");
		Predicate<Emp> pred1 = e -> e.getSalary() > 300;
		Predicate<Emp> pred2 = e -> e.getDeptno().equals("Finance") && e.getEname().startsWith("s");
		long st = System.currentTimeMillis();
		
		list.parallelStream().filter(pred1).forEach(System.out::println);
		
		//list.stream().filter(pred2).forEach(System.out::println);
		long et = System.currentTimeMillis();
		
		System.out.println("Timetaken for e -> e.getSalary() > 300 = "+ (et-st));
		
		System.out.println("Timetaken for e -> e.getDeptno().equals(Finance) && e.getEname().startsWith(s) = "+ (et-st));

		sc.close();
	}

}
