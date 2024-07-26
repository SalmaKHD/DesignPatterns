package structural.composite;

public class Company {
    public static void main(String[] args) {
        Employee emp = new Developer(100, "Jason", "Pro Developer");
        Employee emp2 = new Developer(2, "Mariys", "Entry Level Developer");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(emp);
        engDirectory.addEmployee(emp2);

        Employee man1 = new Manager(200, "Jennifer", "SEO");
        Employee man2 = new Manager(300, "Son", "Entry");
        Directory mandDirectory = new Directory();
        mandDirectory.addEmployee(man1);
        mandDirectory.addEmployee(man2);

        // now create a bigger hierarchy
        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(mandDirectory);
        companyDirectory.showEmloyeeDetails();
        /*
        OUTPUT:
        Something...
        Something...
        Something...
        Something...
        */
    }
    
}
