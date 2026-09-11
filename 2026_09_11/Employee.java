public class Employee extends Person {
    private int id;
    double salary;

    public Employee(String name, int age, int id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // @Override
    // public String toString() {
    //     return "Employee [id=" + id + ", salary=" + salary + ", getName()=" + getName() + ", getAge()=" + getAge()
    //             + "]";
    // }
    
    
}
