package structural.composite;

import java.util.ArrayList;
import java.util.List;

// composite
public class Directory implements Employee {
    // it is an employee, but it contains a list of employees in fact
    private List<Employee> empList = new ArrayList<Employee>();

    @Override
    public void showEmloyeeDetails() {
        for(Employee emp : empList) {
            emp.showEmloyeeDetails();
        }
    }

    public void addEmployee(Employee emp) {
        empList.add(emp);

    }

    public void removeEmployee(Employee emp) {
        empList.remove(emp);
    }
}
