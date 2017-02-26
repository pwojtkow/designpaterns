
public class EmployeeDecorator extends Employee{

	Employee decorator = new EmployeeImpl();
	
	public EmployeeDecorator(Employee employee) {
		decorator.addEmployee(employee);
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	
	
}
