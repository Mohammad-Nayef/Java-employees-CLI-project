public class Employee {
    private String name;
    private Date hireDate;
    private double monthlySalary;

    public Employee() {

    }

    public Employee(String name, Date hireDate, double monthlySalary) {
        this.name = name;
        this.hireDate = hireDate;
        setMonthlySalary(monthlySalary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0)
            this.monthlySalary = monthlySalary;
    }

    public String getEmployeeInfo() {
        return "Employee name: " + name + "\nHire Date: "
        + hireDate + "\nMonthly salary: " + monthlySalary;
    }
}
