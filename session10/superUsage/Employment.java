package ro.siit.session10.superUsage;

public class Employment {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new Employee("Full time", 1000.0);
        System.out.println(fullTimeEmployee.getName() + ":" + fullTimeEmployee.getSalary());

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Part Time", 1000.0, 1.0/3);
        System.out.print(partTimeEmployee.getName() + ":" + String.format("%.2f",partTimeEmployee.getSalary()));
    }
}

class Employee {
    private String name;
    private Double fullTimeSalary;
    public Employee(String name, Double salary) {
        this.name = name;
        this.fullTimeSalary = salary;
    }

    public Double getSalary(){
        return fullTimeSalary;
    }

    public String getName() {
        return name;
    }
}
class PartTimeEmployee extends Employee {
    private Double ratio;
    public PartTimeEmployee(String name, Double salary, Double ratio) {
        super(name, salary);
        this.ratio = ratio;
    }

    @Override
    public Double getSalary() {
        // return fullTimeSalary / 2;
        return super.getSalary() * ratio;
    }
}
