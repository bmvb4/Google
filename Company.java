package DR8Zad1;

public class Company {
	private String strName;
    private String strDepartment;
    private double strSalary;

    public Company(String name, String department, double salary) {
        this.strName = name;
        this.strDepartment = department;
        this.strSalary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.strName, this.strDepartment, this.strSalary);
    }
}
