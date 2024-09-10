import java.util.Objects;

public class Employee {
    private String nameEmployee;
    private int department;
    private double salary;
    private int id;
    private static int count = 0;

    public Employee(String nameEmployee, int department, double salary) {
        this.nameEmployee = nameEmployee;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }


    public String getNameEmployee() {
        return this.nameEmployee;
    }


    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return "Сотрудник" +
                " " + nameEmployee + ' ' +
                ", Отдел " + department +
                ", Зарплата " + salary +
                " рублей" +
                ' ';
    }
}
