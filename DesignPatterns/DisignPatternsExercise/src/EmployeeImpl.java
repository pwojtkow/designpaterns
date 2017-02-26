import java.util.List;
import java.util.ArrayList;

public class EmployeeImpl extends Employee {

	private String name;
	private List<Employee> employees = new ArrayList<Employee>(0);
	
	@Override
	public void print() {
		System.out.println(name);
		
		for (Employee e : employees) {
			System.out.println(e.getName());
		}
		
	}

	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	

	
	
}
