package oops;

public class EmployeeData {
	
	private int id;
	private String name;
	private String dept;
	private double sal;
	
	//default constructor
	public EmployeeData() {
		System.out.println("Am a default constructor");
	}
	//constructor with fields

	public EmployeeData(int id, String name, String dept, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
	
	//getters setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + "]";
	}
	
	
	
	
	
	

}
