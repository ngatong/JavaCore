package employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int persent = 12;
        ArrayList<Employee> employee = new ArrayList();
        employee.add(new Employee(1, "Nga", "Tống", 10000000));
        employee.add(new Employee(2, "Phương", "Mai", 10000000));
        employee.add(new Employee(3, "Ngọc", "Hà", 10000000));
        employee.add(new Employee(4, "Nguyễn", "Lê", 10000000));

        System.out.printf("Thông tin nhân viên: \n");
        System.out.printf("ID  Name           Salary      AnnualSalary            raiseSalary\n");
        for (Employee emp : employee) {
            System.out.printf(emp.toSing() + "           " + emp.raiseSalary(persent)+"\n");
        }
    }
}
