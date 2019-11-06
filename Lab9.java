import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab9 {

	public static void main(String[] args) {
		List<Emp> list = EmpCreate.getData();
		
		list.stream().map(e->e.getDeptno()).distinct().forEach(System.out::println);
		list.stream().map(e->e.getEname()).distinct().forEach(System.out::println);
		
		Map<String,List<Emp>> byDept = list.stream().collect(Collectors.groupingBy(Emp::getDeptno));
		byDept.forEach((s,l)->{
			System.out.println(s);
			System.out.println("\t\t"+l);
		});
		
		//name of the department and count of employees working in same
		Map<String,Long> totalByDept = list.stream().collect(Collectors.groupingBy(Emp::getDeptno,Collectors.counting()));
		System.out.println(totalByDept);
		
		//name of the department and sum of salaries working in same
		Map<String,Double> totalSalByDept = list.stream().collect(Collectors.groupingBy(Emp::getDeptno,Collectors.summingDouble(Emp::getSalary)));
		System.out.println(totalSalByDept);
		
		//name of employee and count of employee with same name'
		Map<String,Long> noOfEmpPerName = list.stream().collect(Collectors.groupingBy(Emp::getEname,Collectors.counting()));
		System.out.println(noOfEmpPerName);
	}
	

}
