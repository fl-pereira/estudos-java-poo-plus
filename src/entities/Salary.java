package entities;

public class Salary {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary(double tax) {
		return grossSalary - tax;
	}

}
