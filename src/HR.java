
public class HR extends EmployeeDetails {
	public HR(String name, int id) {
		super(name, id);
	}
	
	private double salary;
	private String performance;

	public static void main(String[] args) {
		HR hr = new HR("John", 1);
		hr.commonEmpDetails();
		hr.confidentialDetails(6320.56, "good");		

	}

	@Override
	public void confidentialDetails(double salary, String performance) {
		this.setSalary(salary);
		this.setPerformance(performance);
		System.out.println("Salary: $" + salary);
		System.out.println("Performance: " + performance);
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

}
