package employee;

public class EmployeeSalaryDetails {
    double salaryPerAnnum;
    double salaryPerMonth;
    double pfAmount;
    double cabAllowance;
    double healthAllowance;

    public EmployeeSalaryDetails(double salaryPerAnnum, double salaryPerMonth, double pfAmount, double cabAllowance, double healthAllowance) {
        this.salaryPerAnnum = salaryPerAnnum;
        this.salaryPerMonth = salaryPerMonth;
        this.pfAmount = pfAmount;
        this.cabAllowance = cabAllowance;
        this.healthAllowance = healthAllowance;
    }

    void displayEmployeeSalaryDetais() {
        System.out.println("\nEmployee Salary Details:");
        System.out.println("Annual Salary       : " + salaryPerAnnum);
        System.out.println("Monthly Salary      : " + salaryPerMonth);
        System.out.println("PF Amount           : " + pfAmount);
        System.out.println("Cab Allowance       : " + cabAllowance);
        System.out.println("Health Allowance    : " + healthAllowance);
    }
}
