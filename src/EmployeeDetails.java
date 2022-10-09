
public abstract class EmployeeDetails {
	private String name;
	private int e_ID;
	
	public EmployeeDetails(String name, int id) {
		this.name = name;
		e_ID = id;
	}
	public void commonEmpDetails() {
		System.out.println("Name: " + name);
		System.out.println("E_ID: " + e_ID);
	}
	
	public abstract void confidentialDetails(double salary, String performance);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
