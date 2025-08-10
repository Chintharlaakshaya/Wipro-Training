package employee;

public class EmployeeProjects {
    String[] projects;

    public EmployeeProjects(String[] projects) {
        this.projects = projects;
    }

    void displayEmployeeProjects() {
        System.out.println("\nEmployee Projects Undertaken:");
        for (int i = 0; i < projects.length; i++) {
            System.out.println((i + 1) + ". " + projects[i]);
        }
    }
}
