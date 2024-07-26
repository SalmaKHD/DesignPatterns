package structural.composite;

// component class
public interface Employee {
    public void showEmloyeeDetails();
}

// leaf nodes
class Developer implements Employee {
    private String name;
    private long employeeId;
    private String position;

    public Developer(long empId, String name, String position) {
        this.employeeId = empId;
        this.name = name;
        this.position = position;
    }
    @Override
    public void showEmloyeeDetails() {
        System.out.println("Something...");
    }
}

class Manager implements Employee {
    private String name;
    private long employeeId;
    private String position;

    public Manager(long empId, String name, String position) {
        this.employeeId = empId;
        this.name = name;
        this.position = position;
    }
    @Override
    public void showEmloyeeDetails() {
        System.out.println("Something...");
    }
}
