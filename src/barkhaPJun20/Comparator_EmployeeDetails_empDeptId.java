package barkhaPJun20;

import java.util.Comparator;

public class Comparator_EmployeeDetails_empDeptId implements Comparator <Comparator_EmployeeDetails> {

	@Override
	public int compare(Comparator_EmployeeDetails o1, Comparator_EmployeeDetails o2) {
		if (o1.getDeptId() == o2.getDeptId())
			return 0;
		else if (o1.getDeptId() < o2.getDeptId())  // ">" will give ascending order and "<" will give descending order
			return 1;
		else
			return -1;
	}
}