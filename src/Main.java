import java.util.Arrays;

public class Main {
    public static Employee[] employees = new Employee[10];

    public static double paymentsPerMonth(Employee[] employees) {
        double result = 0;
        for (double i = 0; i < employees.length; i++) {
            Employee employee = employees[(int) i];
            if (employee != null) {
                result = result + employee.getSalary();
            }
        }
        return result;
    }

    public static Employee minSalaryEmployee() {
        Employee minSalaryEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && (minSalaryEmployee == null || minSalaryEmployee.getSalary() > employees[i].getSalary())) {
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee;
    }

    public static Employee maxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && (maxSalaryEmployee == null || maxSalaryEmployee.getSalary() < employees[i].getSalary())) {
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }

    public static void name() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getNameEmployee());
        }

    }


    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 20000.0);
        employees[1] = new Employee("Иванова Инна Ивановна", 2, 25000.0);
        employees[2] = new Employee("Сидоров Иван Иванович", 3, 35000.0);
        employees[3] = new Employee("Сидоров Иван Вазгенович", 5, 35000.0);
        employees[4] = new Employee("Петров Петр Семенович", 4, 15000.0);
        employees[5] = new Employee("Глуховский Геннадий Сергеевич", 5, 10000.0);
        employees[6] = new Employee("Тьма Инга Павловна", 1, 40000.0);
        employees[7] = new Employee("Дым Виктор Петрович", 2, 30000.0);
        employees[8] = new Employee("Губа Людмила Викторовна", 3, 50000.0);
        employees[9] = new Employee("Степанова Виктория Алексеевна", 4, 70000.0);

        System.out.println("**Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString))**");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("**Посчитать сумму затрат на ЗП в месяц**");
        System.out.println("Сумма затрат на ЗП в месяц состовляет = " + paymentsPerMonth(employees) + " рублей");

        System.out.println("**Найти сотрудника с минимальной ЗП**");
        System.out.println("Сотрудником с минимальной ЗП является -- " + minSalaryEmployee());

        System.out.println("**Найти сотрудника с максимальной ЗП**");
        System.out.println("Сотрудник с максимальной ЗП является -- " + maxSalaryEmployee());

        System.out.println("**Подсчитать среднее значение зарплат**");
        System.out.println("Среднее значение ЗП составляет = " + paymentsPerMonth(employees) / employees.length + " рублей");

        System.out.println("**Распечатать ФИО всех сотрудников**");
        name();


    }
}
