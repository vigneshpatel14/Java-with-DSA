package EmployeeManagementSystem;

public class Employee {
    private String EmployeeName;
    private String EmployeeId;
    private double Salary;
    private int YearsOfExperience;

    public Employee(String employeeName , String employeeId , double salary , int yearsOfExperience)
    {
        this.EmployeeId = employeeId;
        this.EmployeeName = employeeName;
        setSalary(salary);
        setYearsOfExperience(yearsOfExperience);
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public String getEmployeeID() {
        return EmployeeId;
    }

    public double getSalary() {
        return Salary;
    }

    public int getYearsOfExperience() {
        return YearsOfExperience;
    }


    public void setSalary(double salary)
    {
        if(salary < 0)
        {
            throw new IllegalArgumentException("Salary Negative ela untadi bro chusko");
        }
        this.Salary = salary;
    }

    public void setYearsOfExperience(int yearsOfExperience)
    {
        if(yearsOfExperience < 0)
        {
            throw new IllegalArgumentException("Experience Negative ela untadi bro chusko");
        }
        this.YearsOfExperience = yearsOfExperience;
    }

    public  void EmployeeInfo()
    {
        System.out.println("Employee Name: " + EmployeeName);
        System.out.println("Employee ID: " + EmployeeId);
        System.out.println("Salary: " + Salary);
        System.out.println("Years of Experience: " + YearsOfExperience + "\n\n");
    }

}

class EmployeeTest
{
    public static void main(String[] args) {
        Employee pip = new Employee("Virat" , "R1" , 27292.0 , 14 );
        Employee pip2 = new Employee("Rohit" , "R2" , 272.0 , 17 );
        Employee pip3 = new Employee("Bumrah" , "R3" , 189386.0 , 12 );


        pip.EmployeeInfo();
        pip2.EmployeeInfo();
        pip3.EmployeeInfo();


    }
}
