package demo8;

import java.util.ArrayList;
import java.util.List;

public class DeptManager {
	private List<Dept> list = new ArrayList<>();

	public void create(Dept d) {
		this.list.add(d);
	}

	public List<Dept> getlist() {
		return list;
	}

	public void delete(int deptno) {
		/*
		 * for (int i = 0;i< list.size();i++) { if (list.get(i).getDeptno() ==
		 * deptno) { list.remove(list.get(i)); break; } }
		 */
		list.removeIf((x) -> x.getDeptno() == deptno);
	}

	public void update(Dept newDept) {
		/*
		 * for (int i = 0;i< list.size();i++) { if (list.get(i).getDeptno() ==
		 * newDept.getDeptno()) { list.set(i,newDept);
		 * System.out.println("Update " + newDept); break; } }
		 */
		list.replaceAll((d) -> {
			if (d.getDeptno() == newDept.getDeptno())
				return newDept;
			else
				return d;
		});
	}

	public static void main(String[] args) {
		DeptManager mgr = new DeptManager();
		for (int i = 1; i <= 10; i++) {
			Dept d = new Dept();
			d.setDeptno(i);
			d.setDname("Nameof" + i);
			if ((i % 2) == 0)
				d.setLoc("BLR");
			else
				d.setLoc("Hyd");
			mgr.create(d);
		}
		mgr.create(new Dept(5, "VVV", "BBB"));
		mgr.delete(5);
		Dept d = new Dept(1, "HR", "Pune");
		mgr.update(d);

		for (Dept dept : mgr.getlist()) {
			System.out.println(dept);
		}
	}

}