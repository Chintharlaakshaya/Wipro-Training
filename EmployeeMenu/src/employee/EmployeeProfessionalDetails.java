package employee;

public class EmployeeProfessionalDetails {
    String department;
    String designation;
    int yearsOfExperience;
    String company;
    String location;

    public EmployeeProfessionalDetails(String department, String designation, int yearsOfExperience, String company, String location) {
        this.department = department;
        this.designation = designation;
        this.yearsOfExperience = yearsOfExperience;
        this.company = company;
        this.location = location;
    }

    void displayEmployeeProfessionalDetails() {
        System.out.println("\nEmployee Professional Details:");
        System.out.println("Department         : " + department);
        System.out.println("Designation        : " + designation);
        System.out.println("Experience         : " + yearsOfExperience + " years");
        System.out.println("Company Name       : " + company);
        System.out.println("Work Location      : " + location);
    }
}
