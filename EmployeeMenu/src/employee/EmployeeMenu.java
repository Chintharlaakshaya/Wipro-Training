package employee;

public class EmployeeMenu {
    EmployeePersonalDetails personal;
    EmployeeProfessionalDetails professional;
    EmployeeSalaryDetails salary;
    EmployeeLeavesDetails leaves;
    EmployeeProjects projects;

    public EmployeeMenu(EmployeePersonalDetails personal,
                        EmployeeProfessionalDetails professional,
                        EmployeeSalaryDetails salary,
                        EmployeeLeavesDetails leaves,
                        EmployeeProjects projects) {
        this.personal = personal;
        this.professional = professional;
        this.salary = salary;
        this.leaves = leaves;
        this.projects = projects;
    }

    public void displayEmployeePersonalDetails() {
        personal.displayEmployeePersonalDetails();
    }

    public void displayEmployeeProfessionalDetails() {
        professional.displayEmployeeProfessionalDetails();
    }

    public void displayEmployeeSalaryDetais() {
        salary.displayEmployeeSalaryDetais();
    }

    public void displayEmployeeLeavesDetails() {
        leaves.displayEmployeeLeavesDetails();
    }

    public void displayEmployeeProjects() {
        projects.displayEmployeeProjects();
    }
}
