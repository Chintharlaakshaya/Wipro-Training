package employee;

public class EmployeeLeavesDetails {
    int totalLeaves;
    int earnedLeaves;
    int casualLeaves;
    int sickLeaves;
    int balanceLeaves;

    public EmployeeLeavesDetails(int totalLeaves, int earnedLeaves, int casualLeaves, int sickLeaves) {
        this.totalLeaves = totalLeaves;
        this.earnedLeaves = earnedLeaves;
        this.casualLeaves = casualLeaves;
        this.sickLeaves = sickLeaves;
        this.balanceLeaves = totalLeaves - (earnedLeaves + casualLeaves + sickLeaves);
    }

    void displayEmployeeLeavesDetails() {
        System.out.println("\nEmployee Leave Details:");
        System.out.println("Total Leaves        : " + totalLeaves);
        System.out.println("Earned Leaves       : " + earnedLeaves);
        System.out.println("Casual Leaves       : " + casualLeaves);
        System.out.println("Sick Leaves         : " + sickLeaves);
        System.out.println("Balance Leaves      : " + balanceLeaves);
    }
}
