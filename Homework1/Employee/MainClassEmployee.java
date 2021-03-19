package Employee;

public class MainClassEmployee {
    public static void main(String[] args) {
    Employee employee=new Employee(1,"Ivan","Netreba",20000);
        System.out.println(employee);
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(120));

    }
}
