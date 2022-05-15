public abstract class Employee implements Payable {
  public String name;
  public String employeeId;
  public double averageMonthlySalary;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return averageMonthlySalary;
  }

  @Override
  public String toString() {
    return name + " " + employeeId + " " + String.format("%.2f", averageMonthlySalary);
  }
}
