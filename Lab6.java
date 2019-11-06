import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class EmpCreate {
	public static List<Emp> getData() {
		List<Emp> list = new ArrayList<Emp>();
		List<String> names = Arrays.asList("Simran", "saloni", "Vaishali", "Vishal", "Usha");
		List<String> depts = Arrays.asList("HR", "Training", "Finance", "Admin");

		for (int i = 0; i < 10000; i++) {
			Emp e = new Emp();
			e.setEmpno(i);
			e.setEname(names.get(i % names.size()));
			e.setSalary(i*10);
			e.setDeptno(depts.get(i % depts.size()));
			list.add(e);
		}
		return list;
	}
}

public class Lab6 {

	public static void main(String[] args) {
		List<Emp> list = EmpCreate.getData();
		//list.forEach(System.out::println);
		System.out.println("----Sorting based on Dept name ------");
		list.stream().sorted((x,y)-> x.getDeptno().compareTo(y.getDeptno())).forEach(System.out::println);
		System.out.println("\n\n----Sorting based on emp name ------");
		list.stream().sorted((x,y)->x.getEname().compareTo(y.getEname())).forEach(System.out::println);
		System.out.println("\n\n----Sorting based on Salary ------");
		//list.stream().sorted((x,y)-> x.getSalary() > y.getSalary()).forEach(System.out::println);
		
		Predicate<Emp> pred1 = (e) -> e.getSalary() > 30;
		Predicate<Emp> pred2 = e -> e.getDeptno().equals("Finance") && e.getEname().startsWith("s");
		list.stream().filter(pred1).forEach(System.out::println);
		System.out.println("\n\n");
		list.stream().filter(pred2).forEach(System.out::println);
		
		//get total of all salaries
		//double sum = list.stream().map(e->e.getSalary()).reduce((d1,d2)->d1+d2).get();
		double sum = list.stream().mapToDouble(e->e.getSalary()).sum();
		System.out.println("Sum of Salaries = "+sum);
		
		//get total of salaries where deptno is HR
		double hrSalSum = list.stream().filter(e -> e.getDeptno().equals("HR")).mapToDouble(e->e.getSalary()).sum();
		System.out.println("Sum of HR Salaries = "+hrSalSum);
		
		//Total number of Employees
		System.out.println("Count = "+list.stream().count());
		
		//get total no of employye where name contains "sha"
		System.out.println("Count with SHA "+list.stream().filter(e->e.getEname().contains("sha")).count());
		
		//Total of salaries per dept
	}

}
