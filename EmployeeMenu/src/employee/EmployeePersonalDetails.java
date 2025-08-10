package employee;

public class EmployeePersonalDetails {
    String name;
    int age;
    String gender;
    Long mobile;
    String address;

    public EmployeePersonalDetails(String name, int age, String gender, Long mobile, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;
        this.address = address;
    }

    void displayEmployeePersonalDetails() {
        System.out.println("\nEmployee Personal Details:");
        System.out.println("Name            : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Gender          : " + gender);
        System.out.println("Contact Number  : " + mobile);
        System.out.println("Address         : " + address);
    }
}
