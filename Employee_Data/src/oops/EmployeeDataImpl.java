package oops;

public class EmployeeDataImpl {
	public static void main(String[] args) {
		EmployeeData emp1=new EmployeeData(101,"Arjun","Java",30000);
		System.out.println(emp1);
		
		EmployeeData emp2=new EmployeeData(102,"Sahadev","Selenium",35000);
		System.out.println(emp2);
		
		EmployeeData emp3=new EmployeeData(103,"Bhim","Python",40000);
		System.out.println(emp3);
		
		EmployeeData emp4=new EmployeeData(104,"Yudhister","Dot Net",39000);
		System.out.println(emp4);
		
		EmployeeData emp5=new EmployeeData(105,"Nakul","C++",20000);
		System.out.println(emp5);
		
		EmployeeData employee=new EmployeeData();
		//1
		employee.setId(106);
		employee.setName("Kunthi");
		employee.setDept("Cloud");
		employee.setSal(28000);
		
		System.out.println("Displaying using Setters getters");
		System.out.println("Name: " + employee.getId());
	    System.out.println("Age: " + employee.getName());
	    System.out.println("Dept: " + employee.getDept());
	    System.out.println("Age: " + employee.getSal());
	    System.out.println();
	    
	    //2
	    employee.setId(107);
		employee.setName("Subadhra");
		employee.setDept("WEB");
		employee.setSal(29000);
		
		System.out.println("Name: " + employee.getId());
	    System.out.println("Age: " + employee.getName());
	    System.out.println("Dept: " + employee.getDept());
	    System.out.println("Age: " + employee.getSal());
	    //3
	    employee.setId(108);
		employee.setName("Subala");
		employee.setDept("WEB");
		employee.setSal(29000);
		
		System.out.println("Name: " + employee.getId());
	    System.out.println("Age: " + employee.getName());
	    System.out.println("Dept: " + employee.getDept());
	    System.out.println("Age: " + employee.getSal());
	    System.out.println();
	    
	    //4
	    employee.setId(109);
		employee.setName("Sushila");
		employee.setDept("backend");
		employee.setSal(29000);
		
		System.out.println("Name: " + employee.getId());
	    System.out.println("Age: " + employee.getName());
	    System.out.println("Dept: " + employee.getDept());
	    System.out.println("Age: " + employee.getSal());
	    System.out.println();
		//5
	    employee.setId(109);
		employee.setName("Sushmitha");
		employee.setDept("backend");
		employee.setSal(29000);
		
		System.out.println("Name: " + employee.getId());
	    System.out.println("Age: " + employee.getName());
	    System.out.println("Dept: " + employee.getDept());
	    System.out.println("Age: " + employee.getSal());
		
		
	}

}
